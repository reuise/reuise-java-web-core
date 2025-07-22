package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.slidecontainer.CoreSlideContainerEdgePartOptions;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.button.WebButton;
public interface WebSlideContainerEdgePartOptions extends CoreSlideContainerEdgePartOptions {
    WebButton getSlideButton();

    ComponentOption<WebButton> getSlideButtonOption();

    WebSlideContainerEdgePartOptions setSlideButton(WebButton slideButton);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSlideContainerEdge getComponent();
}