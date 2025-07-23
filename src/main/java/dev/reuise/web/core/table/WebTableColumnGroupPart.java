package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableColumnGroupPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebTableColumnGroupPart extends WebParentComponentPart , WebTableColumnGroupFeatures , WebComponentPart , CoreTableColumnGroupPart {
    WebParentComponentPart getParentComponentPart();
}