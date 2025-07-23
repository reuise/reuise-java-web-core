package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.scrollablecontainer.CoreScrollableContainerScrollAreaPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebScrollableContainerScrollAreaPart extends WebParentComponentPart , WebComponentPart , CoreScrollableContainerScrollAreaPart , WebScrollableContainerScrollAreaFeatures {
    WebContainer getScrollAreaTopFade();

    WebContainer getScrollAreaLeftFade();

    WebContainer getScrollAreaContent();

    WebContainer getScrollAreaBottomFade();

    WebContainer getScrollAreaRightFade();

    WebParentComponentPart getParentComponentPart();
}