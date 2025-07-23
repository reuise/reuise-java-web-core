package dev.reuise.web.core.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.list.AbstractCoreBasicListOptions;
public abstract class AbstractWebBasicListOptions<S extends AbstractWebBasicListOptions<S>> extends AbstractCoreBasicListOptions<S> implements WebBasicListOptions {
    protected AbstractWebBasicListOptions() {
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