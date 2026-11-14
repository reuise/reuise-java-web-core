package dev.reuise.web.core.floating;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.floating.CoreFloatingPanel;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebFloatingPanel extends CoreFloatingPanel , WebComponent , WebContainer , WebFloatingPanelPart {
    WebFloatingPanel getComponent();

    WebFloatingPanel setAnimation(ComponentAnimation animation);

    WebFloatingPanel startAnimation();

    WebFloatingPanel cancelAnimation();
}
