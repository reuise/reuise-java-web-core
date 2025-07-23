package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerScrollArea;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebScrollableContainerScrollArea extends WebParentComponent , CoreScrollableContainerScrollArea , WebComponent , WebScrollableContainerScrollAreaPart {
    WebScrollableContainerScrollArea getComponent();
}