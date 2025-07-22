package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebScrollableContainerOptions extends WebBaseComponentPartOptions , WebScrollableContainerPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , WebContainerOptions , CoreScrollableContainerOptions , WebComponentOptions {
    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}