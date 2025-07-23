package dev.reuise.web.core.scriptcomponent;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebScriptComponentOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , WebParentComponentPartOptions , WebComponentOptions , WebScriptComponentPartOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}