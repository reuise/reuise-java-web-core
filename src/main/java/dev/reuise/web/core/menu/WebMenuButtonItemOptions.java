package dev.reuise.web.core.menu;
import dev.reuise.core.menu.CoreMenuButtonItemOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.button.WebButtonPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebMenuButtonItemOptions extends WebMenuButtonItemPartOptions , WebButtonOptions , WebBaseComponentPartOptions , CoreMenuButtonItemOptions , WebButtonPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebButtonPartOptions getButtonPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
