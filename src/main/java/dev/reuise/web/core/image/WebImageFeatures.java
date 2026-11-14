package dev.reuise.web.core.image;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.HasAnimation;
import dev.reuise.core.image.CoreImageFeatures;
public interface WebImageFeatures extends HasAnimation , CoreImageFeatures {
    ComponentAnimation getAnimation();

    WebImageFeatures setAnimation(ComponentAnimation animation);

    String getAltText();

    WebImageFeatures setAltText(String altText);

    WebImageFeatures setLinkUrl(String url, Boolean useHistoryApi);
}
