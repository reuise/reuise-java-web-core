package dev.reuise.web.core.input;
import dev.reuise.core.State;
import dev.reuise.core.input.CoreSearchFieldPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebSearchFieldPartOptions extends CoreSearchFieldPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSearchField getComponent();
}