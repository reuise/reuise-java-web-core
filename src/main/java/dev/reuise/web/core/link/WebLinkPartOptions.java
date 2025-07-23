package dev.reuise.web.core.link;
import dev.reuise.core.State;
import dev.reuise.core.link.CoreLinkPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebLinkPartOptions extends CoreLinkPartOptions {
    boolean isUseHistoryApi();

    ComponentOption<Boolean> getUseHistoryApiOption();

    WebLinkPartOptions setUseHistoryApi(Boolean useHistoryApi);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebLinkPartOptions setUrl(String url, Boolean useHistoryApi);

    WebComponentFactory getComponentFactory();

    WebLink getComponent();
}