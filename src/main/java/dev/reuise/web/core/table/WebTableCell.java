package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableCell;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTableCell extends WebParentComponent , WebComponent , WebTableCellPart , CoreTableCell {
    WebTableCell getComponent();
}