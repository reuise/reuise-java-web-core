package dev.reuise.web.core.checkbox;
import dev.reuise.core.State;
import dev.reuise.core.checkbox.CheckboxSize;
import dev.reuise.core.checkbox.CoreCheckboxPartOptions;
import dev.reuise.web.core.WebComponentFactory;
// Size here??
public interface WebCheckboxPartOptions extends CoreCheckboxPartOptions {
    CheckboxSize getSize();

    WebCheckboxPartOptions setSize(CheckboxSize size);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebCheckbox getComponent();
}