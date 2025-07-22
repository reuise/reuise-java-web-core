package dev.reuise.web.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.AbstractCoreColumnLayoutOptions;
public abstract class AbstractWebColumnLayoutOptions<S extends AbstractWebColumnLayoutOptions<S>> extends AbstractCoreColumnLayoutOptions<S> implements WebColumnLayoutOptions {
    protected AbstractWebColumnLayoutOptions() {
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