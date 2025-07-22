package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableColumn;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTableColumn extends WebParentComponent , WebComponent , CoreTableColumn , WebTableColumnPart {
    WebTableColumn getComponent();
}