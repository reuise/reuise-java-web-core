package dev.reuise.web.core.bottomappbar;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.bottomappbar.AbstractCoreBottomAppBarOptions;
public abstract class AbstractWebBottomAppBarOptions<S extends AbstractWebBottomAppBarOptions<S>> extends AbstractCoreBottomAppBarOptions<S> implements WebBottomAppBarOptions {
    protected AbstractWebBottomAppBarOptions() {
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