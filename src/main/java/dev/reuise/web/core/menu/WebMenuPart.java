package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.list.WebListView;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebMenuPart extends WebParentComponentPart , WebMenuFeatures , CoreMenuPart , WebComponentPart {
    WebListView getList();

    WebParentComponentPart getParentComponentPart();
}