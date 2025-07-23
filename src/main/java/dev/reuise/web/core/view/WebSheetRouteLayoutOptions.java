package dev.reuise.web.core.view;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.layout.WebSheetLayoutOptions;
import dev.reuise.web.core.layout.WebSheetLayoutPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebSheetRouteLayoutOptions extends WebSheetLayoutOptions , WebSheetLayoutPartOptions , WebBaseComponentPartOptions , WebSheetRouteLayoutPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , WebComponentOptions , WebSplitContainerPartOptions {
    WebSheetLayoutPartOptions getSheetLayoutPart();

    WebSplitContainerPartOptions getSplitContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}