package dev.reuise.web.core.link;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.link.AbstractCoreNavigationLinkOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.view.PathMatchType;
import java.util.Map;
public abstract class AbstractWebNavigationLinkOptions<S extends AbstractWebNavigationLinkOptions<S>> extends AbstractCoreNavigationLinkOptions<S> implements ClientConfigurationOptions , WebNavigationLinkOptions {
    protected AbstractWebNavigationLinkOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        setDefaultActiveMatchType(PathMatchType.PATTERN);
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    @Override
    public PathMatchType getActiveMatchType() {
        return ((PathMatchType) (getOptionValue("activeMatchType")));
    }

    @Override
    public ComponentOption<PathMatchType> getActiveMatchTypeOption() {
        return ((ComponentOption<PathMatchType>) (getOption("activeMatchType")));
    }

    @Override
    public S setActiveMatchType(PathMatchType activeMatchType) {
        setOption("activeMatchType", activeMatchType, true);
        return self();
    }

    private void setDefaultActiveMatchType(PathMatchType activeMatchType) {
        setDefaultOption("activeMatchType", activeMatchType, true);
    }

    public String getClientConfigurationType() {
        return "NavigationLink";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "useHistoryApi": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setUseHistoryApi(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "text": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setText(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "target": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTarget(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "externalIndicator": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setExternalIndicator(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "activeMatchType": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setActiveMatchType(values.get(key) == null ? null : dev.reuise.web.core.view.PathMatchType.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "active": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setActive(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
