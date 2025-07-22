package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.State;
import dev.reuise.core.slidecontainer.CoreSlideContainerPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebSlideContainerPartOptions extends CoreSlideContainerPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSlideContainer getComponent();
}