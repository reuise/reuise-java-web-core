package dev.reuise.web.core.list;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.list.AbstractCoreListViewOptions;
public abstract class AbstractWebListViewOptions<S extends AbstractWebListViewOptions<S>> extends AbstractCoreListViewOptions<S> implements WebListViewOptions {
    protected AbstractWebListViewOptions() {
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