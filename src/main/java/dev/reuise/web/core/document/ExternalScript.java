package dev.reuise.web.core.document;

public class ExternalScript {
    private String url;
    private String type = "application/javascript";
    private String language = "javascript";
    private String crossOrigin;
    private boolean async = false;
    private boolean defer = false;

    public ExternalScript(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public ExternalScript setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getType() {
        return type;
    }

    public ExternalScript setType(String type) {
        this.type = type;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public ExternalScript setLanguage(String language) {
        this.language = language;
        return this;
    }

    public boolean isAsync() {
        return async;
    }

    public ExternalScript setAsync(boolean async) {
        this.async = async;
        return this;
    }

    public boolean isDefer() {
        return defer;
    }

    public ExternalScript setDefer(boolean defer) {
        this.defer = defer;
        return this;
    }

    public String getCrossOrigin() {
        return crossOrigin;
    }

    public ExternalScript setCrossOrigin(String crossOrigin) {
        this.crossOrigin = crossOrigin;
        return this;
    }
}
