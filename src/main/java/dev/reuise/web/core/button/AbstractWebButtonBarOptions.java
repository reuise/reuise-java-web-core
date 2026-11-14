package dev.reuise.web.core.button;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.button.AbstractCoreButtonBarOptions;
public abstract class AbstractWebButtonBarOptions<S extends AbstractWebButtonBarOptions<S>> extends AbstractCoreButtonBarOptions<S> implements WebButtonBarOptions {
    protected AbstractWebButtonBarOptions() {
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
