package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuDividerPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebMenuDividerPart extends WebMenuDividerFeatures , WebMenuItemPart , WebComponentPart , CoreMenuDividerPart {
    WebMenuItemPart getMenuItemPart();
}