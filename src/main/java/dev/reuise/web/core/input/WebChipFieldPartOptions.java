package dev.reuise.web.core.input;
import dev.reuise.core.State;
import dev.reuise.core.input.CoreChipFieldPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebChipFieldPartOptions extends CoreChipFieldPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebChipField getComponent();
}