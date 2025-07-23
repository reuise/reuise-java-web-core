package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuItem;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.list.WebListItem;
public interface WebMenuItem extends CoreMenuItem , WebComponent , WebMenuItemPart , WebListItem {
    WebMenuItem getComponent();
}