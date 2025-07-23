package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuItemOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.list.WebBasicListItemPartOptions;
import dev.reuise.web.core.list.WebListItemOptions;
import dev.reuise.web.core.list.WebListItemPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebMenuItemOptions extends WebBasicListItemPartOptions , WebBaseComponentPartOptions , WebListItemOptions , CoreMenuItemOptions , WebListItemPartOptions , WebMenuItemPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebListItemPartOptions getListItemPart();

    WebBasicListItemPartOptions getBasicListItemPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}