package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreButtonFeatures;
public interface WebButtonFeatures extends CoreButtonFeatures {
    boolean isUseHistoryApi();

    WebButtonFeatures setUseHistoryApi(Boolean useHistoryApi);

    WebButtonFeatures setUrl(String url, Boolean useHistoryApi);
}