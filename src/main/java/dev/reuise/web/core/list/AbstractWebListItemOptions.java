package dev.reuise.web.core.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.list.AbstractCoreListItemOptions;
import dev.reuise.web.core.checkbox.WebCheckboxOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
public abstract class AbstractWebListItemOptions<S extends AbstractWebListItemOptions<S>> extends AbstractCoreListItemOptions<S> implements WebListItemOptions {
    protected AbstractWebListItemOptions() {
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

    protected WebCheckboxOptions createDefaultCheckboxOptions() {
        WebCheckboxOptions options = ((WebCheckboxOptions) (super.createDefaultCheckboxOptions()));
        options.setBaseStyleClass("reuise-table_checkboxcell_checkbox");
        options.setStyleClass("reuise-listitem_checkbox");
        return options;
    }

    protected WebIconOptions createDefaultStartIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultStartIconOptions()));
        options.setStyleClass("reuise-listitem_starticon");
        return options;
    }

    protected WebContainerOptions createDefaultTextContainerOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultTextContainerOptions()));
        options.setStyleClass("reuise-listitem_textcontainer");
        return options;
    }

    protected WebInlineTextOptions createDefaultLabelContainerOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultLabelContainerOptions()));
        options.setStyleClass("reuise-listitem_label");
        return options;
    }

    protected WebInlineTextOptions createDefaultSecondaryLabelContainerOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultSecondaryLabelContainerOptions()));
        options.setStyleClass("reuise-listitem_secondarylabel");
        return options;
    }

    protected WebIconOptions createDefaultEndIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultEndIconOptions()));
        options.setStyleClass("reuise-listitem_endicon");
        return options;
    }
}