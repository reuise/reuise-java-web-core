package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreTableRowOptions;
public abstract class AbstractWebTableRowOptions<S extends AbstractWebTableRowOptions<S>> extends AbstractCoreTableRowOptions<S> implements WebTableRowOptions {
    protected AbstractWebTableRowOptions() {
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