package dev.reuise.web.core.skeleton;
import dev.reuise.core.State;
import dev.reuise.core.skeleton.CoreSkeletonPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebSkeletonPartOptions extends CoreSkeletonPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSkeleton getComponent();
}