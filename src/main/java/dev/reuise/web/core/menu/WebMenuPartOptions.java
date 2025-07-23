package dev.reuise.web.core.menu;
import dev.reuise.core.State;
import dev.reuise.core.menu.CoreMenuPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebMenuPartOptions extends CoreMenuPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebMenu getComponent();
}