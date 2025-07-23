package dev.reuise.web.core.list;
import dev.reuise.core.State;
import dev.reuise.core.list.CoreBasicListItemPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebBasicListItemPartOptions extends CoreBasicListItemPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBasicListItemPartOptions setUrl(String url, Boolean useHistoryApi);

    WebComponentFactory getComponentFactory();

    WebBasicListItem getComponent();
}