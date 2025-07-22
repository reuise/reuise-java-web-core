package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableColumnGroupOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebTableColumnGroupOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , CoreTableColumnGroupOptions , WebParentComponentPartOptions , WebTableColumnGroupPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}