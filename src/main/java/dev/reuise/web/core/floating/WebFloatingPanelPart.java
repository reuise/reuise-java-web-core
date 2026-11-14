package dev.reuise.web.core.floating;
import dev.reuise.core.floating.CoreFloatingPanelPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
import dev.reuise.web.core.text.WebInlineText;
public interface WebFloatingPanelPart extends WebFloatingPanelFeatures , WebComponentPart , WebContainerPart , CoreFloatingPanelPart {
    WebFloatingActionButton getTrigger();

    WebContainer getPanel();

    WebContainer getHeader();

    WebInlineText getTitleContainer();

    WebButton getMinimiseButton();

    WebButton getCloseButton();

    WebContainer getContent();

    WebContainerPart getContainerPart();
}
