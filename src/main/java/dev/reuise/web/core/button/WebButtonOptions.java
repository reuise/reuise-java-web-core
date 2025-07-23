package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreButtonOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebButtonOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , WebButtonPartOptions , WebParentComponentPartOptions , CoreButtonOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}