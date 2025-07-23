package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreTextBlockOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebTextBlockOptions extends WebTextBlockPartOptions , WebTextOptions , WebBaseComponentPartOptions , WebTextPartOptions , CoreTextBlockOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebTextPartOptions getTextPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}