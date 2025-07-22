package dev.reuise.web.core.scriptcomponent;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.document.ExternalScript;
public interface WebScriptComponentPartOptions {
    String getUrl();

    ComponentOption<String> getUrlOption();

    WebScriptComponentPartOptions setUrl(String url);

    String getType();

    ComponentOption<String> getTypeOption();

    WebScriptComponentPartOptions setType(String type);

    String getLanguage();

    ComponentOption<String> getLanguageOption();

    WebScriptComponentPartOptions setLanguage(String language);

    String getCrossOrigin();

    ComponentOption<String> getCrossOriginOption();

    WebScriptComponentPartOptions setCrossOrigin(String crossOrigin);

    boolean isAsync();

    ComponentOption<Boolean> getAsyncOption();

    WebScriptComponentPartOptions setAsync(Boolean async);

    boolean isDefer();

    ComponentOption<Boolean> getDeferOption();

    WebScriptComponentPartOptions setDefer(Boolean defer);

    String getCode();

    ComponentOption<String> getCodeOption();

    WebScriptComponentPartOptions setCode(String code);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebScriptComponentPartOptions setExternalScriptOptions(ExternalScript externalScript);

    WebComponentFactory getComponentFactory();

    WebScriptComponent getComponent();
}