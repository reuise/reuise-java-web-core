package dev.reuise.web.core.view;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebRouteLayoutOptions extends WebRouteLayoutPartOptions , WebBaseComponentPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , WebContainerOptions , WebComponentOptions {
    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}