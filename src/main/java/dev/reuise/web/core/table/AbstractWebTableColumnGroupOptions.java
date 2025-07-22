package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreTableColumnGroupOptions;
public abstract class AbstractWebTableColumnGroupOptions<S extends AbstractWebTableColumnGroupOptions<S>> extends AbstractCoreTableColumnGroupOptions<S> implements WebTableColumnGroupOptions {
    protected AbstractWebTableColumnGroupOptions() {
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