package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerScrollAreaOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebScrollableContainerScrollAreaOptions extends CoreScrollableContainerScrollAreaOptions , WebBaseComponentPartOptions , WebParentComponentOptions , WebParentComponentPartOptions , WebScrollableContainerScrollAreaPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
