package dev.reuise.web.core.text;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.CoreHeadingPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebHeadingPartOptions extends CoreHeadingPartOptions {
    ComponentAnimation getAnimation();

    ComponentOption<ComponentAnimation> getAnimationOption();

    WebHeadingPartOptions setAnimation(ComponentAnimation animation);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebHeading getComponent();
}
