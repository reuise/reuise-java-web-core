package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenu;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebMenu extends WebMenuPart , WebParentComponent , CoreMenu , WebComponent {
    WebMenu getComponent();
}