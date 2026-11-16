package dev.reuise.web.core.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.navigation.AbstractCoreNavigationTreeLinkOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.list.WebListItemOptions;
import java.util.Map;
public abstract class AbstractWebNavigationTreeLinkOptions<S extends AbstractWebNavigationTreeLinkOptions<S>> extends AbstractCoreNavigationTreeLinkOptions<S> implements ClientConfigurationOptions , WebNavigationTreeLinkOptions {
    protected AbstractWebNavigationTreeLinkOptions() {
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

    protected WebListItemOptions createDefaultItemOptions() {
        WebListItemOptions options = ((WebListItemOptions) (super.createDefaultItemOptions()));
        options.setTagName("div");
        options.setStyleClass("reuise-navigationtreelink_item");
        return options;
    }

    public String getClientConfigurationType() {
        return "NavigationTreeLink";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "useHistoryApi": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setUseHistoryApi(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "text": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setText(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "target": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTarget(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "externalIndicator": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setExternalIndicator(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "activeMatchType": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setActiveMatchType(values.get(key) == null ? null : dev.reuise.web.core.view.PathMatchType.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "active": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setActive(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "label": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
