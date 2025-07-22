package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableBody;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTableBody extends WebParentComponent , WebTableBodyPart , WebComponent , CoreTableBody {
    WebTableBody getComponent();
}