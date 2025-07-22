package dev.reuise.web.core.table;
import dev.reuise.core.table.CoreCheckboxTableColumnPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.checkbox.WebCheckbox;
// Checked here??
public interface WebCheckboxTableColumnPart extends WebCheckboxTableColumnFeatures , CoreCheckboxTableColumnPart , WebComponentPart , WebTableColumnPart {
    boolean isChecked();

    WebCheckboxTableColumnPart setChecked(Boolean checked);

    WebCheckbox getCheckbox();

    WebTableColumnPart getTableColumnPart();
}