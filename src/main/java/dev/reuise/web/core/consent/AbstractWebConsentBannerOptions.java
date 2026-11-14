package dev.reuise.web.core.consent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.consent.AbstractCoreConsentBannerOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.dialog.WebDialogOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.text.WebParagraphOptions;
public abstract class AbstractWebConsentBannerOptions<S extends AbstractWebConsentBannerOptions<S>> extends AbstractCoreConsentBannerOptions<S> implements WebConsentBannerOptions {
    protected AbstractWebConsentBannerOptions() {
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

    protected WebParagraphOptions createDefaultMessageParagraphOptions() {
        WebParagraphOptions options = ((WebParagraphOptions) (super.createDefaultMessageParagraphOptions()));
        options.setStyleClass("reuise-consentbanner_message");
        return options;
    }

    protected WebFlexContainerOptions createDefaultActionsOptions() {
        WebFlexContainerOptions options = ((WebFlexContainerOptions) (super.createDefaultActionsOptions()));
        options.setStyleClass("reuise-consentbanner_actions");
        return options;
    }

    protected WebButtonOptions createDefaultAcceptButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultAcceptButtonOptions()));
        options.setStyleClass("reuise-consentbanner_acceptbutton");
        return options;
    }

    protected WebButtonOptions createDefaultRejectButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultRejectButtonOptions()));
        options.setStyleClass("reuise-consentbanner_rejectbutton");
        return options;
    }

    protected WebButtonOptions createDefaultPreferencesButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultPreferencesButtonOptions()));
        options.setStyleClass("reuise-consentbanner_preferencesbutton");
        return options;
    }

    protected WebDialogOptions createDefaultPreferencesDialogOptions() {
        WebDialogOptions options = ((WebDialogOptions) (super.createDefaultPreferencesDialogOptions()));
        options.setStyleClass("reuise-consentbanner_preferencesdialog");
        return options;
    }
}
