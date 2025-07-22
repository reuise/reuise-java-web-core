package dev.reuise.web.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.input.AbstractCoreMultiEmailAddressFieldOptions;
public abstract class AbstractWebMultiEmailAddressFieldOptions<S extends AbstractWebMultiEmailAddressFieldOptions<S>> extends AbstractCoreMultiEmailAddressFieldOptions<S> implements WebMultiEmailAddressFieldOptions {
    protected AbstractWebMultiEmailAddressFieldOptions() {
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