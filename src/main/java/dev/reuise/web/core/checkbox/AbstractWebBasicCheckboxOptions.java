package dev.reuise.web.core.checkbox;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.checkbox.AbstractCoreBasicCheckboxOptions;
public abstract class AbstractWebBasicCheckboxOptions<S extends AbstractWebBasicCheckboxOptions<S>> extends AbstractCoreBasicCheckboxOptions<S> implements WebBasicCheckboxOptions {
    protected AbstractWebBasicCheckboxOptions() {
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