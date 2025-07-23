package dev.reuise.web.core.table;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.table.AbstractCoreTableFooterOptions;
public abstract class AbstractWebTableFooterOptions<S extends AbstractWebTableFooterOptions<S>> extends AbstractCoreTableFooterOptions<S> implements WebTableFooterOptions {
    protected AbstractWebTableFooterOptions() {
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