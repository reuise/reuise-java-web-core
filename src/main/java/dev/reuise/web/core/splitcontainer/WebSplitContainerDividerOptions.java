package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.splitcontainer.CoreSplitContainerDividerOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebSplitContainerDividerOptions extends WebSplitContainerDividerPartOptions , CoreSplitContainerDividerOptions , WebBaseComponentPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , WebContainerOptions , WebComponentOptions {
    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}