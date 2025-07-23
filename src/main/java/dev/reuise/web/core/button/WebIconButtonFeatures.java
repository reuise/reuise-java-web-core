package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreIconButtonFeatures;
public interface WebIconButtonFeatures extends CoreIconButtonFeatures {
    boolean isUseHistoryApi();

    WebIconButtonFeatures setUseHistoryApi(Boolean useHistoryApi);

    WebIconButtonFeatures setUrl(String url, Boolean useHistoryApi);
}