package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebContainer extends WebParentComponent , CoreContainer , WebComponent , WebContainerPart {
    WebContainer getComponent();
}