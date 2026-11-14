package dev.reuise.web.core.floating;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.floating.AbstractCoreFloatingActionButtonOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
public abstract class AbstractWebFloatingActionButtonOptions<S extends AbstractWebFloatingActionButtonOptions<S>> extends AbstractCoreFloatingActionButtonOptions<S> implements WebFloatingActionButtonOptions {
    protected AbstractWebFloatingActionButtonOptions() {
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

    protected WebInlineTextOptions createDefaultBadgeOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultBadgeOptions()));
        options.setStyleClass("reuise-floatingactionbutton_badge");
        return options;
    }
}
