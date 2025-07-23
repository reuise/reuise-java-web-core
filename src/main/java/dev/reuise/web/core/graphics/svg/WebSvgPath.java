package dev.reuise.web.core.graphics.svg;
import dev.reuise.web.core.WebComponent;
public interface WebSvgPath extends WebSvgShape , WebSvgPathPart , WebComponent {
    WebSvgPath getComponent();
}