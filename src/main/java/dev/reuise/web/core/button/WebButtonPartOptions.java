package dev.reuise.web.core.button;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButtonPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebButtonPartOptions extends CoreButtonPartOptions {
    Double getHoverScale();

    ComponentOption<Double> getHoverScaleOption();

    WebButtonPartOptions setHoverScale(Double hoverScale);

    String getBorder();

    ComponentOption<String> getBorderOption();

    WebButtonPartOptions setBorder(String border);

    String getBorderColor();

    ComponentOption<String> getBorderColorOption();

    WebButtonPartOptions setBorderColor(String borderColor);

    String getBorderWidth();

    ComponentOption<String> getBorderWidthOption();

    WebButtonPartOptions setBorderWidth(String borderWidth);

    String getBorderRadius();

    ComponentOption<String> getBorderRadiusOption();

    WebButtonPartOptions setBorderRadius(String borderRadius);

    String getBackground();

    ComponentOption<String> getBackgroundOption();

    WebButtonPartOptions setBackground(String background);

    String getBackgroundColor();

    ComponentOption<String> getBackgroundColorOption();

    WebButtonPartOptions setBackgroundColor(String backgroundColor);

    boolean isUseHistoryApi();

    ComponentOption<Boolean> getUseHistoryApiOption();

    WebButtonPartOptions setUseHistoryApi(Boolean useHistoryApi);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebButtonPartOptions setBorder(boolean enabled);

    WebButtonPartOptions setBackground(boolean enabled);

    WebButtonPartOptions setUrl(String url, Boolean useHistoryApi);

    WebComponentFactory getComponentFactory();

    WebButton getComponent();
}
