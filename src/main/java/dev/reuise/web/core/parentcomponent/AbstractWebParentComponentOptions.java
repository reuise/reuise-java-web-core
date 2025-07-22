package dev.reuise.web.core.parentcomponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.parentcomponent.AbstractCoreParentComponentOptions;
public abstract class AbstractWebParentComponentOptions<S extends AbstractWebParentComponentOptions<S>> extends AbstractCoreParentComponentOptions<S> implements WebParentComponentOptions {
    protected AbstractWebParentComponentOptions() {
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