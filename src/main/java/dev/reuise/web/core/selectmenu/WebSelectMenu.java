package dev.reuise.web.core.selectmenu;
import dev.reuise.core.selectmenu.CoreSelectMenu;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebSelectMenu extends WebSelectMenuPart , WebParentComponent , CoreSelectMenu , WebComponent {
    WebSelectMenu getComponent();
}