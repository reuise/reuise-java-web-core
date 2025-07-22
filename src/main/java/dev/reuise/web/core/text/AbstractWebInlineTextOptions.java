package dev.reuise.web.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.text.AbstractCoreInlineTextOptions;
public abstract class AbstractWebInlineTextOptions<S extends AbstractWebInlineTextOptions<S>> extends AbstractCoreInlineTextOptions<S> implements WebInlineTextOptions {
    protected AbstractWebInlineTextOptions() {
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