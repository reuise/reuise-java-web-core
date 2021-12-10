package dev.reuise.web.core.component;
import dev.reuise.core.component.CoreComponentImpl;
/**
 * Implementation of Component (Web).
 */
public class WebComponentImpl<S extends WebComponentImpl<S, A>, A extends WebComponentAdapter> extends CoreComponentImpl<S, A> implements WebComponent {
    /**
     * Implementation of Component options.
     */
    public static class Options<S extends Options<S>> extends CoreComponentImpl.Options<S> implements WebComponentOptions {
        private String id;

        /**
         * Sets the id of the component's element
         *
         * @return Id
         */
        public String getId() {
            return this.id;
        }

        /**
         * Sets the id of the component's element
         *
         * @param id:
         * 		Id
         * @return Options instance
         */
        public S setId(String id) {
            this.id = id;
            return self();
        }

        public Options() {
        }
    }

    public WebComponentImpl(WebComponentAdapter adapter, WebComponentOptions options) {
        super(adapter, options);
    }

    protected S self() {
        return null;
    }
}