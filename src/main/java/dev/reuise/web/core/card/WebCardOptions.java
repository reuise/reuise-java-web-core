package dev.reuise.web.core.card;
import dev.reuise.core.card.CoreCardOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.layout.WebFlexContainerPartOptions;
import dev.reuise.web.core.layout.WebSurfaceOptions;
import dev.reuise.web.core.layout.WebSurfacePartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebCardOptions extends WebCardPartOptions , WebSurfaceOptions , WebBaseComponentPartOptions , CoreCardOptions , WebFlexContainerPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , WebSurfacePartOptions , WebComponentOptions {
    WebSurfacePartOptions getSurfacePart();

    WebFlexContainerPartOptions getFlexContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}