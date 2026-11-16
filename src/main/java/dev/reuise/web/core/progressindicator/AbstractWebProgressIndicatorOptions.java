package dev.reuise.web.core.progressindicator;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.progressindicator.AbstractCoreProgressIndicatorOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import java.util.Map;
public abstract class AbstractWebProgressIndicatorOptions<S extends AbstractWebProgressIndicatorOptions<S>> extends AbstractCoreProgressIndicatorOptions<S> implements ClientConfigurationOptions , WebProgressIndicatorOptions {
    protected AbstractWebProgressIndicatorOptions() {
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

    protected WebContainerOptions createDefaultTrackOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultTrackOptions()));
        options.setBaseStyleClass("reuise-progressindicator_track");
        options.setStyleClass("reuise-progressindicator_track");
        return options;
    }

    public String getClientConfigurationType() {
        return "ProgressIndicator";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "layout": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLayout(values.get(key) == null ? null : dev.reuise.core.progressindicator.ProgressIndicatorLayout.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "timing": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTiming(values.get(key) == null ? null : dev.reuise.core.progressindicator.ProgressIndicatorTiming.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "progress": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setProgress(dev.reuise.web.core.hydration.ClientConfiguration.integer(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "started": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setStarted(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "visibilityBehaviour": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setVisibilityBehaviour(values.get(key) == null ? null : dev.reuise.core.progressindicator.ProgressIndicatorVisibilityBehaviour.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
