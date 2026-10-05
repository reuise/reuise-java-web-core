package dev.reuise.web.core.accordion;
import dev.reuise.core.accordion.CoreAccordionPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebFlexContainerPart;
public interface WebAccordionPart extends CoreAccordionPart , WebComponentPart , WebFlexContainerPart , WebAccordionFeatures {
    WebFlexContainerPart getFlexContainerPart();
}