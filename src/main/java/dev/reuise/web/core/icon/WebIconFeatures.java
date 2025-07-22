package dev.reuise.web.core.icon;
import dev.reuise.core.icon.CoreIconFeatures;
public interface WebIconFeatures extends CoreIconFeatures {
    String getAltText();

    WebIconFeatures setAltText(String altText);

    WebIconFeatures setLinkUrl(String url, Boolean useHistoryApi);
}