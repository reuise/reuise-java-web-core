package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreCheckboxTableColumn;
import dev.reuise.web.core.WebComponent;
public interface WebCheckboxTableColumn extends CoreCheckboxTableColumn , WebComponent , WebCheckboxTableColumnPart , WebTableColumn {
    WebCheckboxTableColumn getComponent();
}