package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuButtonOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebMenuButtonOptions extends WebMenuButtonPartOptions , WebBaseComponentPartOptions , WebContainerPartOptions , CoreMenuButtonOptions , WebParentComponentPartOptions , WebContainerOptions , WebComponentOptions {
    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
