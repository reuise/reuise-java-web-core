package dev.reuise.web.core.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.menu.AbstractCoreMenuButtonItemOptions;
public abstract class AbstractWebMenuButtonItemOptions<S extends AbstractWebMenuButtonItemOptions<S>> extends AbstractCoreMenuButtonItemOptions<S> implements WebMenuButtonItemOptions {
    protected AbstractWebMenuButtonItemOptions() {
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
