package dev.reuise.web.core.text;
import dev.reuise.core.State;
import dev.reuise.core.text.CoreLabelPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebLabelPartOptions extends CoreLabelPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebLabel getComponent();
}