package dev.reuise.web.core.table;
import dev.reuise.core.State;
import dev.reuise.core.table.CoreCheckboxTableColumnPartOptions;
import dev.reuise.web.core.WebComponentFactory;
// Checked here??
public interface WebCheckboxTableColumnPartOptions extends CoreCheckboxTableColumnPartOptions {
    boolean isChecked();

    WebCheckboxTableColumnPartOptions setChecked(Boolean checked);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebCheckboxTableColumn getComponent();
}