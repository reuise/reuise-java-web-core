package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuDivider;
import dev.reuise.web.core.WebComponent;
public interface WebMenuDivider extends WebMenuItem , CoreMenuDivider , WebComponent , WebMenuDividerPart {
    WebMenuDivider getComponent();
}