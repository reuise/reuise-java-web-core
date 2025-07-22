package dev.reuise.web.core.tabs;
import dev.reuise.core.tabs.CoreTabBarPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
public interface WebTabBarPart extends CoreTabBarPart , WebComponentPart , WebTabBarFeatures , WebContainerPart {
    WebContainer getContainer();

    WebContainer getActiveIndicator();

    WebContainerPart getContainerPart();
}