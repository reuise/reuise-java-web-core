package dev.reuise.web.core.text;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.HasAnimation;
import dev.reuise.core.text.CoreParagraphFeatures;
public interface WebParagraphFeatures extends CoreParagraphFeatures , HasAnimation {
    ComponentAnimation getAnimation();

    WebParagraphFeatures setAnimation(ComponentAnimation animation);
}
