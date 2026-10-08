package dev.reuise.web.core.accordion;
import dev.reuise.core.accordion.CoreAccordion;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebFlexContainer;
public interface WebAccordion extends WebFlexContainer , WebAccordionPart , WebComponent , CoreAccordion {
    WebAccordion getComponent();
}
