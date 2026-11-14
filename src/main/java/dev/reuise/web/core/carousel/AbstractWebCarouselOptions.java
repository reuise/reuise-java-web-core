package dev.reuise.web.core.carousel;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.carousel.AbstractCoreCarouselOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
public abstract class AbstractWebCarouselOptions<S extends AbstractWebCarouselOptions<S>> extends AbstractCoreCarouselOptions<S> implements WebCarouselOptions {
    protected AbstractWebCarouselOptions() {
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

    protected WebContainerOptions createDefaultViewportOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultViewportOptions()));
        options.setStyleClass("reuise-carousel_viewport");
        return options;
    }

    protected WebContainerOptions createDefaultSliderOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultSliderOptions()));
        options.setStyleClass("reuise-carousel_slider");
        return options;
    }

    protected WebContainerOptions createDefaultNavigationOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultNavigationOptions()));
        options.setStyleClass("reuise-carousel_navigation");
        return options;
    }

    protected WebButtonOptions createDefaultPreviousButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultPreviousButtonOptions()));
        options.setStyleClass("reuise-carousel_previousbutton");
        return options;
    }

    protected WebContainerOptions createDefaultIndicatorsOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultIndicatorsOptions()));
        options.setStyleClass("reuise-carousel_indicators");
        return options;
    }

    protected WebButtonOptions createDefaultNextButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultNextButtonOptions()));
        options.setStyleClass("reuise-carousel_nextbutton");
        return options;
    }

    protected WebButtonOptions createDefaultAutoplayButtonOptions() {
        WebButtonOptions options = ((WebButtonOptions) (super.createDefaultAutoplayButtonOptions()));
        options.setStyleClass("reuise-carousel_autoplaybutton");
        return options;
    }

    protected WebInlineTextOptions createDefaultAnnouncementOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultAnnouncementOptions()));
        options.setStyleClass("reuise-carousel_announcement");
        return options;
    }
}
