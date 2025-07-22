package dev.reuise.web.core.divider;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.divider.AbstractCoreDividerOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
public abstract class AbstractWebDividerOptions<S extends AbstractWebDividerOptions<S>> extends AbstractCoreDividerOptions<S> implements WebDividerOptions {
    protected AbstractWebDividerOptions() {
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

    protected WebContainerOptions createDefaultStartLineOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultStartLineOptions()));
        options.setStyleClass("reuise-divider_startline");
        return options;
    }

    protected WebInlineTextOptions createDefaultLabelContainerOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultLabelContainerOptions()));
        options.setStyleClass("reuise-divider_label");
        return options;
    }

    protected WebContainerOptions createDefaultEndLineOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultEndLineOptions()));
        options.setStyleClass("reuise-divider_endline");
        return options;
    }
}