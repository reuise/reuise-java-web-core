package dev.reuise.web.core.carousel;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.carousel.CoreCarouselCard;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebCarouselCard extends WebCarouselCardPart , WebComponent , CoreCarouselCard , WebContainer {
    WebCarouselCard getComponent();

    WebCarouselCard setAnimation(ComponentAnimation animation);

    WebCarouselCard startAnimation();

    WebCarouselCard cancelAnimation();
}
