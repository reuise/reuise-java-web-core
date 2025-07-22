package dev.reuise.web.core.layout;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.AbstractCoreSheetLayoutOptions;
public abstract class AbstractWebSheetLayoutOptions<S extends AbstractWebSheetLayoutOptions<S>> extends AbstractCoreSheetLayoutOptions<S> implements WebSheetLayoutOptions {
    protected AbstractWebSheetLayoutOptions() {
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