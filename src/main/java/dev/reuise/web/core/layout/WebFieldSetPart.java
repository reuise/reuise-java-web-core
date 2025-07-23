package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreFieldSetPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebFieldSetPart extends WebComponentPart , CoreFieldSetPart , WebContainerPart , WebFieldSetFeatures {
    WebContainerPart getContainerPart();
}