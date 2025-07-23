package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreRowLayoutOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebRowLayoutOptions extends WebFlexContainerOptions , WebBaseComponentPartOptions , WebFlexContainerPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , CoreRowLayoutOptions , WebComponentOptions , WebRowLayoutPartOptions {
    WebFlexContainerPartOptions getFlexContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}