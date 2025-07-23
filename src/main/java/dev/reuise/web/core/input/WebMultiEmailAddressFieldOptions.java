package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreMultiEmailAddressFieldOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebMultiEmailAddressFieldOptions extends WebTextFieldPartOptions , WebChipFieldOptions , WebChipFieldPartOptions , WebBaseComponentPartOptions , WebMultiEmailAddressFieldPartOptions , WebParentComponentPartOptions , WebComponentOptions , CoreMultiEmailAddressFieldOptions {
    WebChipFieldPartOptions getChipFieldPart();

    WebTextFieldPartOptions getTextFieldPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}