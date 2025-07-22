package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreButton;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebButton extends WebButtonPart , WebParentComponent , CoreButton , WebComponent {
    WebButton getComponent();
}