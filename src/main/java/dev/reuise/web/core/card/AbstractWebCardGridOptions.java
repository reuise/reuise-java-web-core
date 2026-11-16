package dev.reuise.web.core.card;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.card.AbstractCoreCardGridOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import java.util.Map;
public abstract class AbstractWebCardGridOptions<S extends AbstractWebCardGridOptions<S>> extends AbstractCoreCardGridOptions<S> implements ClientConfigurationOptions , WebCardGridOptions {
    protected AbstractWebCardGridOptions() {
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

    protected WebContainerOptions createDefaultScrimOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrimOptions()));
        options.setStyleClass("reuise-cardgrid_scrim");
        return options;
    }

    protected WebContainerOptions createDefaultCardContainerOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultCardContainerOptions()));
        options.setStyleClass("reuise-cardgrid_cardcontainer");
        return options;
    }

    public String getClientConfigurationType() {
        return "CardGrid";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "positionMode": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setPositionMode(values.get(key) == null ? null : dev.reuise.core.card.CardGridPositionMode.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "animationEnabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setAnimationEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "expandableCards": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setExpandableCards(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
