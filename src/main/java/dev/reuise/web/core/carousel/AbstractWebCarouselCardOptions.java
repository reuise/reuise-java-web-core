package dev.reuise.web.core.carousel;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.carousel.AbstractCoreCarouselCardOptions;
public abstract class AbstractWebCarouselCardOptions<S extends AbstractWebCarouselCardOptions<S>> extends AbstractCoreCarouselCardOptions<S> implements WebCarouselCardOptions {
    protected AbstractWebCarouselCardOptions() {
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
