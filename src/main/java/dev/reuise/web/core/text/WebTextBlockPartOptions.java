package dev.reuise.web.core.text;
import dev.reuise.core.State;
import dev.reuise.core.text.CoreTextBlockPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebTextBlockPartOptions extends CoreTextBlockPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebTextBlock getComponent();
}