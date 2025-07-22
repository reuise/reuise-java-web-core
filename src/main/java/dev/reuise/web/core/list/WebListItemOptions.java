package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreListItemOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebListItemOptions extends WebBasicListItemPartOptions , WebBaseComponentPartOptions , CoreListItemOptions , WebListItemPartOptions , WebParentComponentPartOptions , WebBasicListItemOptions , WebComponentOptions {
    WebBasicListItemPartOptions getBasicListItemPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}