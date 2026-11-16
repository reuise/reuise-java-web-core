package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.scrollablecontainer.AbstractCoreScrollableContainerOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import java.util.Map;
public abstract class AbstractWebScrollableContainerOptions<S extends AbstractWebScrollableContainerOptions<S>> extends AbstractCoreScrollableContainerOptions<S> implements ClientConfigurationOptions , WebScrollableContainerOptions {
    protected AbstractWebScrollableContainerOptions() {
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

    protected WebContainerOptions createDefaultScrollAreaBeforeOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaBeforeOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_before");
        return options;
    }

    protected WebScrollableContainerScrollAreaOptions createDefaultScrollAreaOptions() {
        WebScrollableContainerScrollAreaOptions options = ((WebScrollableContainerScrollAreaOptions) (super.createDefaultScrollAreaOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea");
        return options;
    }

    protected WebContainerOptions createDefaultScrollAreaAfterOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaAfterOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_after");
        return options;
    }

    public String getClientConfigurationType() {
        return "ScrollableContainer";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "scrollDirection": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setScrollDirection(values.get(key) == null ? null : dev.reuise.core.scrollablecontainer.ScrollDirection.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "showScrollBars": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setShowScrollBars(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "scrollAreaBorderRadius": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setScrollAreaBorderRadius(dev.reuise.web.core.hydration.ClientConfiguration.integer(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "scrollAreaFillColor": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setScrollAreaFillColor(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
