package dev.reuise.web.core.applayout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.applayout.AbstractCoreAppLayoutOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.splitcontainer.WebSplitContainerOptions;
import java.util.Map;
public abstract class AbstractWebAppLayoutOptions<S extends AbstractWebAppLayoutOptions<S>> extends AbstractCoreAppLayoutOptions<S> implements ClientConfigurationOptions , WebAppLayoutOptions {
    protected AbstractWebAppLayoutOptions() {
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

    protected WebContainerOptions createDefaultDrawerScrimOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultDrawerScrimOptions()));
        options.setStyleClass("reuise-app-layout_drawerscrim");
        return options;
    }

    protected WebSplitContainerOptions createDefaultDrawerSplitOptions() {
        WebSplitContainerOptions options = ((WebSplitContainerOptions) (super.createDefaultDrawerSplitOptions()));
        options.setStyleClass("reuise-app-layout_drawersplit");
        return options;
    }

    protected WebSplitContainerOptions createDefaultTopAppBarSplitOptions() {
        WebSplitContainerOptions options = ((WebSplitContainerOptions) (super.createDefaultTopAppBarSplitOptions()));
        options.setStyleClass("reuise-app-layout_topappbarsplit");
        return options;
    }

    protected WebAppLayoutBodyOptions createDefaultBodyOptions() {
        WebAppLayoutBodyOptions options = ((WebAppLayoutBodyOptions) (super.createDefaultBodyOptions()));
        options.setStyleClass("reuise-app-layout_body");
        return options;
    }

    public String getClientConfigurationType() {
        return "AppLayout";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
