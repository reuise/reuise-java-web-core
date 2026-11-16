package dev.reuise.web.core.filepicker;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import java.util.Map;
public abstract class AbstractWebFilePickerOptions<S extends AbstractWebFilePickerOptions<S>> implements ClientConfigurationOptions , WebFilePickerOptions , WebComponentOptions {
    protected AbstractWebFilePickerOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultMultiple(false);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getAccept() {
        return ((String) (getOptionValue("accept")));
    }

    @Override
    public ComponentOption<String> getAcceptOption() {
        return ((ComponentOption<String>) (getOption("accept")));
    }

    @Override
    public S setAccept(String accept) {
        setOption("accept", accept);
        return self();
    }

    private void setDefaultAccept(String accept) {
        setDefaultOption("accept", accept);
    }

    @Override
    public boolean isMultiple() {
        return Boolean.TRUE.equals(getOptionValue("multiple"));
    }

    @Override
    public ComponentOption<Boolean> getMultipleOption() {
        return ((ComponentOption<Boolean>) (getOption("multiple")));
    }

    @Override
    public S setMultiple(Boolean multiple) {
        setOption("multiple", multiple);
        return self();
    }

    private void setDefaultMultiple(Boolean multiple) {
        setDefaultOption("multiple", multiple);
    }

    protected abstract S self();

    public String getClientConfigurationType() {
        return "FilePicker";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "accept": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setAccept(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "multiple": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setMultiple(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
