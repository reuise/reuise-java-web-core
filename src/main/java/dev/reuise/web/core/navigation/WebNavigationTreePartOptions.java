package dev.reuise.web.core.navigation;
import dev.reuise.core.State;
import dev.reuise.core.navigation.CoreNavigationTreePartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebNavigationTreePartOptions extends CoreNavigationTreePartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebNavigationTree getComponent();
}
