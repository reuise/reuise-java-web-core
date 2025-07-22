package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreLabelOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebLabelOptions extends WebInlineTextPartOptions , WebBaseComponentPartOptions , WebInlineTextOptions , WebTextPartOptions , WebParentComponentPartOptions , CoreLabelOptions , WebComponentOptions , WebLabelPartOptions {
    WebInlineTextPartOptions getInlineTextPart();

    WebTextPartOptions getTextPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}