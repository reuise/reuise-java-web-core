package dev.reuise.web.core.card;
import dev.reuise.core.State;
import dev.reuise.core.card.CoreCardPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebCardPartOptions extends CoreCardPartOptions {
    String getImageAltText();

    ComponentOption<String> getImageAltTextOption();

    WebCardPartOptions setImageAltText(String imageAltText);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebCardPartOptions setUrl(String url, Boolean useHistoryApi);

    WebComponentFactory getComponentFactory();

    WebCard getComponent();
}