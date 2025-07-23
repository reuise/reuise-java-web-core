package dev.reuise.web.core.view;
import dev.reuise.core.view.CoreViewOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.layout.WebFlexContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebViewOptions extends WebFlexContainerOptions , WebViewPartOptions , CoreViewOptions , WebBaseComponentPartOptions , WebFlexContainerPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebFlexContainerPartOptions getFlexContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}