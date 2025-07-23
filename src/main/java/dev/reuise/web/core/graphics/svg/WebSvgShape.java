package dev.reuise.web.core.graphics.svg;
import dev.reuise.web.core.WebComponent;
public interface WebSvgShape extends WebSvg , WebComponent , WebSvgShapePart {
    WebSvgShape getComponent();
}