package dev.reuise.web.core.navigation;
import dev.reuise.core.navigation.CoreNavigationTreeGroupPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.accordion.WebAccordionItemPart;
public interface WebNavigationTreeGroupPart extends WebAccordionItemPart , CoreNavigationTreeGroupPart , WebComponentPart , WebNavigationTreeGroupFeatures {
    WebNavigationTreeLink getLink();

    WebNavigationTree getTree();

    WebAccordionItemPart getAccordionItemPart();
}
