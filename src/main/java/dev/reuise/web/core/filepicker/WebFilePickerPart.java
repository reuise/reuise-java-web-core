package dev.reuise.web.core.filepicker;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
public interface WebFilePickerPart extends WebFilePickerFeatures , WebComponentPart , WebBaseComponentPart {
    void reset();

    WebBaseComponentPart getBaseComponentPart();
}