package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreTableCellOptions;
public abstract class AbstractWebTableCellOptions<S extends AbstractWebTableCellOptions<S>> extends AbstractCoreTableCellOptions<S> implements WebTableCellOptions {
    protected AbstractWebTableCellOptions() {
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
}