package dev.reuise.web.core.navigation;
import dev.reuise.core.navigation.CoreNavigationTreeOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.accordion.WebAccordionOptions;
import dev.reuise.web.core.accordion.WebAccordionPartOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.layout.WebFlexContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebNavigationTreeOptions extends WebAccordionPartOptions , WebBaseComponentPartOptions , WebAccordionOptions , WebFlexContainerPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , CoreNavigationTreeOptions , WebNavigationTreePartOptions , WebComponentOptions {
    WebAccordionPartOptions getAccordionPart();

    WebFlexContainerPartOptions getFlexContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
