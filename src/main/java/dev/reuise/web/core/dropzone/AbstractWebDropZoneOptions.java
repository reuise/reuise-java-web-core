package dev.reuise.web.core.dropzone;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.dropzone.AbstractCoreDropZoneOptions;
public abstract class AbstractWebDropZoneOptions<S extends AbstractWebDropZoneOptions<S>> extends AbstractCoreDropZoneOptions<S> implements WebDropZoneOptions {
    protected AbstractWebDropZoneOptions() {
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