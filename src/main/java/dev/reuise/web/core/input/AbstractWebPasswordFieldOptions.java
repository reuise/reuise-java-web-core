package dev.reuise.web.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.input.AbstractCorePasswordFieldOptions;
public abstract class AbstractWebPasswordFieldOptions<S extends AbstractWebPasswordFieldOptions<S>> extends AbstractCorePasswordFieldOptions<S> implements WebPasswordFieldOptions {
    protected AbstractWebPasswordFieldOptions() {
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