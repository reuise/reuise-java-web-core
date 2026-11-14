package dev.reuise.web.core.navigation;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.navigation.CoreNavigationTree;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.accordion.WebAccordion;
public interface WebNavigationTree extends WebAccordion , WebComponent , CoreNavigationTree , WebNavigationTreePart {
    WebNavigationTree getComponent();

    WebNavigationTree setAnimation(ComponentAnimation animation);

    WebNavigationTree startAnimation();

    WebNavigationTree cancelAnimation();
}
