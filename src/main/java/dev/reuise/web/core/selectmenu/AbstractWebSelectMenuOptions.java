package dev.reuise.web.core.selectmenu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.selectmenu.AbstractCoreSelectMenuOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.input.WebTextFieldOptions;
import dev.reuise.web.core.menu.WebMenuOptions;
import java.util.Map;
public abstract class AbstractWebSelectMenuOptions<S extends AbstractWebSelectMenuOptions<S>> extends AbstractCoreSelectMenuOptions<S> implements ClientConfigurationOptions , WebSelectMenuOptions {
    protected AbstractWebSelectMenuOptions() {
        WebSvgOptions arrowSvgOpts = getComponentFactory().createSvgOptions();
        arrowSvgOpts.setViewBox("7 10 10 5");
        WebIconOptions arrowIconOpts = getComponentFactory().createIconOptions();
        arrowIconOpts.setSvgOptions(arrowSvgOpts);
        getTextFieldOptions().setEndIconOptions(arrowIconOpts);
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

    protected WebTextFieldOptions createDefaultTextFieldOptions() {
        WebTextFieldOptions options = ((WebTextFieldOptions) (super.createDefaultTextFieldOptions()));
        options.setStyleClass("reuise-selectmenu_textfield");
        return options;
    }

    protected WebMenuOptions createDefaultMenuOptions() {
        WebMenuOptions options = ((WebMenuOptions) (super.createDefaultMenuOptions()));
        options.setStyleClass("reuise-selectmenu_menu");
        return options;
    }

    public String getClientConfigurationType() {
        return "SelectMenu";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
