package dev.reuise.web.core.navigation;
import dev.reuise.core.State;
import dev.reuise.core.navigation.CoreNavigationTreeGroupPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebNavigationTreeGroupPartOptions extends CoreNavigationTreeGroupPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebNavigationTreeGroup getComponent();
}
