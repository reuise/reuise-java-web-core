package dev.reuise.web.core.topappbar;
import dev.reuise.core.topappbar.CoreTopAppBarOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebTopAppBarOptions extends CoreTopAppBarOptions , WebBaseComponentPartOptions , WebParentComponentOptions , WebTopAppBarPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}