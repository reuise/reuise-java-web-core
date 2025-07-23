package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableHeaderRowPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebTableHeaderRowPart extends WebParentComponentPart , WebTableHeaderRowFeatures , CoreTableHeaderRowPart , WebComponentPart {
    WebParentComponentPart getParentComponentPart();
}