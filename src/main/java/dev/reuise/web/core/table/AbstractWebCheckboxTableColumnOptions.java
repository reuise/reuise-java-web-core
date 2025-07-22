package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreCheckboxTableColumnOptions;
import dev.reuise.web.core.checkbox.WebCheckboxOptions;
public abstract class AbstractWebCheckboxTableColumnOptions<S extends AbstractWebCheckboxTableColumnOptions<S>> extends AbstractCoreCheckboxTableColumnOptions<S> implements WebCheckboxTableColumnOptions {
    protected AbstractWebCheckboxTableColumnOptions() {
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
        options.setBaseStyleClass("reuise-table_checkboxcolumn_checkbox");
        options.setStyleClass("reuise-table_checkboxcolumn_checkbox");
        return options;
    }
}