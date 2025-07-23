package dev.reuise.web.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.text.AbstractCoreHeadingOptions;
public abstract class AbstractWebHeadingOptions<S extends AbstractWebHeadingOptions<S>> extends AbstractCoreHeadingOptions<S> implements WebHeadingOptions {
    protected AbstractWebHeadingOptions() {
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