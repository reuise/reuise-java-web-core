package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreRowLayoutPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebRowLayoutPart extends CoreRowLayoutPart , WebRowLayoutFeatures , WebComponentPart , WebFlexContainerPart {
    WebFlexContainerPart getFlexContainerPart();
}