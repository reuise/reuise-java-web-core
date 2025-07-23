package dev.reuise.web.core.badge;
import dev.reuise.core.State;
import dev.reuise.core.badge.CoreBadgePartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebBadgePartOptions extends CoreBadgePartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebBadge getComponent();
}