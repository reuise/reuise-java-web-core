package dev.reuise.web.core.menu;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.menu.AbstractCoreMenuButtonOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
public abstract class AbstractWebMenuButtonOptions<S extends AbstractWebMenuButtonOptions<S>> extends AbstractCoreMenuButtonOptions<S> implements WebMenuButtonOptions {
    protected AbstractWebMenuButtonOptions() {
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

    protected WebButtonOptions createDefaultTriggerOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultTriggerOptions()));
        options.setStyleClass("reuise-menubutton_trigger");
        return options;
    }

    protected WebContainerOptions createDefaultPopupOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultPopupOptions()));
        options.setStyleClass("reuise-menubutton_popup");
        return options;
    }
}
