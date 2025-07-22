package dev.reuise.web.core.text;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.text.AbstractCoreLabelOptions;
public abstract class AbstractWebLabelOptions<S extends AbstractWebLabelOptions<S>> extends AbstractCoreLabelOptions<S> implements WebLabelOptions {
    protected AbstractWebLabelOptions() {
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