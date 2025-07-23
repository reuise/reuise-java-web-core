package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreRowLayout;
import dev.reuise.web.core.WebComponent;
public interface WebRowLayout extends WebFlexContainer , WebComponent , WebRowLayoutPart , CoreRowLayout {
    WebRowLayout getComponent();
}