package dev.reuise.web.core.graphics.svg;
import dev.reuise.web.core.WebComponentPart;
public interface WebSvgGroupPart extends WebComponentPart , WebSvgPart , WebSvgGroupFeatures {
    WebSvgPart getSvgPart();
}