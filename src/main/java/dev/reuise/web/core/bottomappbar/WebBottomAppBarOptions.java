package dev.reuise.web.core.bottomappbar;
import dev.reuise.core.bottomappbar.CoreBottomAppBarOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebBottomAppBarOptions extends WebBaseComponentPartOptions , WebBaseComponentOptions , WebBottomAppBarPartOptions , WebComponentOptions , CoreBottomAppBarOptions {
    WebBaseComponentPartOptions getBaseComponentPart();
}
