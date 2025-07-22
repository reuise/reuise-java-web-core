package dev.reuise.web.core.applayout;
import dev.reuise.core.applayout.CoreAppLayoutOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebAppLayoutOptions extends WebAppLayoutPartOptions , CoreAppLayoutOptions , WebBaseComponentPartOptions , WebParentComponentOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}