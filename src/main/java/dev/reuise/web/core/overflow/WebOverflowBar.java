package dev.reuise.web.core.overflow;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.overflow.CoreOverflowBar;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebFlexContainer;
public interface WebOverflowBar extends WebOverflowBarPart , WebFlexContainer , CoreOverflowBar , WebComponent {
    WebOverflowBar getComponent();

    WebOverflowBar setAnimation(ComponentAnimation animation);

    WebOverflowBar startAnimation();

    WebOverflowBar cancelAnimation();
}
