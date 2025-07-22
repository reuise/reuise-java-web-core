package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableRowPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebTableRowPart extends WebParentComponentPart , WebTableRowFeatures , WebComponentPart , CoreTableRowPart {
    WebParentComponentPart getParentComponentPart();
}