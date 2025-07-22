package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableBodyPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebTableBodyPart extends WebParentComponentPart , WebTableBodyFeatures , WebComponentPart , CoreTableBodyPart {
    WebParentComponentPart getParentComponentPart();
}