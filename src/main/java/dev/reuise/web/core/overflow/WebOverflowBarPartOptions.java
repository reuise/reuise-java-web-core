package dev.reuise.web.core.overflow;
import dev.reuise.core.State;
import dev.reuise.core.overflow.CoreOverflowBarPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebOverflowBarPartOptions extends CoreOverflowBarPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebOverflowBar getComponent();
}
