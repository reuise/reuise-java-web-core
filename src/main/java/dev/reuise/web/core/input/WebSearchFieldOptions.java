package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreSearchFieldOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebSearchFieldOptions extends WebTextFieldPartOptions , WebTextFieldOptions , WebBaseComponentPartOptions , CoreSearchFieldOptions , WebSearchFieldPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebTextFieldPartOptions getTextFieldPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}