package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.State;
import dev.reuise.core.splitcontainer.CoreSplitContainerDividerPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebSplitContainerDividerPartOptions extends CoreSplitContainerDividerPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSplitContainerDivider getComponent();
}