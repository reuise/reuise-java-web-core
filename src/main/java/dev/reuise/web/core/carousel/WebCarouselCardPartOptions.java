package dev.reuise.web.core.carousel;
import dev.reuise.core.State;
import dev.reuise.core.carousel.CoreCarouselCardPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebCarouselCardPartOptions extends CoreCarouselCardPartOptions {
    Double getHoverScale();

    ComponentOption<Double> getHoverScaleOption();

    WebCarouselCardPartOptions setHoverScale(Double hoverScale);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebCarouselCard getComponent();
}
