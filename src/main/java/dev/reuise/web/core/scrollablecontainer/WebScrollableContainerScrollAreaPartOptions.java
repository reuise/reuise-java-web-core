package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.State;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerScrollAreaPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebScrollableContainerScrollAreaPartOptions extends CoreScrollableContainerScrollAreaPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebScrollableContainerScrollArea getComponent();
}