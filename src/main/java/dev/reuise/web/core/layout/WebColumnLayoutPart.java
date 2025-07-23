package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreColumnLayoutPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebColumnLayoutPart extends WebColumnLayoutFeatures , WebComponentPart , CoreColumnLayoutPart , WebFlexContainerPart {
    WebFlexContainerPart getFlexContainerPart();
}