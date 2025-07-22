package dev.reuise.web.core.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebSvgImagePartOptions {
    String getHref();

    ComponentOption<String> getHrefOption();

    WebSvgImagePartOptions setHref(String href);

    String getPreserveAspectRatio();

    ComponentOption<String> getPreserveAspectRatioOption();

    WebSvgImagePartOptions setPreserveAspectRatio(String preserveAspectRatio);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSvgImage getComponent();
}