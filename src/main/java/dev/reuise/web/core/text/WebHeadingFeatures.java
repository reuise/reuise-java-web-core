package dev.reuise.web.core.text;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.HasAnimation;
import dev.reuise.core.text.CoreHeadingFeatures;
public interface WebHeadingFeatures extends HasAnimation , CoreHeadingFeatures {
    ComponentAnimation getAnimation();

    WebHeadingFeatures setAnimation(ComponentAnimation animation);
}
