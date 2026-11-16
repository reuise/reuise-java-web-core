package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.scrollablecontainer.AbstractCoreScrollableContainerEdgeOptions;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import java.util.Map;
public abstract class AbstractWebScrollableContainerEdgeOptions<S extends AbstractWebScrollableContainerEdgeOptions<S>> extends AbstractCoreScrollableContainerEdgeOptions<S> implements ClientConfigurationOptions , WebScrollableContainerEdgeOptions {
    protected AbstractWebScrollableContainerEdgeOptions() {
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
    public WebButton getScrollButton() {
        return ((WebButton) (getOptionValue("scrollButton")));
    }

    @Override
    public ComponentOption<WebButton> getScrollButtonOption() {
        return ((ComponentOption<WebButton>) (getOption("scrollButton")));
    }

    @Override
    public S setScrollButton(WebButton scrollButton) {
        setOption("scrollButton", scrollButton);
        return self();
    }

    private void setDefaultScrollButton(WebButton scrollButton) {
        setDefaultOption("scrollButton", scrollButton);
    }

    public String getClientConfigurationType() {
        return "ScrollableContainerEdge";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
