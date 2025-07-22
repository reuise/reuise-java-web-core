package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreTableHeaderCellOptions;
import dev.reuise.web.core.button.WebIconButtonOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.menu.WebMenuOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
public abstract class AbstractWebTableHeaderCellOptions<S extends AbstractWebTableHeaderCellOptions<S>> extends AbstractCoreTableHeaderCellOptions<S> implements WebTableHeaderCellOptions {
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
}