package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreFlexContainerPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebFlexContainerPart extends WebFlexContainerFeatures , CoreFlexContainerPart , WebComponentPart , WebContainerPart {
    WebContainerPart getContainerPart();
}