package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreInlineTextOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebInlineTextOptions extends WebTextOptions , WebInlineTextPartOptions , CoreInlineTextOptions , WebBaseComponentPartOptions , WebTextPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebTextPartOptions getTextPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}