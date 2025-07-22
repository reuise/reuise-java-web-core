package dev.reuise.web.core.button;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButtonPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebButtonPartOptions extends CoreButtonPartOptions {
    boolean isUseHistoryApi();

    ComponentOption<Boolean> getUseHistoryApiOption();

    WebButtonPartOptions setUseHistoryApi(Boolean useHistoryApi);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebButtonPartOptions setUrl(String url, Boolean useHistoryApi);

    WebComponentFactory getComponentFactory();

    WebButton getComponent();
}