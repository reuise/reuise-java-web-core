package dev.reuise.web.core.layout;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.HasAnimation;
import dev.reuise.core.layout.CoreContainerFeatures;
public interface WebContainerFeatures extends CoreContainerFeatures , HasAnimation {
    ComponentAnimation getAnimation();

    WebContainerFeatures setAnimation(ComponentAnimation animation);
}
