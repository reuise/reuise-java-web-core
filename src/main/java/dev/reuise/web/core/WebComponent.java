package dev.reuise.web.core;
import dev.reuise.core.CoreComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.webstyles.StyleBuilder;
public interface WebComponent extends CoreComponent , WebBaseComponentPart {
    void onInitializeCommonStyle(StyleBuilder commonStyles);
}