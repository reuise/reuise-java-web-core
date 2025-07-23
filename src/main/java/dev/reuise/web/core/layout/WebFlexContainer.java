package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreFlexContainer;
import dev.reuise.web.core.WebComponent;
public interface WebFlexContainer extends WebComponent , CoreFlexContainer , WebContainer , WebFlexContainerPart {
    WebFlexContainer getComponent();
}