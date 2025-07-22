package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreBasicListItemFeatures;
public interface WebBasicListItemFeatures extends CoreBasicListItemFeatures {
    WebBasicListItemFeatures setUrl(String url, Boolean useHistoryApi);
}