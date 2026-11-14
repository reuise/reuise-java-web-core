package dev.reuise.web.core.carousel;
import dev.reuise.core.State;
import dev.reuise.core.carousel.CoreCarouselPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebCarouselPartOptions extends CoreCarouselPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebCarousel getComponent();
}
