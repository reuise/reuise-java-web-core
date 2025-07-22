package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableHeaderCellOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebTableHeaderCellOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , WebTableHeaderCellPartOptions , WebParentComponentPartOptions , WebComponentOptions , CoreTableHeaderCellOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}