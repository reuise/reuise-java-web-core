package dev.reuise.web.core.selectmenu;
import dev.reuise.core.selectmenu.CoreSelectMenuOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebSelectMenuOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , WebSelectMenuPartOptions , CoreSelectMenuOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}