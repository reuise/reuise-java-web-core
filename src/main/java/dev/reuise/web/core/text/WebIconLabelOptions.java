package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreIconLabelOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebIconLabelOptions extends WebIconLabelPartOptions , WebBaseComponentPartOptions , WebParentComponentOptions , WebParentComponentPartOptions , CoreIconLabelOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}