package dev.reuise.web.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.text.AbstractCoreRotatingTextOptions;
public abstract class AbstractWebRotatingTextOptions<S extends AbstractWebRotatingTextOptions<S>> extends AbstractCoreRotatingTextOptions<S> implements WebRotatingTextOptions {
    protected AbstractWebRotatingTextOptions() {
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
