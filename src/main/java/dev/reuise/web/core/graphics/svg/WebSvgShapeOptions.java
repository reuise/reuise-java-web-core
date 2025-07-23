package dev.reuise.web.core.graphics.svg;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebSvgShapeOptions extends WebSvgOptions , WebBaseComponentPartOptions , WebSvgShapePartOptions , WebParentComponentPartOptions , WebSvgPartOptions , WebComponentOptions {
    WebSvgPartOptions getSvgPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}