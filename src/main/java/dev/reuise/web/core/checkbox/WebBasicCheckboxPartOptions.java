package dev.reuise.web.core.checkbox;
import dev.reuise.core.State;
import dev.reuise.core.checkbox.CoreBasicCheckboxPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebBasicCheckboxPartOptions extends CoreBasicCheckboxPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebBasicCheckbox getComponent();
}