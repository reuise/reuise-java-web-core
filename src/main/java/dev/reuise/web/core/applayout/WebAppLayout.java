package dev.reuise.web.core.applayout;
import dev.reuise.core.applayout.CoreAppLayout;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebAppLayout extends WebParentComponent , WebComponent , WebAppLayoutPart , CoreAppLayout {
    WebAppLayout getComponent();
}