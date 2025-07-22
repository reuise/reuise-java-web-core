package dev.reuise.web.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.input.AbstractCoreBasicInputFieldOptions;
public abstract class AbstractWebBasicInputFieldOptions<S extends AbstractWebBasicInputFieldOptions<S>> extends AbstractCoreBasicInputFieldOptions<S> implements WebBasicInputFieldOptions {
    protected AbstractWebBasicInputFieldOptions() {
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