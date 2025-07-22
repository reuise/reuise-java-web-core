package dev.reuise.web.core.applayout;
import dev.reuise.core.applayout.CoreAppLayoutBody;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebFlexContainer;
public interface WebAppLayoutBody extends CoreAppLayoutBody , WebFlexContainer , WebComponent , WebAppLayoutBodyPart {
    WebAppLayoutBody getComponent();
}