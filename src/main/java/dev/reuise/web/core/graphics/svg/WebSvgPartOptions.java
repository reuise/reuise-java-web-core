package dev.reuise.web.core.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebSvgPartOptions {
    Double getX();

    ComponentOption<Double> getXOption();

    WebSvgPartOptions setX(Double x);

    Double getY();

    ComponentOption<Double> getYOption();

    WebSvgPartOptions setY(Double y);

    String getViewBox();

    ComponentOption<String> getViewBoxOption();

    WebSvgPartOptions setViewBox(String viewBox);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSvg getComponent();
}