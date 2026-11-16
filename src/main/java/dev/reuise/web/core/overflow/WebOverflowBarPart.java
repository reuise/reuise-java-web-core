package dev.reuise.web.core.overflow;
import dev.reuise.core.overflow.CoreOverflowBarPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebFlexContainer;
import dev.reuise.web.core.layout.WebFlexContainerPart;
import dev.reuise.web.core.menu.WebMenuButton;
public interface WebOverflowBarPart extends CoreOverflowBarPart , WebOverflowBarFeatures , WebComponentPart , WebFlexContainerPart {
    WebFlexContainer getItems();

    WebMenuButton getOverflowMenu();

    WebFlexContainerPart getFlexContainerPart();
}
