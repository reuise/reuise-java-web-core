package dev.reuise.web.core.chip;
import dev.reuise.core.State;
import dev.reuise.core.chip.CoreChipGroupPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebChipGroupPartOptions extends CoreChipGroupPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebChipGroup getComponent();
}