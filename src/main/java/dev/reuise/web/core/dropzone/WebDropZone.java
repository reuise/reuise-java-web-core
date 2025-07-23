package dev.reuise.web.core.dropzone;
import dev.reuise.core.dropzone.CoreDropZone;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebDropZone extends WebParentComponent , CoreDropZone , WebComponent , WebDropZonePart {
    WebDropZone getComponent();
}