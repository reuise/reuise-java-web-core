package dev.reuise.web.core.card;
import dev.reuise.core.card.CoreCardFeatures;
public interface WebCardFeatures extends CoreCardFeatures {
    String getImageAltText();

    WebCardFeatures setImageAltText(String imageAltText);

    WebCardFeatures setUrl(String url, Boolean useHistoryApi);
}