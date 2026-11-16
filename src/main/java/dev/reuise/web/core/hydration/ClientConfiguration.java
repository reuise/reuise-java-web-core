package dev.reuise.web.core.hydration;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import dev.reuise.core.State;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ColorScheme;
import dev.reuise.core.Interaction;
import dev.reuise.core.MediaQuery;
import dev.reuise.core.MultiState;

import dev.reuise.web.core.document.HydrationJson;

public final class ClientConfiguration {
    public static final String ATTRIBUTE = "data-reuise-config";
    public static final int SCHEMA = 2;

    private ClientConfiguration() {
    }

    public static Map<String, Object> snapshot(String type, Map<String, Object> options) {
        Map<String, Object> snapshot = new LinkedHashMap<>();
        snapshot.put("schema", SCHEMA);
        snapshot.put("type", type);
        snapshot.put("options", options);
        return snapshot;
    }

    public static Map<String, Object> snapshot(String type, Map<String, Object> options,
            List<Map<String, Object>> states) {
        Map<String, Object> snapshot = snapshot(type, options);
        snapshot.put("states", states);
        return snapshot;
    }

    public static void restore(ClientConfigurationOptions target, String json) {
        if (json == null) return;
        Map<String, Object> snapshot = object(HydrationJson.decode(json), "configuration");
        validateSchema(snapshot);
        String type = string(snapshot.get("type"));
        if (!target.getClientConfigurationType().equals(type))
            throw new IllegalArgumentException("Client configuration type mismatch: " + type);
        target.restoreClientConfiguration(object(snapshot.get("options"), "options"));
        if (snapshot.containsKey("states")) {
            Object states = snapshot.get("states");
            if (!(states instanceof List<?>))
                throw new IllegalArgumentException("Client configuration states must be an array");
            for (Object value : (List<?>) states) {
                Map<String, Object> entry = object(value, "state");
                target.restoreClientConfiguration(object(entry.get("options"), "state options"),
                        restoreState(object(entry.get("state"), "state descriptor")));
            }
        }
    }

    public static String type(String json) {
        Map<String, Object> snapshot = object(HydrationJson.decode(json), "configuration");
        validateSchema(snapshot);
        String type = string(snapshot.get("type"));
        if (type == null) throw new IllegalArgumentException("Client configuration type is required");
        return type;
    }

    private static void validateSchema(Map<String, Object> snapshot) {
        Integer schema = integer(snapshot.get("schema"));
        if (!Integer.valueOf(1).equals(schema) && !Integer.valueOf(SCHEMA).equals(schema))
            throw new IllegalArgumentException("Unsupported client configuration schema");
    }

    public static Map<String, Object> state(State state, Map<String, Object> options) {
        Map<String, Object> entry = new LinkedHashMap<>();
        entry.put("state", describeState(state));
        entry.put("options", options);
        return entry;
    }

    private static Map<String, Object> describeState(State state) {
        Map<String, Object> value = new LinkedHashMap<>();
        if (state instanceof ScreenSize) {
            value.put("type", "screen");
            value.put("name", ((ScreenSize) state).name());
        } else if (state instanceof ColorScheme) {
            value.put("type", "color");
            value.put("name", ((ColorScheme) state).name());
        } else if (state instanceof Interaction) {
            value.put("type", "interaction");
            value.put("name", ((Interaction) state).name());
        } else if (state instanceof MultiState) {
            value.put("type", "multi");
            List<Map<String, Object>> children = new ArrayList<>();
            for (State child : ((MultiState) state).getStates()) children.add(describeState(child));
            value.put("states", children);
        } else if (state instanceof MediaQuery) {
            value.put("type", "media");
            value.put("key", state.getStateKey());
            value.put("query", ((MediaQuery) state).getQuery());
        } else {
            throw new IllegalArgumentException("Unsupported client configuration state: " + state);
        }
        return value;
    }

    private static State restoreState(Map<String, Object> value) {
        String type = string(value.get("type"));
        if ("screen".equals(type)) return ScreenSize.valueOf(string(value.get("name")));
        if ("color".equals(type)) return ColorScheme.valueOf(string(value.get("name")));
        if ("interaction".equals(type)) return Interaction.valueOf(string(value.get("name")));
        if ("multi".equals(type)) {
            Object children = value.get("states");
            if (!(children instanceof List<?>))
                throw new IllegalArgumentException("Client configuration multi-state must be an array");
            List<State> states = new ArrayList<>();
            for (Object child : (List<?>) children) states.add(restoreState(object(child, "state descriptor")));
            return new MultiState(states);
        }
        if ("media".equals(type)) {
            String key = string(value.get("key"));
            String query = string(value.get("query"));
            if (key == null || query == null)
                throw new IllegalArgumentException("Client configuration media state requires a key and query");
            return new MediaQuery() {
                public String getStateKey() { return key; }
                public String getQuery() { return query; }
            };
        }
        throw new IllegalArgumentException("Unknown client configuration state: " + type);
    }

    public static boolean isScalar(Object value) {
        return value == null || value instanceof String || value instanceof Boolean || value instanceof Number;
    }

    public static Object scalar(Object value) {
        if (!isScalar(value))
            throw new IllegalArgumentException("Client configuration value must be a scalar");
        if (value instanceof Number) decimal(value);
        return value;
    }

    private static Map<String, Object> object(Object value, String name) {
        if (!(value instanceof Map<?, ?>))
            throw new IllegalArgumentException("Client configuration " + name + " must be an object");
        Map<String, Object> result = new LinkedHashMap<>();
        for (Map.Entry<?, ?> entry : ((Map<?, ?>) value).entrySet()) {
            if (!(entry.getKey() instanceof String))
                throw new IllegalArgumentException("Client configuration keys must be strings");
            result.put((String) entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static String string(Object value) {
        if (value == null || value instanceof String) return (String) value;
        throw new IllegalArgumentException("Client configuration value must be a string");
    }

    public static Boolean bool(Object value) {
        if (value == null || value instanceof Boolean) return (Boolean) value;
        throw new IllegalArgumentException("Client configuration value must be a boolean");
    }

    public static Integer integer(Object value) {
        Long number = longInteger(value);
        if (number == null) return null;
        if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE)
            throw new IllegalArgumentException("Client configuration integer is out of range");
        return number.intValue();
    }

    public static Long longInteger(Object value) {
        if (value == null) return null;
        if (value instanceof Byte || value instanceof Short || value instanceof Integer || value instanceof Long)
            return ((Number) value).longValue();
        if (value instanceof Double || value instanceof Float) {
            double number = ((Number) value).doubleValue();
            if (Double.isFinite(number) && number == Math.rint(number)
                    && number >= -9007199254740991d && number <= 9007199254740991d)
                return (long) number;
        }
        throw new IllegalArgumentException("Client configuration value must be an exact integer");
    }

    public static Double decimal(Object value) {
        if (value == null) return null;
        if (value instanceof Number && Double.isFinite(((Number) value).doubleValue()))
            return ((Number) value).doubleValue();
        throw new IllegalArgumentException("Client configuration value must be a finite number");
    }
}
