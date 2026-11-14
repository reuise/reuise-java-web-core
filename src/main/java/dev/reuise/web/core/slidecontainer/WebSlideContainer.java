package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.slidecontainer.CoreSlideContainer;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebSlideContainer extends WebSlideContainerPart , WebComponent , CoreSlideContainer , WebContainer {
    WebSlideContainer getComponent();

    WebSlideContainer setAnimation(ComponentAnimation animation);

    WebSlideContainer startAnimation();

    WebSlideContainer cancelAnimation();
}
