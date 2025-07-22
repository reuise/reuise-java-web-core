package dev.reuise.web.core.document;

import java.util.ArrayList;
import java.util.List;

public class StructuredData {
    private List<StructuredDataType> types = new ArrayList<>();

    public StructuredData() {
    }
    
    public List<StructuredDataType> getTypes() {
        return types;
    }

    public void setTypes(List<StructuredDataType> types) {
        this.types = types;
    }

    public StructuredData addType(StructuredDataType type) {
        this.types.add(type);
        return this;
    }
}
