package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableCellOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebTableCellOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , WebTableCellPartOptions , CoreTableCellOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}