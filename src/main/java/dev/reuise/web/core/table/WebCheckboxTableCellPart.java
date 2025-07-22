package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreCheckboxTableCellPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.checkbox.WebCheckbox;
public interface WebCheckboxTableCellPart extends WebCheckboxTableCellFeatures , CoreCheckboxTableCellPart , WebTableCellPart , WebComponentPart {
    WebCheckbox getCheckbox();

    WebTableCellPart getTableCellPart();
}