package dev.reuise.web.core.graphics.svg;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import java.util.Map;
public abstract class AbstractWebSvgOptions<S extends AbstractWebSvgOptions<S>> implements ClientConfigurationOptions , WebSvgOptions , WebComponentOptions {
    protected AbstractWebSvgOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public Double getX() {
        return ((Double) (getOptionValue("x")));
    }

    @Override
    public ComponentOption<Double> getXOption() {
        return ((ComponentOption<Double>) (getOption("x")));
    }

    @Override
    public S setX(Double x) {
        setOption("x", x);
        return self();
    }

    private void setDefaultX(Double x) {
        setDefaultOption("x", x);
    }

    @Override
    public Double getY() {
        return ((Double) (getOptionValue("y")));
    }

    @Override
    public ComponentOption<Double> getYOption() {
        return ((ComponentOption<Double>) (getOption("y")));
    }

    @Override
    public S setY(Double y) {
        setOption("y", y);
        return self();
    }

    private void setDefaultY(Double y) {
        setDefaultOption("y", y);
    }

    @Override
    public String getViewBox() {
        return ((String) (getOptionValue("viewBox")));
    }

    @Override
    public ComponentOption<String> getViewBoxOption() {
        return ((ComponentOption<String>) (getOption("viewBox")));
    }

    @Override
    public S setViewBox(String viewBox) {
        setOption("viewBox", viewBox);
        return self();
    }

    private void setDefaultViewBox(String viewBox) {
        setDefaultOption("viewBox", viewBox);
    }

    protected abstract S self();

    public String getClientConfigurationType() {
        return "Svg";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
