package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreButtonBarPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebFlexContainerPart;
public interface WebButtonBarPart extends WebButtonBarFeatures , WebComponentPart , WebFlexContainerPart , CoreButtonBarPart {
    WebFlexContainerPart getFlexContainerPart();
}
