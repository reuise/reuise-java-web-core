package dev.reuise.web.core.progressindicator;
import dev.reuise.core.State;
import dev.reuise.core.progressindicator.CoreProgressIndicatorPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebProgressIndicatorPartOptions extends CoreProgressIndicatorPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebProgressIndicator getComponent();
}