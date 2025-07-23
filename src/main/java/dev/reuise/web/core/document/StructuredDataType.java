package dev.reuise.web.core.document;

import java.util.HashMap;
import java.util.Map;

public class StructuredDataType {
    private Map<String, String> properties = new HashMap<>();
    private String context = "https://schema.org/";
    private String type;

    public StructuredDataType() {
    }
    
    public Map<String, String> getProperties() {
        return properties;
    }

    public StructuredDataType setProperty(String key, String value) {
        properties.put(key, value);
        return this;
    }

    public StructuredDataType setProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    public String getContext() {
        return context;
    }

    public StructuredDataType setContext(String context) {
        this.context = context;
        return this;
    }

    public String getType() {
        return type;
    }

    public StructuredDataType setType(String type) {
        this.type = type;
        return this;
    }
}