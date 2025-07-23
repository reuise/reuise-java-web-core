package dev.reuise.web.core.applayout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.applayout.AbstractCoreAppLayoutBodyOptions;
public abstract class AbstractWebAppLayoutBodyOptions<S extends AbstractWebAppLayoutBodyOptions<S>> extends AbstractCoreAppLayoutBodyOptions<S> implements WebAppLayoutBodyOptions {
    protected AbstractWebAppLayoutBodyOptions() {
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