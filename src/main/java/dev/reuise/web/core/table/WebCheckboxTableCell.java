package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreCheckboxTableCell;
import dev.reuise.web.core.WebComponent;
public interface WebCheckboxTableCell extends WebTableCell , WebComponent , CoreCheckboxTableCell , WebCheckboxTableCellPart {
    WebCheckboxTableCell getComponent();
}