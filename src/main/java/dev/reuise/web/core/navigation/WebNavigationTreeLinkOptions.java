package dev.reuise.web.core.navigation;
import dev.reuise.core.navigation.CoreNavigationTreeLinkOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.link.WebLinkPartOptions;
import dev.reuise.web.core.link.WebNavigationLinkOptions;
import dev.reuise.web.core.link.WebNavigationLinkPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebNavigationTreeLinkOptions extends WebBaseComponentPartOptions , CoreNavigationTreeLinkOptions , WebNavigationLinkOptions , WebNavigationLinkPartOptions , WebParentComponentPartOptions , WebLinkPartOptions , WebNavigationTreeLinkPartOptions , WebComponentOptions {
    WebNavigationLinkPartOptions getNavigationLinkPart();

    WebLinkPartOptions getLinkPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
