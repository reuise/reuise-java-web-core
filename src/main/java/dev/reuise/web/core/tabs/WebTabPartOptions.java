package dev.reuise.web.core.tabs;
import dev.reuise.core.State;
import dev.reuise.core.tabs.CoreTabPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebTabPartOptions extends CoreTabPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebTabPartOptions setUrl(String url, Boolean useHistoryApi);

    WebComponentFactory getComponentFactory();

    WebTab getComponent();
}