package dev.reuise.web.core.button;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreIconButtonPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebIconButtonPartOptions extends CoreIconButtonPartOptions {
    boolean isUseHistoryApi();

    ComponentOption<Boolean> getUseHistoryApiOption();

    WebIconButtonPartOptions setUseHistoryApi(Boolean useHistoryApi);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebIconButtonPartOptions setUrl(String url, Boolean useHistoryApi);

    WebComponentFactory getComponentFactory();

    WebIconButton getComponent();
}