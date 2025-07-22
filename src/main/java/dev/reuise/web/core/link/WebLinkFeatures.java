package dev.reuise.web.core.link;
import dev.reuise.core.link.CoreLinkFeatures;
public interface WebLinkFeatures extends CoreLinkFeatures {
    boolean isUseHistoryApi();

    WebLinkFeatures setUseHistoryApi(Boolean useHistoryApi);

    WebLinkFeatures setUrl(String url, Boolean useHistoryApi);
}