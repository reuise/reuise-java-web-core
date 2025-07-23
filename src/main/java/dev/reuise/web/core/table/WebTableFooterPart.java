package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableFooterPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebTableFooterPart extends WebParentComponentPart , CoreTableFooterPart , WebTableFooterFeatures , WebComponentPart {
    WebParentComponentPart getParentComponentPart();
}