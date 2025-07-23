package dev.reuise.web.core.media;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.media.AbstractCoreMediaPlayerOptions;
public abstract class AbstractWebMediaPlayerOptions<S extends AbstractWebMediaPlayerOptions<S>> extends AbstractCoreMediaPlayerOptions<S> implements WebMediaPlayerOptions {
    protected AbstractWebMediaPlayerOptions() {
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