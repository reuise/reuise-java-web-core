package dev.reuise.web.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.AbstractCoreContainerOptions;
public abstract class AbstractWebContainerOptions<S extends AbstractWebContainerOptions<S>> extends AbstractCoreContainerOptions<S> implements WebContainerOptions {
    protected AbstractWebContainerOptions() {
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