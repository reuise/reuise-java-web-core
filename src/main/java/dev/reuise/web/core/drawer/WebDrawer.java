package dev.reuise.web.core.drawer;
import dev.reuise.core.drawer.CoreDrawer;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebDrawer extends WebDrawerPart , CoreDrawer , WebComponent , WebContainer {
    WebDrawer getComponent();
}