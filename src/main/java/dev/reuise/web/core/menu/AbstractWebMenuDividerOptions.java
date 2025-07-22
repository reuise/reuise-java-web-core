package dev.reuise.web.core.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.menu.AbstractCoreMenuDividerOptions;
public abstract class AbstractWebMenuDividerOptions<S extends AbstractWebMenuDividerOptions<S>> extends AbstractCoreMenuDividerOptions<S> implements WebMenuDividerOptions {
    protected AbstractWebMenuDividerOptions() {
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