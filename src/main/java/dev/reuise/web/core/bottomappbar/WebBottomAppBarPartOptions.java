package dev.reuise.web.core.bottomappbar;
import dev.reuise.core.State;
import dev.reuise.core.bottomappbar.CoreBottomAppBarPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebBottomAppBarPartOptions extends CoreBottomAppBarPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebBottomAppBar getComponent();
}