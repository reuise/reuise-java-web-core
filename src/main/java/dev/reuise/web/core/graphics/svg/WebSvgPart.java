package dev.reuise.web.core.graphics.svg;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebSvgPart extends WebParentComponentPart , WebComponentPart , WebSvgFeatures {
    WebSvgPath addPath(String path);

    WebSvgPath addPath(String path, String fill, String stroke, double strokeWidth);

    WebSvgPath addPath(String path, String fill, String stroke);

    WebSvgPath addFillPath(String path, String fill);

    WebSvgPath addStrokePath(String path, String stroke, double strokeWidth);

    WebSvgPath addStrokePath(String path, String stroke);

    WebSvgPath addPath(WebSvgPathOptions options);

    WebParentComponentPart getParentComponentPart();
}