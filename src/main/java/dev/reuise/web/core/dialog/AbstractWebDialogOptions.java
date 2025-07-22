package dev.reuise.web.core.dialog;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.dialog.AbstractCoreDialogOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.text.WebHeadingOptions;
public abstract class AbstractWebDialogOptions<S extends AbstractWebDialogOptions<S>> extends AbstractCoreDialogOptions<S> implements WebDialogOptions {
    protected AbstractWebDialogOptions() {
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

    protected WebContainerOptions createDefaultContainerOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultContainerOptions()));
        options.setStyleClass("reuise-dialog_container");
        return options;
    }

    protected WebContainerOptions createDefaultHeaderOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultHeaderOptions()));
        options.setStyleClass("reuise-dialog_header");
        return options;
    }

    protected WebHeadingOptions createDefaultTitleHeadingOptions() {
        WebHeadingOptions options = ((WebHeadingOptions) (super.createDefaultTitleHeadingOptions()));
        options.setStyleClass("reuise-dialog_title");
        return options;
    }

    protected WebFlexContainerOptions createDefaultBodyOptions() {
        WebFlexContainerOptions options = ((WebFlexContainerOptions) (super.createDefaultBodyOptions()));
        options.setStyleClass("reuise-dialog_body");
        return options;
    }

    protected WebFlexContainerOptions createDefaultFooterOptions() {
        WebFlexContainerOptions options = ((WebFlexContainerOptions) (super.createDefaultFooterOptions()));
        options.setStyleClass("reuise-dialog_footer");
        return options;
    }

    protected WebContainerOptions createDefaultScrimOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrimOptions()));
        options.setStyleClass("reuise-dialog_scrim");
        return options;
    }

    protected WebButtonOptions createDefaultAcceptButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultAcceptButtonOptions()));
        options.setStyleClass("reuise-dialog_acceptbutton");
        return options;
    }

    protected WebButtonOptions createDefaultCancelButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultCancelButtonOptions()));
        options.setStyleClass("reuise-dialog_cancelbutton");
        return options;
    }
}