package dev.reuise.web.core.parentcomponent;
import dev.reuise.core.parentcomponent.CoreParentComponentImpl;
import dev.reuise.web.core.component.WebComponent;
import dev.reuise.web.core.component.WebComponentImpl;
/**
 * Implementation of ParentComponent (Web).
 */
public class WebParentComponentImpl<A extends WebParentComponentAdapter> extends WebComponentImpl<WebParentComponentImpl<A>, A> implements WebParentComponent {
    private final CoreParentComponentImpl<A> coreParentComponent;

    /**
     * Implementation of ParentComponent options.
     */
    public static class Options<S extends Options<S>> extends WebComponentImpl.Options<S> implements WebParentComponentOptions {
        public Options() {
        }
    }

    public WebParentComponentImpl(WebParentComponentAdapter adapter, WebParentComponentOptions options) {
        super(adapter, options);
        this.coreParentComponent = new CoreParentComponentImpl<A>(adapter, options);
    }

    /**
     * Add a child component.
     *
     * @param child
     * 		
     */
    public void add(WebComponent child) {
        coreParentComponent.add(child);
    }
}