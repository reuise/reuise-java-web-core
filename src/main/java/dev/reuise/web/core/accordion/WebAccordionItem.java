package dev.reuise.web.core.accordion;
import dev.reuise.core.accordion.CoreAccordionItem;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebFlexContainer;
public interface WebAccordionItem extends WebFlexContainer , WebAccordionItemPart , WebComponent , CoreAccordionItem {
    WebAccordionItem getComponent();
}