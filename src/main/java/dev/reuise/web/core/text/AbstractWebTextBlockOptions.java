package dev.reuise.web.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.text.AbstractCoreTextBlockOptions;
public abstract class AbstractWebTextBlockOptions<S extends AbstractWebTextBlockOptions<S>> extends AbstractCoreTextBlockOptions<S> implements WebTextBlockOptions {
    protected AbstractWebTextBlockOptions() {
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