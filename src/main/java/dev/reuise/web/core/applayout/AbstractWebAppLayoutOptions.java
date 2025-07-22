package dev.reuise.web.core.applayout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.applayout.AbstractCoreAppLayoutOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.splitcontainer.WebSplitContainerOptions;
public abstract class AbstractWebAppLayoutOptions<S extends AbstractWebAppLayoutOptions<S>> extends AbstractCoreAppLayoutOptions<S> implements WebAppLayoutOptions {
    protected AbstractWebAppLayoutOptions() {
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

    protected WebContainerOptions createDefaultDrawerScrimOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultDrawerScrimOptions()));
        options.setStyleClass("reuise-app-layout_drawerscrim");
        return options;
    }

    protected WebSplitContainerOptions createDefaultDrawerSplitOptions() {
        WebSplitContainerOptions options = ((WebSplitContainerOptions) (super.createDefaultDrawerSplitOptions()));
        options.setStyleClass("reuise-app-layout_drawersplit");
        return options;
    }

    protected WebSplitContainerOptions createDefaultTopAppBarSplitOptions() {
        WebSplitContainerOptions options = ((WebSplitContainerOptions) (super.createDefaultTopAppBarSplitOptions()));
        options.setStyleClass("reuise-app-layout_topappbarsplit");
        return options;
    }

    protected WebAppLayoutBodyOptions createDefaultBodyOptions() {
        WebAppLayoutBodyOptions options = ((WebAppLayoutBodyOptions) (super.createDefaultBodyOptions()));
        options.setStyleClass("reuise-app-layout_body");
        return options;
    }
}