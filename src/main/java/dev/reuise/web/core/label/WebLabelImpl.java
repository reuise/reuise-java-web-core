package dev.reuise.web.core.label;
import dev.reuise.core.label.CoreLabelImpl;
import dev.reuise.web.core.component.WebComponentImpl;
/**
 * Implementation of Label (Web).
 */
public class WebLabelImpl<A extends WebLabelAdapter> extends WebComponentImpl<WebLabelImpl<A>, A> implements WebLabel {
    private final CoreLabelImpl<A> coreLabel;

    /**
     * Implementation of Label options.
     */
    public static class Options<S extends Options<S>> extends WebComponentImpl.Options<S> implements WebLabelOptions {
        private CoreLabelImpl.Options coreLabelOpts;

        public Options() {
            this.coreLabelOpts = new CoreLabelImpl.Options();
        }
    }

    public WebLabelImpl(WebLabelAdapter adapter, WebLabelOptions options) {
        super(adapter, options);
        this.coreLabel = new CoreLabelImpl<A>(adapter, options);
    }
}