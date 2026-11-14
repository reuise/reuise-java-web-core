package dev.reuise.web.core.view;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebRouteLayout extends WebComponent , WebContainer , WebRouteLayoutPart {
    WebRouteLayout getComponent();

    WebRouteLayout setAnimation(ComponentAnimation animation);

    WebRouteLayout startAnimation();

    WebRouteLayout cancelAnimation();
}
