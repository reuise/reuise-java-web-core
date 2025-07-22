package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerEdgePart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebScrollableContainerEdgePart extends WebParentComponentPart , CoreScrollableContainerEdgePart , WebComponentPart , WebScrollableContainerEdgeFeatures {
    WebParentComponentPart getParentComponentPart();
}