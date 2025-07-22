package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuItemPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.list.WebListItemPart;
public interface WebMenuItemPart extends WebListItemPart , CoreMenuItemPart , WebMenuItemFeatures , WebComponentPart {
    WebListItemPart getListItemPart();
}