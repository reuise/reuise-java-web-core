package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreListViewOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebListViewOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , CoreListViewOptions , WebParentComponentPartOptions , WebListViewPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}