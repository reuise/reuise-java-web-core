package dev.reuise.web.core.applayout;
import dev.reuise.core.State;
import dev.reuise.core.applayout.CoreAppLayoutPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebAppLayoutPartOptions extends CoreAppLayoutPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebAppLayout getComponent();
}