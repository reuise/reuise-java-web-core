package dev.reuise.web.core.graphics.svg;
import dev.reuise.web.core.WebComponentPart;
public interface WebSvgPathPart extends WebSvgPathFeatures , WebComponentPart , WebSvgShapePart {
    WebSvgShapePart getSvgShapePart();
}