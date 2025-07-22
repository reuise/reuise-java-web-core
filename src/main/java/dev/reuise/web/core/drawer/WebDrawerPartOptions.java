package dev.reuise.web.core.drawer;
import dev.reuise.core.State;
import dev.reuise.core.drawer.CoreDrawerPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebDrawerPartOptions extends CoreDrawerPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebDrawer getComponent();
}