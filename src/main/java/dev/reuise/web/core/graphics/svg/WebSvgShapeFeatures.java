package dev.reuise.web.core.graphics.svg;
public interface WebSvgShapeFeatures {
    String getFill();

    WebSvgShapeFeatures setFill(String fill);

    String getStroke();

    WebSvgShapeFeatures setStroke(String stroke);

    Double getStrokeWidth();

    WebSvgShapeFeatures setStrokeWidth(Double strokeWidth);
}