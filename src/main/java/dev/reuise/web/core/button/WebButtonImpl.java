package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreButtonImpl;
import dev.reuise.web.core.component.WebComponentImpl;
/**
 * Implementation of Button (Web).
 */
public class WebButtonImpl<A extends WebButtonAdapter> extends WebComponentImpl<WebButtonImpl<A>, A> implements WebButton {
    private final CoreButtonImpl<A> coreButton;

    /**
     * Implementation of Button options.
     */
    public static class Options<S extends Options<S>> extends WebComponentImpl.Options<S> implements WebButtonOptions {
        private CoreButtonImpl.Options coreButtonOpts;

        /**
         * Gets the label on the button
         *
         * @return Label
         */
        public String getLabel() {
            return coreButtonOpts.getLabel();
        }

        /**
         * Sets the label on the button
         *
         * @param label:
         * 		Label
         * @return Options instance
         */
        public S setLabel(String label) {
            coreButtonOpts.setLabel(label);
            return self();
        }

        public Options() {
            this.coreButtonOpts = new CoreButtonImpl.Options();
        }
    }

    public WebButtonImpl(WebButtonAdapter adapter, WebButtonOptions options) {
        super(adapter, options);
        this.coreButton = new CoreButtonImpl<A>(adapter, options);
    }
}