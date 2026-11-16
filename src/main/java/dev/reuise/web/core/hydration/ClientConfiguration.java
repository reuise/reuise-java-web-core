package dev.reuise.web.core.hydration;

import java.util.LinkedHashMap;
import java.util.Map;

import dev.reuise.web.core.document.HydrationJson;

public final class ClientConfiguration {
    public static final String ATTRIBUTE = "data-reuise-config";
    public static final int SCHEMA = 1;

    private ClientConfiguration() {
    }

    public static Map<String, Object> snapshot(String type, Map<String, Object> options) {
        Map<String, Object> snapshot = new LinkedHashMap<>();
        snapshot.put("schema", SCHEMA);
        snapshot.put("type", type);
        snapshot.put("options", options);
        return snapshot;
    }

    public static void restore(ClientConfigurationOptions target, String json) {
        if (json == null) return;
        Map<String, Object> snapshot = object(HydrationJson.decode(json), "configuration");
        if (!Integer.valueOf(SCHEMA).equals(integer(snapshot.get("schema"))))
            throw new IllegalArgumentException("Unsupported client configuration schema");
        String type = string(snapshot.get("type"));
        if (!target.getClientConfigurationType().equals(type))
            throw new IllegalArgumentException("Client configuration type mismatch: " + type);
        target.restoreClientConfiguration(object(snapshot.get("options"), "options"));
    }

    public static String type(String json) {
        Map<String, Object> snapshot = object(HydrationJson.decode(json), "configuration");
        if (!Integer.valueOf(SCHEMA).equals(integer(snapshot.get("schema"))))
            throw new IllegalArgumentException("Unsupported client configuration schema");
        String type = string(snapshot.get("type"));
        if (type == null) throw new IllegalArgumentException("Client configuration type is required");
        return type;
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
