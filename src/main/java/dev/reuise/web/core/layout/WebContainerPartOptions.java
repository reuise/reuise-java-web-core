package dev.reuise.web.core.layout;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.State;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebContainerPartOptions extends CoreContainerPartOptions {
    ComponentAnimation getAnimation();

    ComponentOption<ComponentAnimation> getAnimationOption();

    WebContainerPartOptions setAnimation(ComponentAnimation animation);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebContainer getComponent();
}
