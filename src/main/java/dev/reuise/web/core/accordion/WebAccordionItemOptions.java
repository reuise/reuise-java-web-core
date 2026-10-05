package dev.reuise.web.core.accordion;
import dev.reuise.core.accordion.CoreAccordionItemOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.layout.WebContainerPartOptions;
import dev.reuise.web.core.layout.WebFlexContainerOptions;
import dev.reuise.web.core.layout.WebFlexContainerPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebAccordionItemOptions extends WebFlexContainerOptions , WebAccordionItemPartOptions , WebBaseComponentPartOptions , WebFlexContainerPartOptions , WebContainerPartOptions , CoreAccordionItemOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebFlexContainerPartOptions getFlexContainerPart();

    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}