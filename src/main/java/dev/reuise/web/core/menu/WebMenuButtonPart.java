package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuButtonPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
public interface WebMenuButtonPart extends WebMenuButtonFeatures , WebComponentPart , WebContainerPart , CoreMenuButtonPart {
    WebButton getTrigger();

    WebContainer getPopup();

    WebContainerPart getContainerPart();
}
