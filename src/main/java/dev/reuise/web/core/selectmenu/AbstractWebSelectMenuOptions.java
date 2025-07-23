package dev.reuise.web.core.selectmenu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.selectmenu.AbstractCoreSelectMenuOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.input.WebTextFieldOptions;
import dev.reuise.web.core.menu.WebMenuOptions;
public abstract class AbstractWebSelectMenuOptions<S extends AbstractWebSelectMenuOptions<S>> extends AbstractCoreSelectMenuOptions<S> implements WebSelectMenuOptions {
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
}