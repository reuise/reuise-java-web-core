package dev.reuise.web.core.media;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.media.AbstractCoreAudioPlayerOptions;
public abstract class AbstractWebAudioPlayerOptions<S extends AbstractWebAudioPlayerOptions<S>> extends AbstractCoreAudioPlayerOptions<S> implements WebAudioPlayerOptions {
    protected AbstractWebAudioPlayerOptions() {
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