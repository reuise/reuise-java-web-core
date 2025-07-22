package dev.reuise.web.core.image;
import dev.reuise.core.image.CoreImageFeatures;
public interface WebImageFeatures extends CoreImageFeatures {
    String getAltText();

    WebImageFeatures setAltText(String altText);

    WebImageFeatures setLinkUrl(String url, Boolean useHistoryApi);
}