package dev.reuise.web.core.banner;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.banner.AbstractCoreBannerOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.text.WebParagraphOptions;
public abstract class AbstractWebBannerOptions<S extends AbstractWebBannerOptions<S>> extends AbstractCoreBannerOptions<S> implements WebBannerOptions {
    protected AbstractWebBannerOptions() {
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

    protected WebIconOptions createDefaultIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultIconOptions()));
        options.setStyleClass("reuise-banner_icon");
        return options;
    }

    protected WebContainerOptions createDefaultContentOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultContentOptions()));
        options.setStyleClass("reuise-banner_content");
        return options;
    }

    protected WebParagraphOptions createDefaultMessageParagraphOptions() {
        WebParagraphOptions options = ((WebParagraphOptions) (super.createDefaultMessageParagraphOptions()));
        options.setStyleClass("reuise-banner_message");
        return options;
    }

    protected WebFlexContainerOptions createDefaultActionsOptions() {
        WebFlexContainerOptions options = ((WebFlexContainerOptions) (super.createDefaultActionsOptions()));
        options.setStyleClass("reuise-banner_actions");
        return options;
    }

    protected WebButtonOptions createDefaultDismissButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultDismissButtonOptions()));
        options.setStyleClass("reuise-banner_dismissbutton");
        return options;
    }
}
