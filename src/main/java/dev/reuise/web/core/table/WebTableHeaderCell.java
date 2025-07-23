package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableHeaderCell;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTableHeaderCell extends WebParentComponent , WebTableHeaderCellPart , WebComponent , CoreTableHeaderCell {
    WebTableHeaderCell getComponent();
}