package dev.reuise.web.core.graphics.svg;
public interface WebSvgImageFeatures {
    String getHref();

    WebSvgImageFeatures setHref(String href);

    String getPreserveAspectRatio();

    WebSvgImageFeatures setPreserveAspectRatio(String preserveAspectRatio);
}