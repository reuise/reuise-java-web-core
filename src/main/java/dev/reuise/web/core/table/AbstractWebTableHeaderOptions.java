package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreTableHeaderOptions;
public abstract class AbstractWebTableHeaderOptions<S extends AbstractWebTableHeaderOptions<S>> extends AbstractCoreTableHeaderOptions<S> implements WebTableHeaderOptions {
    protected AbstractWebTableHeaderOptions() {
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

    protected WebTableHeaderRowOptions createDefaultRowOptions() {
        WebTableHeaderRowOptions options = ((WebTableHeaderRowOptions) (super.createDefaultRowOptions()));
        options.setStyleClass("reuise-table_header_row");
        return options;
    }
}