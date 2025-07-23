package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreFlexContainerOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebFlexContainerOptions extends WebBaseComponentPartOptions , WebFlexContainerPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , WebContainerOptions , CoreFlexContainerOptions , WebComponentOptions {
    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}