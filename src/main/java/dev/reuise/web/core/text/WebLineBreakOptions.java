package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreLineBreakOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebLineBreakOptions extends WebLineBreakPartOptions , WebBaseComponentPartOptions , WebBaseComponentOptions , WebComponentOptions , CoreLineBreakOptions {
    WebBaseComponentPartOptions getBaseComponentPart();
}
