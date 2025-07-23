package dev.reuise.web.core.dropzone;
import dev.reuise.core.dropzone.CoreDropZonePart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebDropZonePart extends WebParentComponentPart , CoreDropZonePart , WebComponentPart , WebDropZoneFeatures {
    WebParentComponentPart getParentComponentPart();
}