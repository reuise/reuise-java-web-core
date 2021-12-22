package dev.reuise.web.core.document;
public class WebDocumentOptions {
    private String title;

    public WebDocumentOptions() {
    }

    /**
     * Gets the document title
     *
     * @return Title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Sets the document title
     *
     * @param title:
     * 		Title
     * @return Options instance
     */
    public void setTitle(String title) {
        this.title = title;
    }
}