package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreSurface;
import dev.reuise.web.core.WebComponent;
public interface WebSurface extends WebFlexContainer , CoreSurface , WebSurfacePart , WebComponent {
    WebSurface getComponent();
}