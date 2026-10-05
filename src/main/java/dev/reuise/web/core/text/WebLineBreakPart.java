package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreLineBreakPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
public interface WebLineBreakPart extends WebComponentPart , CoreLineBreakPart , WebBaseComponentPart , WebLineBreakFeatures {
    WebBaseComponentPart getBaseComponentPart();
}