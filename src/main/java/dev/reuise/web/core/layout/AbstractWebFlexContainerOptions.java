package dev.reuise.web.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.AbstractCoreFlexContainerOptions;
public abstract class AbstractWebFlexContainerOptions<S extends AbstractWebFlexContainerOptions<S>> extends AbstractCoreFlexContainerOptions<S> implements WebFlexContainerOptions {
    protected AbstractWebFlexContainerOptions() {
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