package dev.reuise.web.core.icon;
import dev.reuise.core.State;
import dev.reuise.core.icon.CoreIconPartOptions;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.graphics.svg.WebSvg;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
public interface WebIconPartOptions extends CoreIconPartOptions {
    String getAltText();

    ComponentOption<String> getAltTextOption();

    WebIconPartOptions setAltText(String altText);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebIconPartOptions setLinkUrl(String url, Boolean useHistoryApi);

    WebSvgOptions getSvgOptions();

    WebIconPartOptions setSvgOptions(WebSvgOptions svgOptions);

    boolean hasSvgOptions();

    ComponentCreator<? extends WebSvg, ? extends WebSvgOptions> getSvgCreator();

    WebComponentFactory getComponentFactory();

    WebIcon getComponent();
}