package dev.reuise.web.core.tabs;
import dev.reuise.core.tabs.CoreTabBar;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebTabBar extends WebTabBarPart , CoreTabBar , WebComponent , WebContainer {
    WebTabBar getComponent();
}