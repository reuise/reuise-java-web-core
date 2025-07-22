package dev.reuise.web.core.dialog;
import dev.reuise.core.State;
import dev.reuise.core.dialog.CoreMessageDialogPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebMessageDialogPartOptions extends CoreMessageDialogPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebMessageDialog getComponent();
}