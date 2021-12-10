package dev.reuise.web.core.document;
import dev.reuise.web.core.component.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponentImpl;
/**
 * Implementation of Document (Web).
 */
public class WebDocumentImpl<A extends WebDocumentAdapter> extends WebParentComponentImpl<A> implements WebDocument {
    /**
     * Implementation of Document options.
     */
    public static class Options<S extends Options<S>> extends WebParentComponentImpl.Options<S> implements WebDocumentOptions {
        public Options() {
        }
    }

    public WebDocumentImpl(WebDocumentAdapter adapter, WebDocumentOptions options) {
        super(adapter, options);
    }

    /**
     * Add a child component.
     *
     * @param child
     * 		
     */
    public void add(WebComponent child) {
        super.add(child);
    }
}