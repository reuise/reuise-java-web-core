package dev.reuise.web.core.link;
import dev.reuise.core.link.CoreNavigationLinkOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebNavigationLinkOptions extends CoreNavigationLinkOptions , WebBaseComponentPartOptions , WebNavigationLinkPartOptions , WebParentComponentPartOptions , WebLinkPartOptions , WebComponentOptions , WebLinkOptions {
    WebLinkPartOptions getLinkPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}