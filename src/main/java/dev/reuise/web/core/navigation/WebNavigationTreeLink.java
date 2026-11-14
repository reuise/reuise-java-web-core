package dev.reuise.web.core.navigation;
import dev.reuise.core.navigation.CoreNavigationTreeLink;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.link.WebNavigationLink;
public interface WebNavigationTreeLink extends WebNavigationLink , WebNavigationTreeLinkPart , WebComponent , CoreNavigationTreeLink {
    WebNavigationTreeLink getComponent();
}
