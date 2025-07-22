package dev.reuise.web.core.tabs;
import dev.reuise.core.State;
import dev.reuise.core.tabs.CoreTabBarPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebTabBarPartOptions extends CoreTabBarPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebTabBar getComponent();
}