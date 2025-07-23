package dev.reuise.web.core.dialog;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.dialog.AbstractCoreMessageDialogOptions;
public abstract class AbstractWebMessageDialogOptions<S extends AbstractWebMessageDialogOptions<S>> extends AbstractCoreMessageDialogOptions<S> implements WebMessageDialogOptions {
    protected AbstractWebMessageDialogOptions() {
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