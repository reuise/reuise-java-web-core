package dev.reuise.web.core.floating;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.floating.AbstractCoreFloatingPanelOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
import java.util.Map;
public abstract class AbstractWebFloatingPanelOptions<S extends AbstractWebFloatingPanelOptions<S>> extends AbstractCoreFloatingPanelOptions<S> implements ClientConfigurationOptions , WebFloatingPanelOptions {
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

    public String getClientConfigurationType() {
        return "FloatingPanel";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "title": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTitle(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "closeLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setCloseLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "minimiseLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setMinimiseLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "expanded": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setExpanded(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "minimised": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setMinimised(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "docked": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setDocked(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "corner": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setCorner(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
