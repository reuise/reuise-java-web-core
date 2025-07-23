package dev.reuise.web.core.applayout;
import dev.reuise.core.applayout.CoreAppLayoutBodyPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebFlexContainerPart;
public interface WebAppLayoutBodyPart extends WebAppLayoutBodyFeatures , WebComponentPart , CoreAppLayoutBodyPart , WebFlexContainerPart {
    WebFlexContainerPart getFlexContainerPart();
}