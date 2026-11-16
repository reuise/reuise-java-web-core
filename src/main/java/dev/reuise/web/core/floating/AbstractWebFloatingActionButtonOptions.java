package dev.reuise.web.core.floating;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.floating.AbstractCoreFloatingActionButtonOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
import java.util.Map;
public abstract class AbstractWebFloatingActionButtonOptions<S extends AbstractWebFloatingActionButtonOptions<S>> extends AbstractCoreFloatingActionButtonOptions<S> implements ClientConfigurationOptions , WebFloatingActionButtonOptions {
    protected AbstractWebFloatingActionButtonOptions() {
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

    protected WebInlineTextOptions createDefaultBadgeOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultBadgeOptions()));
        options.setStyleClass("reuise-floatingactionbutton_badge");
        return options;
    }

    public String getClientConfigurationType() {
        return "FloatingActionButton";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "hoverScale": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHoverScale(dev.reuise.web.core.hydration.ClientConfiguration.decimal(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "border": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBorder(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "borderColor": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBorderColor(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "borderWidth": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBorderWidth(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "borderRadius": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBorderRadius(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "background": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBackground(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "backgroundColor": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setBackgroundColor(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "useHistoryApi": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setUseHistoryApi(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "loading": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLoading(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "label": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "size": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setSize(values.get(key) == null ? null : dev.reuise.core.button.ButtonSize.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "type": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setType(values.get(key) == null ? null : dev.reuise.core.button.ButtonType.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "target": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTarget(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "accessibleLabel": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setAccessibleLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "corner": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setCorner(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "unreadCount": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setUnreadCount(dev.reuise.web.core.hydration.ClientConfiguration.integer(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
