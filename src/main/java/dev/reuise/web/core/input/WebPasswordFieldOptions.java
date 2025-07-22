package dev.reuise.web.core.input;
import dev.reuise.core.input.CorePasswordFieldOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebPasswordFieldOptions extends WebTextFieldPartOptions , WebTextFieldOptions , WebBaseComponentPartOptions , CorePasswordFieldOptions , WebPasswordFieldPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebTextFieldPartOptions getTextFieldPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}