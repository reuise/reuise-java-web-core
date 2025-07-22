package dev.reuise.web.core.image;
import dev.reuise.core.State;
import dev.reuise.core.image.CoreImagePartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebImagePartOptions extends CoreImagePartOptions {
    String getAltText();

    ComponentOption<String> getAltTextOption();

    WebImagePartOptions setAltText(String altText);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebImagePartOptions setLinkUrl(String url, Boolean useHistoryApi);

    WebComponentFactory getComponentFactory();

    WebImage getComponent();
}