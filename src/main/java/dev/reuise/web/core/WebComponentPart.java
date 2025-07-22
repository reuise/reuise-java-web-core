package dev.reuise.web.core;
import dev.reuise.core.ComponentPart;
import dev.reuise.webstyles.StyleBuilder;
public interface WebComponentPart extends ComponentPart {
    void onInitializeCommonStyle(StyleBuilder commonStyles);
}