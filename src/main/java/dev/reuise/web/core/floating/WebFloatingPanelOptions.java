package dev.reuise.web.core.floating;
import dev.reuise.core.floating.CoreFloatingPanelOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebFloatingPanelOptions extends WebFloatingPanelPartOptions , WebBaseComponentPartOptions , WebContainerPartOptions , CoreFloatingPanelOptions , WebParentComponentPartOptions , WebContainerOptions , WebComponentOptions {
    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
