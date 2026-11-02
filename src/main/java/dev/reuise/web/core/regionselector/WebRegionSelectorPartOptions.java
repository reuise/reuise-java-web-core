package dev.reuise.web.core.regionselector;
import dev.reuise.core.State;
import dev.reuise.core.regionselector.CoreRegionSelectorPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebRegionSelectorPartOptions extends CoreRegionSelectorPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebRegionSelector getComponent();
}
