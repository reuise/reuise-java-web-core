package dev.reuise.web.core.checkbox;
import dev.reuise.core.checkbox.CoreCheckboxOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebCheckboxOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , CoreCheckboxOptions , WebParentComponentPartOptions , WebComponentOptions , WebCheckboxPartOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}