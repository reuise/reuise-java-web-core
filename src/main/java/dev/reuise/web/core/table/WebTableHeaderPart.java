package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableHeaderPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebTableHeaderPart extends WebParentComponentPart , WebTableHeaderFeatures , WebComponentPart , CoreTableHeaderPart {
    WebTableHeaderRow getRow();

    WebParentComponentPart getParentComponentPart();
}