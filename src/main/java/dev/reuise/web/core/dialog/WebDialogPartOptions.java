package dev.reuise.web.core.dialog;
import dev.reuise.core.State;
import dev.reuise.core.dialog.CoreDialogPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebDialogPartOptions extends CoreDialogPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebDialog getComponent();
}