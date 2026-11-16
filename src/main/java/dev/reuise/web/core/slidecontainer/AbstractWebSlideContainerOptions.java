package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.slidecontainer.AbstractCoreSlideContainerOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import java.util.Map;
public abstract class AbstractWebSlideContainerOptions<S extends AbstractWebSlideContainerOptions<S>> extends AbstractCoreSlideContainerOptions<S> implements ClientConfigurationOptions , WebSlideContainerOptions {
    protected AbstractWebSlideContainerOptions() {
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

    protected WebContainerOptions createDefaultSlideAreaBeforeOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultSlideAreaBeforeOptions()));
        options.setStyleClass("reuise-slidecontainer_slideareabefore");
        return options;
    }

    protected WebContainerOptions createDefaultSlideAreaOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultSlideAreaOptions()));
        options.setStyleClass("reuise-slidecontainer_slidearea");
        return options;
    }

    protected WebContainerOptions createDefaultSlideAreaAfterOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultSlideAreaAfterOptions()));
        options.setStyleClass("reuise-slidecontainer_slideareaafter");
        return options;
    }

    public String getClientConfigurationType() {
        return "SlideContainer";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "slideDirection": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setSlideDirection(values.get(key) == null ? null : dev.reuise.core.slidecontainer.SlideDirection.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "showSlideBars": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setShowSlideBars(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
