package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreSurfacePart;
import dev.reuise.web.core.WebComponentPart;
public interface WebSurfacePart extends CoreSurfacePart , WebSurfaceFeatures , WebComponentPart , WebFlexContainerPart {
    WebFlexContainerPart getFlexContainerPart();
}