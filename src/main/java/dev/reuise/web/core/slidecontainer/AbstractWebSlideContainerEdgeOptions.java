package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.slidecontainer.AbstractCoreSlideContainerEdgeOptions;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import java.util.Map;
public abstract class AbstractWebSlideContainerEdgeOptions<S extends AbstractWebSlideContainerEdgeOptions<S>> extends AbstractCoreSlideContainerEdgeOptions<S> implements ClientConfigurationOptions , WebSlideContainerEdgeOptions {
    protected AbstractWebSlideContainerEdgeOptions() {
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
    public WebButton getSlideButton() {
        return ((WebButton) (getOptionValue("slideButton")));
    }

    @Override
    public ComponentOption<WebButton> getSlideButtonOption() {
        return ((ComponentOption<WebButton>) (getOption("slideButton")));
    }

    @Override
    public S setSlideButton(WebButton slideButton) {
        setOption("slideButton", slideButton);
        return self();
    }

    private void setDefaultSlideButton(WebButton slideButton) {
        setDefaultOption("slideButton", slideButton);
    }

    public String getClientConfigurationType() {
        return "SlideContainerEdge";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
