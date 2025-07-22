package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.slidecontainer.CoreSlideContainerEdgePart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebSlideContainerEdgePart extends WebParentComponentPart , WebSlideContainerEdgeFeatures , WebComponentPart , CoreSlideContainerEdgePart {
    WebParentComponentPart getParentComponentPart();
}