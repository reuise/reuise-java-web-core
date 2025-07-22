package dev.reuise.web.core.media;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.media.AbstractCoreTextTrackOptions;
public abstract class AbstractWebTextTrackOptions<S extends AbstractWebTextTrackOptions<S>> extends AbstractCoreTextTrackOptions<S> implements WebTextTrackOptions {
    protected AbstractWebTextTrackOptions() {
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