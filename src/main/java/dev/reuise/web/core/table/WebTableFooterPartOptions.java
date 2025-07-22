package dev.reuise.web.core.table;
import dev.reuise.core.State;
import dev.reuise.core.table.CoreTableFooterPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebTableFooterPartOptions extends CoreTableFooterPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebTableFooter getComponent();
}