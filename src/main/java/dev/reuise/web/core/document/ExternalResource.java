package dev.reuise.web.core.document;

public class ExternalResource {
    private String url;
    private boolean crossOrigin = false;

    public ExternalResource(String url, boolean crossOrigin) {
        this.url = url;
        this.crossOrigin = crossOrigin;
    }

    public ExternalResource(String url) {
        this(url, false);
    }

    public String getUrl() {
        return url;
    }

    public ExternalResource setUrl(String url) {
        this.url = url;
        return this;
    }

    public boolean isCrossOrigin() {
        return crossOrigin;
    }

    public ExternalResource setCrossOrigin(boolean crossOrigin) {
        this.crossOrigin = crossOrigin;
        return this;
    }
}
