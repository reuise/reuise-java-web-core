package dev.reuise.web.core.topappbar;
import dev.reuise.core.State;
import dev.reuise.core.topappbar.CoreTopAppBarPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebTopAppBarPartOptions extends CoreTopAppBarPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebTopAppBar getComponent();
}