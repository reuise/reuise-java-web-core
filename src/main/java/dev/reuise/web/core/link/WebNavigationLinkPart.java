package dev.reuise.web.core.link;
import dev.reuise.core.link.CoreNavigationLinkPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebNavigationLinkPart extends CoreNavigationLinkPart , WebNavigationLinkFeatures , WebLinkPart , WebComponentPart {
    WebLinkPart getLinkPart();
}