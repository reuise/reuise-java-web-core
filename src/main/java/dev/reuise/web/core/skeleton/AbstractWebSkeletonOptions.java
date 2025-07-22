package dev.reuise.web.core.skeleton;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.skeleton.AbstractCoreSkeletonOptions;
public abstract class AbstractWebSkeletonOptions<S extends AbstractWebSkeletonOptions<S>> extends AbstractCoreSkeletonOptions<S> implements WebSkeletonOptions {
    protected AbstractWebSkeletonOptions() {
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