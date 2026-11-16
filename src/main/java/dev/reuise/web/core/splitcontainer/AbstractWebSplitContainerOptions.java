package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.splitcontainer.AbstractCoreSplitContainerOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import java.util.Map;
public abstract class AbstractWebSplitContainerOptions<S extends AbstractWebSplitContainerOptions<S>> extends AbstractCoreSplitContainerOptions<S> implements ClientConfigurationOptions , WebSplitContainerOptions {
    protected AbstractWebSplitContainerOptions() {
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
        options.setStyleClass("reuise-splitcontainer_container");
        return options;
    }

    protected WebSplitContainerPanelOptions createDefaultStartPanelOptions() {
        WebSplitContainerPanelOptions options = ((WebSplitContainerPanelOptions) (super.createDefaultStartPanelOptions()));
        options.setStyleClass("reuise-splitcontainer_startpanel");
        return options;
    }

    protected WebSplitContainerDividerOptions createDefaultDividerOptions() {
        WebSplitContainerDividerOptions options = ((WebSplitContainerDividerOptions) (super.createDefaultDividerOptions()));
        options.setStyleClass("reuise-splitcontainer_divider");
        return options;
    }

    protected WebSplitContainerPanelOptions createDefaultEndPanelOptions() {
        WebSplitContainerPanelOptions options = ((WebSplitContainerPanelOptions) (super.createDefaultEndPanelOptions()));
        options.setStyleClass("reuise-splitcontainer_endpanel");
        return options;
    }

    public String getClientConfigurationType() {
        return "SplitContainer";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "resizable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setResizable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
