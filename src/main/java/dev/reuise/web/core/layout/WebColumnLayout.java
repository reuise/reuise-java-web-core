package dev.reuise.web.core.layout;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.layout.CoreColumnLayout;
import dev.reuise.web.core.WebComponent;
public interface WebColumnLayout extends CoreColumnLayout , WebFlexContainer , WebComponent , WebColumnLayoutPart {
    WebColumnLayout getComponent();

    WebColumnLayout setAnimation(ComponentAnimation animation);

    WebColumnLayout startAnimation();

    WebColumnLayout cancelAnimation();
}
