package dev.reuise.web.core.divider;
import dev.reuise.core.State;
import dev.reuise.core.divider.CoreDividerPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebDividerPartOptions extends CoreDividerPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebDivider getComponent();
}