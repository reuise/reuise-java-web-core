package dev.reuise.web.core.badge;
import dev.reuise.core.badge.CoreBadgeOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebBadgeOptions extends WebBaseComponentPartOptions , WebBaseComponentOptions , WebBadgePartOptions , CoreBadgeOptions , WebComponentOptions {
    WebBaseComponentPartOptions getBaseComponentPart();
}