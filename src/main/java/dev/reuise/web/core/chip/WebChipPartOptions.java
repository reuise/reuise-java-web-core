package dev.reuise.web.core.chip;
import dev.reuise.core.State;
import dev.reuise.core.chip.CoreChipPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebChipPartOptions extends CoreChipPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebChip getComponent();
}