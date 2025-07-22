package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.State;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebScrollableContainerPartOptions extends CoreScrollableContainerPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebScrollableContainer getComponent();
}