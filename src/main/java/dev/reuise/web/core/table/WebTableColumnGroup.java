package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableColumnGroup;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTableColumnGroup extends CoreTableColumnGroup , WebParentComponent , WebComponent , WebTableColumnGroupPart {
    WebTableColumnGroup getComponent();
}