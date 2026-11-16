package dev.reuise.web.core.divider;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.divider.AbstractCoreDividerOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
import java.util.Map;
public abstract class AbstractWebDividerOptions<S extends AbstractWebDividerOptions<S>> extends AbstractCoreDividerOptions<S> implements ClientConfigurationOptions , WebDividerOptions {
    protected AbstractWebDividerOptions() {
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

    protected WebContainerOptions createDefaultStartLineOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultStartLineOptions()));
        options.setStyleClass("reuise-divider_startline");
        return options;
    }

    protected WebInlineTextOptions createDefaultLabelContainerOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultLabelContainerOptions()));
        options.setStyleClass("reuise-divider_label");
        return options;
    }

    protected WebContainerOptions createDefaultEndLineOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultEndLineOptions()));
        options.setStyleClass("reuise-divider_endline");
        return options;
    }

    public String getClientConfigurationType() {
        return "Divider";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "label": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "labelAlignment": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLabelAlignment(values.get(key) == null ? null : dev.reuise.core.Alignment.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "thickness": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setThickness(dev.reuise.web.core.hydration.ClientConfiguration.integer(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "direction": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setDirection(values.get(key) == null ? null : dev.reuise.core.divider.DividerDirection.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
