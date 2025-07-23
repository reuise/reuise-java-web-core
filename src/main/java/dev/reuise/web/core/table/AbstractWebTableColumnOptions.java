package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreTableColumnOptions;
public abstract class AbstractWebTableColumnOptions<S extends AbstractWebTableColumnOptions<S>> extends AbstractCoreTableColumnOptions<S> implements WebTableColumnOptions {
    protected AbstractWebTableColumnOptions() {
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