package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreButtonFeatures;
public interface WebButtonFeatures extends CoreButtonFeatures {
    Double getHoverScale();

    WebButtonFeatures setHoverScale(Double hoverScale);

    String getBorder();

    WebButtonFeatures setBorder(String border);

    String getBorderColor();

    WebButtonFeatures setBorderColor(String borderColor);

    String getBorderWidth();

    WebButtonFeatures setBorderWidth(String borderWidth);

    String getBorderRadius();

    WebButtonFeatures setBorderRadius(String borderRadius);

    String getBackground();

    WebButtonFeatures setBackground(String background);

    String getBackgroundColor();

    WebButtonFeatures setBackgroundColor(String backgroundColor);

    boolean isUseHistoryApi();

    WebButtonFeatures setUseHistoryApi(Boolean useHistoryApi);

    WebButtonFeatures setBorder(boolean enabled);

    WebButtonFeatures setBackground(boolean enabled);

    WebButtonFeatures setUrl(String url, Boolean useHistoryApi);
}
