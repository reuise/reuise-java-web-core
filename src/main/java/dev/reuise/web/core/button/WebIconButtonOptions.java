package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreIconButtonOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebIconButtonOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , WebIconButtonPartOptions , WebParentComponentPartOptions , CoreIconButtonOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}