package dev.reuise.web.core.navigation;
import dev.reuise.core.navigation.CoreNavigationTreeGroupOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.accordion.WebAccordionItemOptions;
import dev.reuise.web.core.accordion.WebAccordionItemPartOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.layout.WebFlexContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebNavigationTreeGroupOptions extends WebAccordionItemPartOptions , WebBaseComponentPartOptions , WebFlexContainerPartOptions , WebContainerPartOptions , CoreNavigationTreeGroupOptions , WebNavigationTreeGroupPartOptions , WebParentComponentPartOptions , WebAccordionItemOptions , WebComponentOptions {
    WebAccordionItemPartOptions getAccordionItemPart();

    WebFlexContainerPartOptions getFlexContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
