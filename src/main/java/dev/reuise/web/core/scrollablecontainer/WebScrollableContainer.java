package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainer;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebScrollableContainer extends WebScrollableContainerPart , WebComponent , WebContainer , CoreScrollableContainer {
    WebScrollableContainer getComponent();
}