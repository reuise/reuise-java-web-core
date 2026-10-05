package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreLineBreak;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponent;
public interface WebLineBreak extends WebLineBreakPart , WebComponent , WebBaseComponent , CoreLineBreak {
    WebLineBreak getComponent();
}