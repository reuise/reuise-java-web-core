package dev.reuise.web.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.AbstractCoreFieldSetOptions;
public abstract class AbstractWebFieldSetOptions<S extends AbstractWebFieldSetOptions<S>> extends AbstractCoreFieldSetOptions<S> implements WebFieldSetOptions {
    protected AbstractWebFieldSetOptions() {
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