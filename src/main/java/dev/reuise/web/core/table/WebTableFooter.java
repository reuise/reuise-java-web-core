package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTableFooter;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTableFooter extends WebParentComponent , WebComponent , CoreTableFooter , WebTableFooterPart {
    WebTableFooter getComponent();
}