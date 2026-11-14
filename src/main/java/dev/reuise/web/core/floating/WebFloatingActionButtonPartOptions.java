package dev.reuise.web.core.floating;
import dev.reuise.core.State;
import dev.reuise.core.floating.CoreFloatingActionButtonPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebFloatingActionButtonPartOptions extends CoreFloatingActionButtonPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebFloatingActionButton getComponent();
}
