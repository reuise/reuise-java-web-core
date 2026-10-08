package dev.reuise.web.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.input.AbstractCoreSegmentedTextFieldOptions;
public abstract class AbstractWebSegmentedTextFieldOptions<S extends AbstractWebSegmentedTextFieldOptions<S>> extends AbstractCoreSegmentedTextFieldOptions<S> implements WebSegmentedTextFieldOptions {
    protected AbstractWebSegmentedTextFieldOptions() {
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
