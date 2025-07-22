package dev.reuise.web.core.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.menu.AbstractCoreMenuItemOptions;
public abstract class AbstractWebMenuItemOptions<S extends AbstractWebMenuItemOptions<S>> extends AbstractCoreMenuItemOptions<S> implements WebMenuItemOptions {
    protected AbstractWebMenuItemOptions() {
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