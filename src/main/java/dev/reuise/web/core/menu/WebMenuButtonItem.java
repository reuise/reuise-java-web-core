package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuButtonItem;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.button.WebButton;
public interface WebMenuButtonItem extends WebComponent , WebButton , CoreMenuButtonItem , WebMenuButtonItemPart {
    WebMenuButtonItem getComponent();
}
