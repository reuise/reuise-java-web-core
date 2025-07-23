package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuDividerOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.list.WebBasicListItemPartOptions;
import dev.reuise.web.core.list.WebListItemPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebMenuDividerOptions extends CoreMenuDividerOptions , WebBasicListItemPartOptions , WebBaseComponentPartOptions , WebMenuDividerPartOptions , WebMenuItemOptions , WebListItemPartOptions , WebMenuItemPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebMenuItemPartOptions getMenuItemPart();

    WebListItemPartOptions getListItemPart();

    WebBasicListItemPartOptions getBasicListItemPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}