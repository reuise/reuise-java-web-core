package dev.reuise.web.core.graphics.svg;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebSvg extends WebParentComponent , WebComponent , WebSvgPart {
    WebSvg getComponent();
}