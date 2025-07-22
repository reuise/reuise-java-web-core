package dev.reuise.web.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.AbstractCoreRowLayoutOptions;
public abstract class AbstractWebRowLayoutOptions<S extends AbstractWebRowLayoutOptions<S>> extends AbstractCoreRowLayoutOptions<S> implements WebRowLayoutOptions {
    protected AbstractWebRowLayoutOptions() {
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