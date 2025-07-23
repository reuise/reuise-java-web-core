package dev.reuise.web.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.text.AbstractCoreTextOptions;
public abstract class AbstractWebTextOptions<S extends AbstractWebTextOptions<S>> extends AbstractCoreTextOptions<S> implements WebTextOptions {
    protected AbstractWebTextOptions() {
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