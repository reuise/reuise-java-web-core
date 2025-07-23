package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreCheckboxTableCellOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebCheckboxTableCellOptions extends WebBaseComponentPartOptions , WebTableCellPartOptions , WebParentComponentPartOptions , WebCheckboxTableCellPartOptions , WebTableCellOptions , WebComponentOptions , CoreCheckboxTableCellOptions {
    WebTableCellPartOptions getTableCellPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}