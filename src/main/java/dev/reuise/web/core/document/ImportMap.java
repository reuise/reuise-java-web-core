package dev.reuise.web.core.document;

import java.util.HashMap;
import java.util.Map;

public class ImportMap {
    private Map<String, String> imports;

    public Map<String, String> getImports() {
        return imports;
    }

    public void setImports(Map<String, String> imports) {
        this.imports = imports;
    }

    public ImportMap addImport(String module , String url) {
        if(imports == null) imports = new HashMap<>();
        imports.put(module, url);
        return this;
    }
}
