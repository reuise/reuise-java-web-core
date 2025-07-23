package dev.reuise.web.core.media;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.media.AbstractCoreVideoPlayerOptions;
public abstract class AbstractWebVideoPlayerOptions<S extends AbstractWebVideoPlayerOptions<S>> extends AbstractCoreVideoPlayerOptions<S> implements WebVideoPlayerOptions {
    protected AbstractWebVideoPlayerOptions() {
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