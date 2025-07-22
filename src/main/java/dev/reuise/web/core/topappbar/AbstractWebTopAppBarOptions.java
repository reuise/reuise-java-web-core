package dev.reuise.web.core.topappbar;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.core.topappbar.AbstractCoreTopAppBarOptions;
import dev.reuise.web.core.button.WebIconButtonOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
public abstract class AbstractWebTopAppBarOptions<S extends AbstractWebTopAppBarOptions<S>> extends AbstractCoreTopAppBarOptions<S> implements WebTopAppBarOptions {
    protected AbstractWebTopAppBarOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    // Implementation
    // Implementation
    public void onInitialize() {
        super.onInitialize();
        if (!isRehydrated()) {
            CoreIconButtonOptions navButtonOptions = getNavigationButtonOptions();
            if (navButtonOptions != null) {
                WebIconOptions iconOptions = ((WebIconOptions) (navButtonOptions.getIconOptions()));
                if (iconOptions == null) {
                    iconOptions = getComponentFactory().createIconOptions();
                    WebSvgOptions svgOpts = getComponentFactory().createSvgOptions();
                    svgOpts.setViewBox("0 0 24 24");
                    iconOptions.setSvgOptions(svgOpts);
                    navButtonOptions.setIconOptions(iconOptions);
                }
            }
        }
    }

    protected WebContainerOptions createDefaultContainerOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultContainerOptions()));
        options.setStyleClass("reuise-top-app-bar_container");
        return options;
    }

    protected WebIconButtonOptions createDefaultNavigationButtonOptions() {
        WebIconButtonOptions options = ((WebIconButtonOptions) (super.createDefaultNavigationButtonOptions()));
        options.setStyleClass("reuise-top-app-bar_navigationbutton");
        return options;
    }

    protected WebContainerOptions createDefaultTitleContainerOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultTitleContainerOptions()));
        options.setStyleClass("reuise-top-app-bar_titlecontainer");
        return options;
    }

    protected WebContainerOptions createDefaultActionsContainerOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultActionsContainerOptions()));
        options.setStyleClass("reuise-top-app-bar_actionscontainer");
        return options;
    }
}