package dev.reuise.web.core.parentcomponent;
import dev.reuise.core.State;
import dev.reuise.core.parentcomponent.CoreParentComponentPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebParentComponentPartOptions extends CoreParentComponentPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebParentComponent getComponent();
}