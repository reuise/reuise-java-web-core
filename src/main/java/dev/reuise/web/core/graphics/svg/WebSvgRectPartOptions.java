package dev.reuise.web.core.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.web.core.WebComponentFactory;
public interface WebSvgRectPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSvgRect getComponent();
}