package dev.reuise.web.core.document;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebDocumentOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , WebDocumentPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
