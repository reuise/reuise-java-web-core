package dev.reuise.web.core.graphics.svg;
import dev.reuise.web.core.WebComponentPart;
public interface WebSvgImagePart extends WebComponentPart , WebSvgImageFeatures , WebSvgPart {
    WebSvgPart getSvgPart();
}