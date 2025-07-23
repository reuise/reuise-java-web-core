package dev.reuise.web.core.menu;
import dev.reuise.core.State;
import dev.reuise.core.menu.CoreMenuDividerPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebMenuDividerPartOptions extends CoreMenuDividerPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebMenuDivider getComponent();
}