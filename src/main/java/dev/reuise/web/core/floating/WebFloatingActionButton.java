package dev.reuise.web.core.floating;
import dev.reuise.core.floating.CoreFloatingActionButton;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.button.WebButton;
public interface WebFloatingActionButton extends WebComponent , WebButton , CoreFloatingActionButton , WebFloatingActionButtonPart {
    WebFloatingActionButton getComponent();
}
