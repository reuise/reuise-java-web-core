package dev.reuise.web.core.graphics.svg;
import dev.reuise.web.core.WebComponent;
public interface WebSvgGroup extends WebSvg , WebComponent , WebSvgGroupPart {
    WebSvgGroup getComponent();
}