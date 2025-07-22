package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreIconLabelFeatures;
public interface WebIconLabelFeatures extends CoreIconLabelFeatures {
    WebIconLabelFeatures setLinkUrl(String url, Boolean useHistoryApi);
}