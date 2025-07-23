package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.slidecontainer.CoreSlideContainerOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebSlideContainerOptions extends CoreSlideContainerOptions , WebBaseComponentPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , WebContainerOptions , WebSlideContainerPartOptions , WebComponentOptions {
    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}