package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreIconButton;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebIconButton extends WebParentComponent , CoreIconButton , WebComponent , WebIconButtonPart {
    WebIconButton getComponent();
}