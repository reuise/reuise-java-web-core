package dev.reuise.web.core.text;
import dev.reuise.core.State;
import dev.reuise.core.text.CoreIconLabelPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebIconLabelPartOptions extends CoreIconLabelPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebIconLabelPartOptions setLinkUrl(String url, Boolean useHistoryApi);

    WebComponentFactory getComponentFactory();

    WebIconLabel getComponent();
}