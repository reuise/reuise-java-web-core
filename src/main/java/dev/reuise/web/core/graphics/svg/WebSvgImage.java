package dev.reuise.web.core.graphics.svg;
import dev.reuise.web.core.WebComponent;
public interface WebSvgImage extends WebSvg , WebSvgImagePart , WebComponent {
    WebSvgImage getComponent();
}