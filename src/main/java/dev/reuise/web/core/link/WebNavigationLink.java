package dev.reuise.web.core.link;
import dev.reuise.core.link.CoreNavigationLink;
import dev.reuise.web.core.WebComponent;
public interface WebNavigationLink extends WebLink , WebComponent , CoreNavigationLink , WebNavigationLinkPart {
    WebNavigationLink getComponent();
}