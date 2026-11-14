package dev.reuise.web.core.navigation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.navigation.AbstractCoreNavigationTreeOptions;
public abstract class AbstractWebNavigationTreeOptions<S extends AbstractWebNavigationTreeOptions<S>> extends AbstractCoreNavigationTreeOptions<S> implements WebNavigationTreeOptions {
    protected AbstractWebNavigationTreeOptions() {
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
