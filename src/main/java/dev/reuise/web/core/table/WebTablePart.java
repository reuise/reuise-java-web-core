package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreTablePart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebTablePart extends WebParentComponentPart , WebComponentPart , WebTableFeatures , CoreTablePart {
    WebContainer getTable();

    WebTableColumnGroup getColumnGroup();

    WebTableHeader getHeader();

    WebTableBody getBody();

    WebTableFooter getFooter();

    WebParentComponentPart getParentComponentPart();
}