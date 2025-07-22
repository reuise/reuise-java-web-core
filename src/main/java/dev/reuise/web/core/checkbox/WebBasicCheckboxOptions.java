package dev.reuise.web.core.checkbox;
import dev.reuise.core.checkbox.CoreBasicCheckboxOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebBasicCheckboxOptions extends WebBaseComponentPartOptions , WebBaseComponentOptions , WebBasicCheckboxPartOptions , WebComponentOptions , CoreBasicCheckboxOptions {
    WebBaseComponentPartOptions getBaseComponentPart();
}