package dev.reuise.web.core.accordion;
import dev.reuise.core.accordion.CoreAccordionItemPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebFlexContainer;
import dev.reuise.web.core.layout.WebFlexContainerPart;
public interface WebAccordionItemPart extends WebComponentPart , WebFlexContainerPart , WebAccordionItemFeatures , CoreAccordionItemPart {
    WebFlexContainer getHeader();

    WebButton getToggle();

    WebContainer getContent();

    WebFlexContainerPart getFlexContainerPart();
}
