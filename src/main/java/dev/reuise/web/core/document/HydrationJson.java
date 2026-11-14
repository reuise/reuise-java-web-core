package dev.reuise.web.core.document;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * JSON-compatible public data transferred to the browser. Objects have string keys;
 * values may be null, strings, booleans, finite numbers, lists, or maps.
 */
public final class HydrationJson {
    private HydrationJson() {
    }

    public static String encode(Object value) {
        StringBuilder output = new StringBuilder();
        write(value, output, new IdentityHashMap<Object, Boolean>());
        return output.toString();
    }

    private static void write(Object value, StringBuilder output, IdentityHashMap<Object, Boolean> active) {
        if (value == null) {
            output.append("null");
        } else if (value instanceof String) {
            string((String) value, output);
        } else if (value instanceof Boolean) {
            output.append(value);
        } else if (value instanceof Number) {
            Number number = (Number) value;
            double numericValue = number.doubleValue();
            if (Double.isNaN(numericValue) || Double.isInfinite(numericValue))
                throw new IllegalArgumentException("Hydration data cannot contain non-finite numbers");
            String text = number.toString();
            if (!text.matches("-?(0|[1-9][0-9]*)(\\.[0-9]+)?([eE][+-]?[0-9]+)?"))
                throw new IllegalArgumentException("Invalid hydration number: " + text);
            output.append(text);
        } else if (value instanceof Map<?, ?> || value instanceof List<?>) {
            if (active.put(value, Boolean.TRUE) != null)
                throw new IllegalArgumentException("Hydration data cannot contain circular references");
            if (value instanceof Map<?, ?>) {
                output.append('{');
                boolean first = true;
                for (Map.Entry<?, ?> entry : ((Map<?, ?>) value).entrySet()) {
                    if (!(entry.getKey() instanceof String))
                        throw new IllegalArgumentException("Hydration data map keys must be strings");
                    if (!first) output.append(',');
                    first = false;
                    string((String) entry.getKey(), output);
                    output.append(':');
                    write(entry.getValue(), output, active);
                }
                output.append('}');
            } else {
                output.append('[');
                boolean first = true;
                for (Object item : (List<?>) value) {
                    if (!first) output.append(',');
                    first = false;
                    write(item, output, active);
                }
                output.append(']');
            }
            active.remove(value);
        } else {
            throw new IllegalArgumentException("Unsupported hydration data value: " + value.getClass().getName());
        }
    }

    private static void string(String value, StringBuilder output) {
        output.append('"');
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            switch (c) {
                case '"': output.append("\\\""); break;
                case '\\': output.append("\\\\"); break;
                case '\b': output.append("\\b"); break;
                case '\f': output.append("\\f"); break;
                case '\n': output.append("\\n"); break;
                case '\r': output.append("\\r"); break;
                case '\t': output.append("\\t"); break;
                default:
                    if (c < 0x20 || c == '<' || c == '>' || c == '&' || c == '\u2028' || c == '\u2029'
                            || (c >= '\ud800' && c <= '\udfff')) {
                        String hex = Integer.toHexString(c);
                        output.append("\\u");
                        for (int n = hex.length(); n < 4; n++) output.append('0');
                        output.append(hex);
                    } else {
                        output.append(c);
                    }
            }
        }
        output.append('"');
    }

    public static Object decode(String json) {
        if (json == null)
            throw new IllegalArgumentException("Hydration JSON cannot be null");
        Parser parser = new Parser(json);
        Object value = parser.value();
        parser.space();
        if (parser.position != json.length()) throw parser.error();
        return value;
    }

    private static final class Parser {
        private final String json;
        private int position;

        private Parser(String json) {
            this.json = json;
        }

        private IllegalArgumentException error() {
            return new IllegalArgumentException("Invalid hydration JSON at position " + position);
        }

        private void space() {
            while (position < json.length() && Character.isWhitespace(json.charAt(position))) position++;
        }

        private boolean consume(char expected) {
            space();
            if (position < json.length() && json.charAt(position) == expected) {
                position++;
                return true;
            }
            return false;
        }

        private Object value() {
            space();
            if (position == json.length()) throw error();
            char c = json.charAt(position);
            if (c == '"') return readString();
            if (c == '{') return object();
            if (c == '[') return array();
            if (json.startsWith("true", position)) { position += 4; return Boolean.TRUE; }
            if (json.startsWith("false", position)) { position += 5; return Boolean.FALSE; }
            if (json.startsWith("null", position)) { position += 4; return null; }
            int start = position;
            while (position < json.length() && "-+0123456789.eE".indexOf(json.charAt(position)) >= 0) position++;
            String number = json.substring(start, position);
            if (!number.matches("-?(0|[1-9][0-9]*)(\\.[0-9]+)?([eE][+-]?[0-9]+)?")) throw error();
            try {
                if (!number.contains(".") && !number.contains("e") && !number.contains("E")) {
                    try {
                        return Long.valueOf(number);
                    } catch (NumberFormatException ignored) {
                        // Larger JSON numbers are represented as doubles.
                    }
                }
                double result = Double.parseDouble(number);
                if (Double.isInfinite(result) || Double.isNaN(result)) throw error();
                return result;
            } catch (NumberFormatException e) {
                throw error();
            }
        }

        private String readString() {
            if (!consume('"')) throw error();
            StringBuilder result = new StringBuilder();
            while (position < json.length()) {
                char c = json.charAt(position++);
                if (c == '"') return result.toString();
                if (c < 0x20) throw error();
                if (c != '\\') {
                    result.append(c);
                    continue;
                }
                if (position == json.length()) throw error();
                switch (json.charAt(position++)) {
                    case '"': result.append('"'); break;
                    case '\\': result.append('\\'); break;
                    case '/': result.append('/'); break;
                    case 'b': result.append('\b'); break;
                    case 'f': result.append('\f'); break;
                    case 'n': result.append('\n'); break;
                    case 'r': result.append('\r'); break;
                    case 't': result.append('\t'); break;
                    case 'u':
                        if (position + 4 > json.length()) throw error();
                        int code = 0;
                        for (int i = 0; i < 4; i++) {
                            int digit = Character.digit(json.charAt(position++), 16);
                            if (digit < 0) throw error();
                            code = (code << 4) | digit;
                        }
                        result.append((char) code);
                        break;
                    default: throw error();
                }
            }
            throw error();
        }

        private Map<String, Object> object() {
            consume('{');
            Map<String, Object> result = new LinkedHashMap<>();
            if (consume('}')) return result;
            do {
                String key = readString();
                if (!consume(':')) throw error();
                result.put(key, value());
                if (consume('}')) return result;
            } while (consume(','));
            throw error();
        }

        private List<Object> array() {
            consume('[');
            List<Object> result = new ArrayList<>();
            if (consume(']')) return result;
            do {
                result.add(value());
                if (consume(']')) return result;
            } while (consume(','));
            throw error();
        }
    }
}
