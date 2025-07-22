package dev.reuise.web.core.view;
import dev.reuise.core.State;
import dev.reuise.core.view.CoreSheetViewPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebSheetViewPartOptions extends CoreSheetViewPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSheetView getComponent();
}