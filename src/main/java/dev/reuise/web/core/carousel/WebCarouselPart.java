package dev.reuise.web.core.carousel;
import dev.reuise.core.carousel.CoreCarouselPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
import dev.reuise.web.core.text.WebInlineText;
public interface WebCarouselPart extends WebCarouselFeatures , CoreCarouselPart , WebComponentPart , WebContainerPart {
    WebContainer getViewport();

    WebContainer getSlider();

    WebContainer getNavigation();

    WebButton getPreviousButton();

    WebContainer getIndicators();

    WebButton getNextButton();

    WebButton getAutoplayButton();

    WebInlineText getAnnouncement();

    WebContainerPart getContainerPart();
}
