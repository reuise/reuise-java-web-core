package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTable;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTable extends WebParentComponent , WebTablePart , WebComponent , CoreTable {
    WebTable getComponent();
}