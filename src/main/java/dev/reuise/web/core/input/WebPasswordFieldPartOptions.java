package dev.reuise.web.core.input;
import dev.reuise.core.State;
import dev.reuise.core.input.CorePasswordFieldPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebPasswordFieldPartOptions extends CorePasswordFieldPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebPasswordField getComponent();
}