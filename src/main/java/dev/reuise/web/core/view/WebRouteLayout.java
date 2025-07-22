package dev.reuise.web.core.view;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebRouteLayout extends WebComponent , WebContainer , WebRouteLayoutPart {
    WebRouteLayout getComponent();
}