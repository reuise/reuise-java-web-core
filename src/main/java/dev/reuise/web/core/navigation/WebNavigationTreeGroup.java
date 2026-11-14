package dev.reuise.web.core.navigation;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.navigation.CoreNavigationTreeGroup;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.accordion.WebAccordionItem;
public interface WebNavigationTreeGroup extends CoreNavigationTreeGroup , WebAccordionItem , WebNavigationTreeGroupPart , WebComponent {
    WebNavigationTreeGroup getComponent();

    WebNavigationTreeGroup setAnimation(ComponentAnimation animation);

    WebNavigationTreeGroup startAnimation();

    WebNavigationTreeGroup cancelAnimation();
}
