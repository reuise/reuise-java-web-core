package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableHeaderRow;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTableHeaderRow extends WebParentComponent , WebComponent , WebTableHeaderRowPart , CoreTableHeaderRow {
    WebTableHeaderRow getComponent();
}