package dev.reuise.web.core.dropzone;
import dev.reuise.core.dropzone.CoreDropZoneOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebDropZoneOptions extends WebDropZonePartOptions , WebBaseComponentPartOptions , WebParentComponentOptions , WebParentComponentPartOptions , CoreDropZoneOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}