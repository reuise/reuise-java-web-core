package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableCellPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebTableCellPart extends WebParentComponentPart , CoreTableCellPart , WebTableCellFeatures , WebComponentPart {
    WebParentComponentPart getParentComponentPart();
}