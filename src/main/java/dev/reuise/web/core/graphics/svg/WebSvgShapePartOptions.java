package dev.reuise.web.core.graphics.svg;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
public interface WebSvgShapePartOptions {
    String getFill();

    ComponentOption<String> getFillOption();

    WebSvgShapePartOptions setFill(String fill);

    String getStroke();

    ComponentOption<String> getStrokeOption();

    WebSvgShapePartOptions setStroke(String stroke);

    Double getStrokeWidth();

    ComponentOption<Double> getStrokeWidthOption();

    WebSvgShapePartOptions setStrokeWidth(Double strokeWidth);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebSvgShape getComponent();
}