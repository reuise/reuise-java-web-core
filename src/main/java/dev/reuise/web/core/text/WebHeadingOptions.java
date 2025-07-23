package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreHeadingOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebHeadingOptions extends WebHeadingPartOptions , WebTextOptions , CoreHeadingOptions , WebBaseComponentPartOptions , WebTextPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebTextPartOptions getTextPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}