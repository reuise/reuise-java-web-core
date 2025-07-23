package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanelOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebSplitContainerPanelOptions extends WebBaseComponentPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , WebContainerOptions , WebSplitContainerPanelPartOptions , WebComponentOptions , CoreSplitContainerPanelOptions {
    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}