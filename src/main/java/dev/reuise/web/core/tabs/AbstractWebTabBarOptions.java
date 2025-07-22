package dev.reuise.web.core.tabs;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.tabs.AbstractCoreTabBarOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
public abstract class AbstractWebTabBarOptions<S extends AbstractWebTabBarOptions<S>> extends AbstractCoreTabBarOptions<S> implements WebTabBarOptions {
    protected AbstractWebTabBarOptions() {
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

    protected WebContainerOptions createDefaultContainerOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultContainerOptions()));
        options.setBaseStyleClass("reuise-tabbar_container");
        options.setStyleClass("reuise-tabbar_container");
        return options;
    }

    protected WebContainerOptions createDefaultActiveIndicatorOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultActiveIndicatorOptions()));
        options.setStyleClass("reuise-tabbar_activeindicator");
        return options;
    }
}