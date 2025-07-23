package dev.reuise.web.core.scriptcomponent;
public interface WebScriptComponentFeatures {
    String getUrl();

    WebScriptComponentFeatures setUrl(String url);

    String getType();

    WebScriptComponentFeatures setType(String type);

    String getLanguage();

    WebScriptComponentFeatures setLanguage(String language);

    String getCrossOrigin();

    WebScriptComponentFeatures setCrossOrigin(String crossOrigin);

    boolean isAsync();

    WebScriptComponentFeatures setAsync(Boolean async);

    boolean isDefer();

    WebScriptComponentFeatures setDefer(Boolean defer);

    String getCode();

    WebScriptComponentFeatures setCode(String code);
}