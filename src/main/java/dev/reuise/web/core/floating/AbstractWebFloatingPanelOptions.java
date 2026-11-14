package dev.reuise.web.core.floating;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.floating.AbstractCoreFloatingPanelOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
public abstract class AbstractWebFloatingPanelOptions<S extends AbstractWebFloatingPanelOptions<S>> extends AbstractCoreFloatingPanelOptions<S> implements WebFloatingPanelOptions {
    protected AbstractWebFloatingPanelOptions() {
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

    protected WebFloatingActionButtonOptions createDefaultTriggerOptions() {
        WebFloatingActionButtonOptions options = ((WebFloatingActionButtonOptions) (super.createDefaultTriggerOptions()));
        options.setStyleClass("reuise-floatingpanel_trigger");
        return options;
    }

    protected WebContainerOptions createDefaultPanelOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultPanelOptions()));
        options.setStyleClass("reuise-floatingpanel_panel");
        return options;
    }

    protected WebContainerOptions createDefaultHeaderOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultHeaderOptions()));
        options.setStyleClass("reuise-floatingpanel_header");
        return options;
    }

    protected WebInlineTextOptions createDefaultTitleContainerOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultTitleContainerOptions()));
        options.setStyleClass("reuise-floatingpanel_title");
        return options;
    }

    protected WebButtonOptions createDefaultMinimiseButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultMinimiseButtonOptions()));
        options.setStyleClass("reuise-floatingpanel_minimisebutton");
        return options;
    }

    protected WebButtonOptions createDefaultCloseButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultCloseButtonOptions()));
        options.setStyleClass("reuise-floatingpanel_closebutton");
        return options;
    }

    protected WebContainerOptions createDefaultContentOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultContentOptions()));
        options.setStyleClass("reuise-floatingpanel_content");
        return options;
    }
}
