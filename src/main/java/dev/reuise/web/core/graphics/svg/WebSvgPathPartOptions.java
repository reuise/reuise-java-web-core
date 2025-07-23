package dev.reuise.web.core.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebSvgPathPartOptions {
    String getPath();

    ComponentOption<String> getPathOption();

    WebSvgPathPartOptions setPath(String path);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSvgPath getComponent();
}