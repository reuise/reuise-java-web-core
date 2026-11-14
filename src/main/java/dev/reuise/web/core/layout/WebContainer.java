package dev.reuise.web.core.layout;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.layout.CoreContainer;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebContainer extends WebParentComponent , CoreContainer , WebComponent , WebContainerPart {
    WebContainer getComponent();

    WebContainer setAnimation(ComponentAnimation animation);

    WebContainer startAnimation();

    WebContainer cancelAnimation();
}
