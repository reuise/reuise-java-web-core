package dev.reuise.web.core.list;
import dev.reuise.core.State;
import dev.reuise.core.list.CoreListItemPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebListItemPartOptions extends CoreListItemPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebListItem getComponent();
}