package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableRowOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebTableRowOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , WebParentComponentPartOptions , CoreTableRowOptions , WebComponentOptions , WebTableRowPartOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}