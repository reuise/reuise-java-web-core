package dev.reuise.web.core.document;

public class ExternalStyleSheet {
    private String url;
    private String type = "application/javascript";
    private String language = "javascript";
    private boolean async = false;

    public ExternalStyleSheet(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public ExternalStyleSheet setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getType() {
        return type;
    }

    public ExternalStyleSheet setType(String type) {
        this.type = type;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public ExternalStyleSheet setLanguage(String language) {
        this.language = language;
        return this;
    }

    public boolean isAsync() {
        return async;
    }

    public ExternalStyleSheet setAsync(boolean async) {
        this.async = async;
        return this;
    }
}
