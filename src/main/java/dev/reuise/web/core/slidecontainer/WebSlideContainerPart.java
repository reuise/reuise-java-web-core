package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.slidecontainer.CoreSlideContainerPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
public interface WebSlideContainerPart extends CoreSlideContainerPart , WebComponentPart , WebContainerPart , WebSlideContainerFeatures {
    WebContainer getSlideAreaBefore();

    WebContainer getSlideArea();

    WebContainer getSlideAreaAfter();

    WebContainerPart getContainerPart();
}