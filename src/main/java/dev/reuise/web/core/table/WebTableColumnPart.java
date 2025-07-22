package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableColumnPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebTableColumnPart extends WebParentComponentPart , WebComponentPart , CoreTableColumnPart , WebTableColumnFeatures {
    WebParentComponentPart getParentComponentPart();
}