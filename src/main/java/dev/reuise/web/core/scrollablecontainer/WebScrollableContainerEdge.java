package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerEdge;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebScrollableContainerEdge extends WebParentComponent , WebComponent , WebScrollableContainerEdgePart , CoreScrollableContainerEdge {
    WebScrollableContainerEdge getComponent();
}