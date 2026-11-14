package dev.reuise.web.core.carousel;
import dev.reuise.core.State;
import dev.reuise.core.carousel.CoreCarouselCardPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebCarouselCardPartOptions extends CoreCarouselCardPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebCarouselCard getComponent();
}
