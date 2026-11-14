package dev.reuise.web.core.navigation;
import dev.reuise.core.navigation.CoreNavigationTreePart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.accordion.WebAccordionPart;
public interface WebNavigationTreePart extends WebAccordionPart , CoreNavigationTreePart , WebComponentPart , WebNavigationTreeFeatures {
    WebAccordionPart getAccordionPart();
}
