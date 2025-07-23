package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableHeaderOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebTableHeaderOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , CoreTableHeaderOptions , WebParentComponentPartOptions , WebComponentOptions , WebTableHeaderPartOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}