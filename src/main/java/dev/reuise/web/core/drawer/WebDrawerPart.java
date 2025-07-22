package dev.reuise.web.core.drawer;
import dev.reuise.core.drawer.CoreDrawerPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainerPart;
public interface WebDrawerPart extends WebComponentPart , WebContainerPart , CoreDrawerPart , WebDrawerFeatures {
    WebContainerPart getContainerPart();
}