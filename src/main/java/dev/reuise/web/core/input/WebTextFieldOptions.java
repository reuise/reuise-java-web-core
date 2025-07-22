package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreTextFieldOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebTextFieldOptions extends WebTextFieldPartOptions , WebBaseComponentPartOptions , WebParentComponentOptions , WebParentComponentPartOptions , CoreTextFieldOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}