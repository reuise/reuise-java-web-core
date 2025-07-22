package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableHeaderRowOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebTableHeaderRowOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , WebTableHeaderRowPartOptions , WebParentComponentPartOptions , CoreTableHeaderRowOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}