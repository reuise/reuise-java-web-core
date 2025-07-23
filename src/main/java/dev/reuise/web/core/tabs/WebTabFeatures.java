package dev.reuise.web.core.tabs;
import dev.reuise.core.tabs.CoreTabFeatures;
public interface WebTabFeatures extends CoreTabFeatures {
    WebTabFeatures setUrl(String url, Boolean useHistoryApi);
}