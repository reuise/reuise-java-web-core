package dev.reuise.web.core.table;
import dev.reuise.core.State;
import dev.reuise.core.table.CoreTableHeaderRowPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebTableHeaderRowPartOptions extends CoreTableHeaderRowPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebTableHeaderRow getComponent();
}