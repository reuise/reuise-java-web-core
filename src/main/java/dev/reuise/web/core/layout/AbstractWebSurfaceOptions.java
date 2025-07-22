package dev.reuise.web.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.AbstractCoreSurfaceOptions;
public abstract class AbstractWebSurfaceOptions<S extends AbstractWebSurfaceOptions<S>> extends AbstractCoreSurfaceOptions<S> implements WebSurfaceOptions {
    protected AbstractWebSurfaceOptions() {
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