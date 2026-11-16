package dev.reuise.web.core.chip;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.chip.AbstractCoreChipGroupOptions;
import dev.reuise.core.chip.CoreChipOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import java.util.Map;
public abstract class AbstractWebChipGroupOptions<S extends AbstractWebChipGroupOptions<S>> extends AbstractCoreChipGroupOptions<S> implements ClientConfigurationOptions , WebChipGroupOptions {
    protected AbstractWebChipGroupOptions() {
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
        if (isHideUnselected()) {
            CoreChipOptions addButtonOptions = getAddButtonOptions();
            if ((!isRehydrated()) && (addButtonOptions != null)) {
                WebSvgOptions svgOpts = getComponentFactory().createSvgOptions();
                svgOpts.setViewBox("0 -960 960 960");
                WebIconOptions addIconOpts = getComponentFactory().createIconOptions();
                addIconOpts.setSvgOptions(svgOpts);
                addButtonOptions.setStartIconOptions(addIconOpts);
            }
        }
    }

    protected WebChipOptions createDefaultAddButtonOptions() {
        WebChipOptions options = ((WebChipOptions) (super.createDefaultAddButtonOptions()));
        options.setStyleClass("reuise-chipgroup_addbutton");
        return options;
    }

    public String getClientConfigurationType() {
        return "ChipGroup";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "label": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "hideUnselected": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHideUnselected(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
