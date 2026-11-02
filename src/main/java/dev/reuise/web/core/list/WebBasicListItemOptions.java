package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreBasicListItemOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebBasicListItemOptions extends WebBasicListItemPartOptions , WebBaseComponentPartOptions , WebParentComponentOptions , CoreBasicListItemOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
