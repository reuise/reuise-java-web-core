package dev.reuise.web.core.carousel;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.carousel.CoreCarousel;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebCarousel extends CoreCarousel , WebComponent , WebContainer , WebCarouselPart {
    WebCarousel getComponent();

    WebCarousel setAnimation(ComponentAnimation animation);

    WebCarousel startAnimation();

    WebCarousel cancelAnimation();
}
