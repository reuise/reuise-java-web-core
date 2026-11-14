package dev.reuise.web.core.view;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebSheetLayout;
public interface WebSheetRouteLayout extends WebSheetRouteLayoutPart , WebComponent , WebSheetLayout {
    WebSheetRouteLayout getComponent();

    WebSheetRouteLayout setAnimation(ComponentAnimation animation);

    WebSheetRouteLayout startAnimation();

    WebSheetRouteLayout cancelAnimation();
}
