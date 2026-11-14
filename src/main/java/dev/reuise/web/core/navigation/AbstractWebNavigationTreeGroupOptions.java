package dev.reuise.web.core.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.navigation.AbstractCoreNavigationTreeGroupOptions;
public abstract class AbstractWebNavigationTreeGroupOptions<S extends AbstractWebNavigationTreeGroupOptions<S>> extends AbstractCoreNavigationTreeGroupOptions<S> implements WebNavigationTreeGroupOptions {
    protected AbstractWebNavigationTreeGroupOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    protected WebNavigationTreeLinkOptions createDefaultLinkOptions() {
        WebNavigationTreeLinkOptions options = ((WebNavigationTreeLinkOptions) (super.createDefaultLinkOptions()));
        options.setStyleClass("reuise-navigationtreegroup_link");
        return options;
    }

    protected WebNavigationTreeOptions createDefaultTreeOptions() {
        WebNavigationTreeOptions options = ((WebNavigationTreeOptions) (super.createDefaultTreeOptions()));
        options.setStyleClass("reuise-navigationtreegroup_tree");
        return options;
    }
}
