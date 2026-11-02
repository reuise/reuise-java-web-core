package dev.reuise.web.core.filepicker;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebFilePickerOptions extends WebBaseComponentPartOptions , WebFilePickerPartOptions , WebBaseComponentOptions , WebComponentOptions {
    WebBaseComponentPartOptions getBaseComponentPart();
}
