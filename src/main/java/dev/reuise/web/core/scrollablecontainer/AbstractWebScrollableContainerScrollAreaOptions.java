package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.scrollablecontainer.AbstractCoreScrollableContainerScrollAreaOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import java.util.Map;
public abstract class AbstractWebScrollableContainerScrollAreaOptions<S extends AbstractWebScrollableContainerScrollAreaOptions<S>> extends AbstractCoreScrollableContainerScrollAreaOptions<S> implements ClientConfigurationOptions , WebScrollableContainerScrollAreaOptions {
    protected AbstractWebScrollableContainerScrollAreaOptions() {
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

    protected WebContainerOptions createDefaultScrollAreaTopFadeOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaTopFadeOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_scrollarea_topfade");
        return options;
    }

    protected WebContainerOptions createDefaultScrollAreaLeftFadeOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaLeftFadeOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_scrollarea_leftfade");
        return options;
    }

    protected WebContainerOptions createDefaultScrollAreaContentOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaContentOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_scrollarea_content");
        return options;
    }

    protected WebContainerOptions createDefaultScrollAreaBottomFadeOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaBottomFadeOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_scrollarea_bottomfade");
        return options;
    }

    protected WebContainerOptions createDefaultScrollAreaRightFadeOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrollAreaRightFadeOptions()));
        options.setStyleClass("reuise-scrollablecontainer_scrollarea_scrollarea_rightfade");
        return options;
    }

    public String getClientConfigurationType() {
        return "ScrollableContainerScrollArea";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "scrollDirection": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setScrollDirection(values.get(key) == null ? null : dev.reuise.core.scrollablecontainer.ScrollDirection.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "borderRadius": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBorderRadius(dev.reuise.web.core.hydration.ClientConfiguration.integer(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "fillColor": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setFillColor(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
