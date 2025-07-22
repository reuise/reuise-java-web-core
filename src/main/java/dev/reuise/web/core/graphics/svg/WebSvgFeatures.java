package dev.reuise.web.core.graphics.svg;
public interface WebSvgFeatures {
    Double getX();

    WebSvgFeatures setX(Double x);

    Double getY();

    WebSvgFeatures setY(Double y);

    String getViewBox();

    WebSvgFeatures setViewBox(String viewBox);
}