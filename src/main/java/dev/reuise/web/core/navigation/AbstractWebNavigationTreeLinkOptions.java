package dev.reuise.web.core.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.navigation.AbstractCoreNavigationTreeLinkOptions;
import dev.reuise.web.core.list.WebListItemOptions;
public abstract class AbstractWebNavigationTreeLinkOptions<S extends AbstractWebNavigationTreeLinkOptions<S>> extends AbstractCoreNavigationTreeLinkOptions<S> implements WebNavigationTreeLinkOptions {
    protected AbstractWebNavigationTreeLinkOptions() {
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

    protected WebListItemOptions createDefaultItemOptions() {
        WebListItemOptions options = ((WebListItemOptions) (super.createDefaultItemOptions()));
        options.setTagName("div");
        options.setStyleClass("reuise-navigationtreelink_item");
        return options;
    }
}
