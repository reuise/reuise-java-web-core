package dev.reuise.web.core.button;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.button.CoreButtonBar;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebFlexContainer;
public interface WebButtonBar extends WebFlexContainer , CoreButtonBar , WebButtonBarPart , WebComponent {
    WebButtonBar getComponent();

    WebButtonBar setAnimation(ComponentAnimation animation);

    WebButtonBar startAnimation();

    WebButtonBar cancelAnimation();
}
