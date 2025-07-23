package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerEdgePartOptions;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.button.WebButton;
public interface WebScrollableContainerEdgePartOptions extends CoreScrollableContainerEdgePartOptions {
    WebButton getScrollButton();

    ComponentOption<WebButton> getScrollButtonOption();

    WebScrollableContainerEdgePartOptions setScrollButton(WebButton scrollButton);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebScrollableContainerEdge getComponent();
}