package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.slidecontainer.CoreSlideContainerEdge;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebSlideContainerEdge extends WebParentComponent , WebSlideContainerEdgePart , WebComponent , CoreSlideContainerEdge {
    WebSlideContainerEdge getComponent();
}