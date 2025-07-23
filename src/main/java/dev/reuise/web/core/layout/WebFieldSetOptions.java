package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreFieldSetOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebFieldSetOptions extends CoreFieldSetOptions , WebBaseComponentPartOptions , WebContainerPartOptions , WebParentComponentPartOptions , WebContainerOptions , WebFieldSetPartOptions , WebComponentOptions {
    WebContainerPartOptions getContainerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}