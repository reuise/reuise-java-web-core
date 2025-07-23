package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreColumnLayoutOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebColumnLayoutOptions extends WebFlexContainerOptions , WebColumnLayoutPartOptions , WebBaseComponentPartOptions , WebFlexContainerPartOptions , WebContainerPartOptions , CoreColumnLayoutOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebFlexContainerPartOptions getFlexContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}