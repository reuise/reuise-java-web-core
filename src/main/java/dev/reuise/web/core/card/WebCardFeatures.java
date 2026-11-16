package dev.reuise.web.core.card;
import dev.reuise.core.card.CoreCardFeatures;
public interface WebCardFeatures extends CoreCardFeatures {
    Double getHoverScale();

    WebCardFeatures setHoverScale(Double hoverScale);

    String getImageAltText();

    WebCardFeatures setImageAltText(String imageAltText);

    WebCardFeatures setUrl(String url, Boolean useHistoryApi);
}
