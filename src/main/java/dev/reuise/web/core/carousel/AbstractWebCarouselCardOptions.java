package dev.reuise.web.core.carousel;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.carousel.AbstractCoreCarouselCardOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import java.util.Map;
public abstract class AbstractWebCarouselCardOptions<S extends AbstractWebCarouselCardOptions<S>> extends AbstractCoreCarouselCardOptions<S> implements ClientConfigurationOptions , WebCarouselCardOptions {
    protected AbstractWebCarouselCardOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        setDefaultHoverScale(1.0);
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    @Override
    public Double getHoverScale() {
        return ((Double) (getOptionValue("hoverScale")));
    }

    @Override
    public ComponentOption<Double> getHoverScaleOption() {
        return ((ComponentOption<Double>) (getOption("hoverScale")));
    }

    @Override
    public S setHoverScale(Double hoverScale) {
        setOption("hoverScale", hoverScale, true);
        return self();
    }

    private void setDefaultHoverScale(Double hoverScale) {
        setDefaultOption("hoverScale", hoverScale, true);
    }

    public String getClientConfigurationType() {
        return "CarouselCard";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "hoverScale": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHoverScale(dev.reuise.web.core.hydration.ClientConfiguration.decimal(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "autoSize": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setAutoSize(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
