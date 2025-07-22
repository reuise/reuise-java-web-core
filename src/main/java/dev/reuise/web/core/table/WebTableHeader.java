package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableHeader;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTableHeader extends WebParentComponent , WebComponent , CoreTableHeader , WebTableHeaderPart {
    WebTableHeader getComponent();
}