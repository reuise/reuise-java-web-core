package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
public interface WebScrollableContainerPart extends WebScrollableContainerFeatures , WebComponentPart , WebContainerPart , CoreScrollableContainerPart {
    WebContainer getScrollAreaBefore();

    WebScrollableContainerScrollArea getScrollArea();

    WebContainer getScrollAreaAfter();

    WebContainerPart getContainerPart();
}