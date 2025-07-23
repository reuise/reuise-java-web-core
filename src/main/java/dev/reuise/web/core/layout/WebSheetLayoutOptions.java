package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreSheetLayoutOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
import dev.reuise.web.core.splitcontainer.WebSplitContainerOptions;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebSheetLayoutOptions extends WebSheetLayoutPartOptions , WebSplitContainerOptions , WebBaseComponentPartOptions , WebContainerPartOptions , CoreSheetLayoutOptions , WebParentComponentPartOptions , WebComponentOptions , WebSplitContainerPartOptions {
    WebSplitContainerPartOptions getSplitContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}