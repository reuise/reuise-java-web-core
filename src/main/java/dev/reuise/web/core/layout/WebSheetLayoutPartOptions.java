package dev.reuise.web.core.layout;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreSheetLayoutPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebSheetLayoutPartOptions extends CoreSheetLayoutPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSheetLayout getComponent();
}