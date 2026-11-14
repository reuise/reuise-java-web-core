package dev.reuise.web.core.carousel;
import dev.reuise.core.carousel.CoreCarouselCardPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainerPart;
public interface WebCarouselCardPart extends CoreCarouselCardPart , WebComponentPart , WebContainerPart , WebCarouselCardFeatures {
    WebContainerPart getContainerPart();
}
