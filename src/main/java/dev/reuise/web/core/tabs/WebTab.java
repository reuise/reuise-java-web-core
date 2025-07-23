package dev.reuise.web.core.tabs;
import dev.reuise.core.tabs.CoreTab;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTab extends CoreTab , WebParentComponent , WebComponent , WebTabPart {
    WebTab getComponent();
}