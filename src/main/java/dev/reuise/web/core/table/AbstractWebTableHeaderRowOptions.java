package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreTableHeaderRowOptions;
public abstract class AbstractWebTableHeaderRowOptions<S extends AbstractWebTableHeaderRowOptions<S>> extends AbstractCoreTableHeaderRowOptions<S> implements WebTableHeaderRowOptions {
    protected AbstractWebTableHeaderRowOptions() {
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