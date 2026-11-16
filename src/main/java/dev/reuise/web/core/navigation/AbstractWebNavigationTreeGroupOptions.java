package dev.reuise.web.core.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.navigation.AbstractCoreNavigationTreeGroupOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import java.util.Map;
public abstract class AbstractWebNavigationTreeGroupOptions<S extends AbstractWebNavigationTreeGroupOptions<S>> extends AbstractCoreNavigationTreeGroupOptions<S> implements ClientConfigurationOptions , WebNavigationTreeGroupOptions {
    protected AbstractWebNavigationTreeGroupOptions() {
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

    protected WebNavigationTreeLinkOptions createDefaultLinkOptions() {
        WebNavigationTreeLinkOptions options = ((WebNavigationTreeLinkOptions) (super.createDefaultLinkOptions()));
        options.setStyleClass("reuise-navigationtreegroup_link");
        return options;
    }

    protected WebNavigationTreeOptions createDefaultTreeOptions() {
        WebNavigationTreeOptions options = ((WebNavigationTreeOptions) (super.createDefaultTreeOptions()));
        options.setStyleClass("reuise-navigationtreegroup_tree");
        return options;
    }

    public String getClientConfigurationType() {
        return "NavigationTreeGroup";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "expanded": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setExpanded(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "toggleAtEnd": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setToggleAtEnd(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
