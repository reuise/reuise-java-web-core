package dev.reuise.web.core.drawer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.drawer.AbstractCoreDrawerOptions;
public abstract class AbstractWebDrawerOptions<S extends AbstractWebDrawerOptions<S>> extends AbstractCoreDrawerOptions<S> implements WebDrawerOptions {
    protected AbstractWebDrawerOptions() {
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