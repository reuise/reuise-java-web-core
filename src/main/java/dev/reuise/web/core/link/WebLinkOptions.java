package dev.reuise.web.core.link;
import dev.reuise.core.link.CoreLinkOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebLinkOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , WebParentComponentPartOptions , WebLinkPartOptions , CoreLinkOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}