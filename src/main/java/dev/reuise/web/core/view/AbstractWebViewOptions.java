package dev.reuise.web.core.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.view.AbstractCoreViewOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import java.util.Map;
public abstract class AbstractWebViewOptions<S extends AbstractWebViewOptions<S>> extends AbstractCoreViewOptions<S> implements ClientConfigurationOptions , WebViewOptions {
    protected AbstractWebViewOptions() {
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

    @Override
    public Map<String, String> getParameters() {
        return ((Map<String, String>) (getOptionValue("parameters")));
    }

    @Override
    public ComponentOption<Map<String, String>> getParametersOption() {
        return ((ComponentOption<Map<String, String>>) (getOption("parameters")));
    }

    private void setDefaultParameters(Map<String, String> parameters) {
        setDefaultOption("parameters", parameters);
    }

    @Override
    public String getContentType() {
        return ((String) (getOptionValue("contentType")));
    }

    @Override
    public ComponentOption<String> getContentTypeOption() {
        return ((ComponentOption<String>) (getOption("contentType")));
    }

    private void setDefaultContentType(String contentType) {
        setDefaultOption("contentType", contentType);
    }

    public String getClientConfigurationType() {
        return "View";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "title": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTitle(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "revealed": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setRevealed(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
