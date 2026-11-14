package dev.reuise.web.core.menu;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.menu.CoreMenuButton;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebMenuButton extends WebMenuButtonPart , CoreMenuButton , WebComponent , WebContainer {
    WebMenuButton getComponent();

    WebMenuButton setAnimation(ComponentAnimation animation);

    WebMenuButton startAnimation();

    WebMenuButton cancelAnimation();
}
