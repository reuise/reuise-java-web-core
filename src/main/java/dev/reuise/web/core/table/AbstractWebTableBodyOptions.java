package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreTableBodyOptions;
public abstract class AbstractWebTableBodyOptions<S extends AbstractWebTableBodyOptions<S>> extends AbstractCoreTableBodyOptions<S> implements WebTableBodyOptions {
    protected AbstractWebTableBodyOptions() {
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