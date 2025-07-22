package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreBasicInputFieldOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebBasicInputFieldOptions extends WebBaseComponentPartOptions , WebBaseComponentOptions , WebBasicInputFieldPartOptions , WebComponentOptions , CoreBasicInputFieldOptions {
    WebBaseComponentPartOptions getBaseComponentPart();
}