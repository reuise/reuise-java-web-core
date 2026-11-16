package dev.reuise.web.core.carousel;
import dev.reuise.core.carousel.CoreCarouselCardFeatures;
public interface WebCarouselCardFeatures extends CoreCarouselCardFeatures {
    Double getHoverScale();

    WebCarouselCardFeatures setHoverScale(Double hoverScale);
}
