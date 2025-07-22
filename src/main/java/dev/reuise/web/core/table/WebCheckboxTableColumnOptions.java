package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreCheckboxTableColumnOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebCheckboxTableColumnOptions extends CoreCheckboxTableColumnOptions , WebTableColumnPartOptions , WebBaseComponentPartOptions , WebTableColumnOptions , WebCheckboxTableColumnPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebTableColumnPartOptions getTableColumnPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}