package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreRotatingTextOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebRotatingTextOptions extends CoreRotatingTextOptions , WebBaseComponentPartOptions , WebBaseComponentOptions , WebRotatingTextPartOptions , WebComponentOptions {
    WebBaseComponentPartOptions getBaseComponentPart();
}
