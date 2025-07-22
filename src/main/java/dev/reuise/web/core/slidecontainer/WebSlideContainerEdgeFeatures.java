package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.slidecontainer.CoreSlideContainerEdgeFeatures;
import dev.reuise.web.core.button.WebButton;
public interface WebSlideContainerEdgeFeatures extends CoreSlideContainerEdgeFeatures {
    WebButton getSlideButton();

    WebSlideContainerEdgeFeatures setSlideButton(WebButton slideButton);
}