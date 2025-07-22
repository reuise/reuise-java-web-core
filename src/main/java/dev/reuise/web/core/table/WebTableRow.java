package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableRow;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTableRow extends WebTableRowPart , CoreTableRow , WebParentComponent , WebComponent {
    WebTableRow getComponent();
}