package dev.reuise.web.core.graphics.svg;
import dev.reuise.web.core.WebComponentPart;
public interface WebSvgShapePart extends WebSvgShapeFeatures , WebComponentPart , WebSvgPart {
    WebSvgPart getSvgPart();
}