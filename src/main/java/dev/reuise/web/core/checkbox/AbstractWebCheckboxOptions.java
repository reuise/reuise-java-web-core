package dev.reuise.web.core.checkbox;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.checkbox.AbstractCoreCheckboxOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.text.WebLabelOptions;
import java.util.Map;
public abstract class AbstractWebCheckboxOptions<S extends AbstractWebCheckboxOptions<S>> extends AbstractCoreCheckboxOptions<S> implements ClientConfigurationOptions , WebCheckboxOptions {
    protected AbstractWebCheckboxOptions() {
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

    protected WebBasicCheckboxOptions createDefaultCheckboxOptions() {
        WebBasicCheckboxOptions options = ((WebBasicCheckboxOptions) (super.createDefaultCheckboxOptions()));
        options.setStyleClass("reuise-checkbox_checkbox");
        return options;
    }

    protected WebLabelOptions createDefaultLabelContainerOptions() {
        WebLabelOptions options = ((WebLabelOptions) (super.createDefaultLabelContainerOptions()));
        options.setBaseStyleClass("reuise-checkbox_label");
        options.setStyleClass("reuise-checkbox_label");
        return options;
    }

    public String getClientConfigurationType() {
        return "Checkbox";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "label": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "checked": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setChecked(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
