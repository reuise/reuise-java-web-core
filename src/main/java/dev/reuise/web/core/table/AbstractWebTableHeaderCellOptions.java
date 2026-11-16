package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreTableHeaderCellOptions;
import dev.reuise.web.core.button.WebIconButtonOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.menu.WebMenuOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
import java.util.Map;
public abstract class AbstractWebTableHeaderCellOptions<S extends AbstractWebTableHeaderCellOptions<S>> extends AbstractCoreTableHeaderCellOptions<S> implements ClientConfigurationOptions , WebTableHeaderCellOptions {
    protected AbstractWebTableHeaderCellOptions() {
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
            WebIconButtonOptions menuButtonOpts = ((WebIconButtonOptions) (getMenuButtonOptions()));
            if (menuButtonOpts != null) {
                // Icon
                WebIconOptions iconOptions = ((WebIconOptions) (menuButtonOpts.getIconOptions()));
                if (iconOptions == null) {
                    WebSvgOptions iconSvgOpts = getComponentFactory().createSvgOptions();
                    iconSvgOpts.setViewBox("0 -960 960 960");
                    WebIconOptions iconOpts = getComponentFactory().createIconOptions();
                    iconOpts.setSvgOptions(iconSvgOpts);
                    menuButtonOpts.setIconOptions(iconOptions);
                }
            }
        }
    }

    protected WebInlineTextOptions createDefaultLabelContainerOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultLabelContainerOptions()));
        options.setStyleClass("reuise-table_headercell_label");
        return options;
    }

    protected WebMenuOptions createDefaultMenuOptions() {
        WebMenuOptions options = ((WebMenuOptions) (super.createDefaultMenuOptions()));
        options.setStyleClass("reuise-table_headercell_menu");
        return options;
    }

    protected WebIconButtonOptions createDefaultMenuButtonOptions() {
        WebIconButtonOptions options = ((WebIconButtonOptions) (super.createDefaultMenuButtonOptions()));
        options.setStyleClass("reuise-table_headercell_menubutton");
        return options;
    }

    public String getClientConfigurationType() {
        return "TableHeaderCell";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setTooltip(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "contentEditable": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setContentEditable(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "enabled": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setEnabled(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "label": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setLabel(dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;case "hasMenuButton": if (getOption(key) == null || getOption(key) instanceof dev.reuise.core.option.DefaultComponentOption) { setHasMenuButton(dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key))); getOptions().put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
