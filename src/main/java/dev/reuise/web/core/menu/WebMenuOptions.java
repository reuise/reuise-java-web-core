package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebMenuOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , CoreMenuOptions , WebParentComponentPartOptions , WebMenuPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}