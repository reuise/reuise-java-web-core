package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreChipFieldOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebChipFieldOptions extends WebTextFieldPartOptions , WebTextFieldOptions , WebChipFieldPartOptions , WebBaseComponentPartOptions , WebParentComponentPartOptions , WebComponentOptions , CoreChipFieldOptions {
    WebTextFieldPartOptions getTextFieldPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}