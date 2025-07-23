package dev.reuise.web.core.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.view.AbstractCoreSheetViewOptions;
public abstract class AbstractWebSheetViewOptions<S extends AbstractWebSheetViewOptions<S>> extends AbstractCoreSheetViewOptions<S> implements WebSheetViewOptions {
    protected AbstractWebSheetViewOptions() {
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