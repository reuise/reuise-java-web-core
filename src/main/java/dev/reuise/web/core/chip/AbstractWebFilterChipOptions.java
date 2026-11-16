package dev.reuise.web.core.chip;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.chip.AbstractCoreFilterChipOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import java.util.Map;
public abstract class AbstractWebFilterChipOptions<S extends AbstractWebFilterChipOptions<S>> extends AbstractCoreFilterChipOptions<S> implements ClientConfigurationOptions , WebFilterChipOptions {
    protected AbstractWebFilterChipOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    // Implementation
    // Implementation
    public void onInitialize() {
        super.onInitialize();
        if (!isRehydrated()) {
            if (isHasCheckIcon()) {
                WebSvgOptions checkIconSvgOpts = getComponentFactory().createSvgOptions();
                checkIconSvgOpts.setViewBox("0 0 18 18");
                WebIconOptions checkIconOpts = getComponentFactory().createIconOptions();
                checkIconOpts.setSvgOptions(checkIconSvgOpts);
                setStartIconOptions(checkIconOpts);
            }
            if (isHasRemoveIcon()) {
                WebSvgOptions removeIconSvgOpts = getComponentFactory().createSvgOptions();
                removeIconSvgOpts.setViewBox("0 96 960 960");
                WebIconOptions removeIconOpts = getComponentFactory().createIconOptions();
                removeIconOpts.setSvgOptions(removeIconSvgOpts);
                setEndIconOptions(removeIconOpts);
            }
        }
    }

    public String getClientConfigurationType() {
        return "FilterChip";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "label": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "value": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setValue(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "size": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setSize(values.get(key) == null ? null : dev.reuise.core.chip.ChipSize.valueOf(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "selected": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setSelected(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "hasCheckIcon": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHasCheckIcon(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "hasRemoveIcon": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHasRemoveIcon(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
