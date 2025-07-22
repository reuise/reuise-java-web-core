package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerEdgeFeatures;
import dev.reuise.web.core.button.WebButton;
public interface WebScrollableContainerEdgeFeatures extends CoreScrollableContainerEdgeFeatures {
    WebButton getScrollButton();

    WebScrollableContainerEdgeFeatures setScrollButton(WebButton scrollButton);
}