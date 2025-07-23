package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreCheckboxTableCellOptions;
import dev.reuise.web.core.checkbox.WebCheckboxOptions;
public abstract class AbstractWebCheckboxTableCellOptions<S extends AbstractWebCheckboxTableCellOptions<S>> extends AbstractCoreCheckboxTableCellOptions<S> implements WebCheckboxTableCellOptions {
    protected AbstractWebCheckboxTableCellOptions() {
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
        options.setStyleClass("reuise-table_cell_checkbox");
        return options;
    }
}