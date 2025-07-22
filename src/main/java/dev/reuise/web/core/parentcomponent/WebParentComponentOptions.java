package dev.reuise.web.core.parentcomponent;
import dev.reuise.core.parentcomponent.CoreParentComponentOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebParentComponentOptions extends WebBaseComponentPartOptions , WebBaseComponentOptions , WebParentComponentPartOptions , WebComponentOptions , CoreParentComponentOptions {
    WebBaseComponentPartOptions getBaseComponentPart();
}