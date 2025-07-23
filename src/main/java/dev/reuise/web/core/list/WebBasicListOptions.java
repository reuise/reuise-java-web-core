package dev.reuise.web.core.list;
import dev.reuise.core.list.CoreBasicListOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebBasicListOptions extends WebBasicListPartOptions , CoreBasicListOptions , WebBaseComponentPartOptions , WebParentComponentOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}