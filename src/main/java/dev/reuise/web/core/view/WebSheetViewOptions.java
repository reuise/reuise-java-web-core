package dev.reuise.web.core.view;
import dev.reuise.core.view.CoreSheetViewOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.layout.WebFlexContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebSheetViewOptions extends CoreSheetViewOptions , WebViewPartOptions , WebBaseComponentPartOptions , WebViewOptions , WebFlexContainerPartOptions , WebContainerPartOptions , WebSheetViewPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebViewPartOptions getViewPart();

    WebFlexContainerPartOptions getFlexContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}