package dev.reuise.web.core.text;
import dev.reuise.core.State;
import dev.reuise.core.text.CoreTextPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebTextPartOptions extends CoreTextPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebText getComponent();
}