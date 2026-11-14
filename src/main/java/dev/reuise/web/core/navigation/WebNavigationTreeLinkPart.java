package dev.reuise.web.core.navigation;
import dev.reuise.core.navigation.CoreNavigationTreeLinkPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.link.WebNavigationLinkPart;
import dev.reuise.web.core.list.WebListItem;
public interface WebNavigationTreeLinkPart extends WebNavigationTreeLinkFeatures , WebComponentPart , CoreNavigationTreeLinkPart , WebNavigationLinkPart {
    WebListItem getItem();

    WebNavigationLinkPart getNavigationLinkPart();
}
