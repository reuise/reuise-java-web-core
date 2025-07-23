package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.slidecontainer.CoreSlideContainerEdgeOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebSlideContainerEdgeOptions extends CoreSlideContainerEdgeOptions , WebBaseComponentPartOptions , WebParentComponentOptions , WebParentComponentPartOptions , WebSlideContainerEdgePartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}