package dev.reuise.web.core.floating;
import dev.reuise.core.floating.CoreFloatingActionButtonOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.button.WebButtonOptions;
import dev.reuise.web.core.button.WebButtonPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebFloatingActionButtonOptions extends WebButtonOptions , WebFloatingActionButtonPartOptions , WebBaseComponentPartOptions , WebButtonPartOptions , WebParentComponentPartOptions , CoreFloatingActionButtonOptions , WebComponentOptions {
    WebButtonPartOptions getButtonPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
