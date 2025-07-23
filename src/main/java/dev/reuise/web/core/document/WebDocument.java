package dev.reuise.web.core.document;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.WebRootComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebDocument extends WebDocumentPart , WebParentComponent , WebRootComponent , WebComponent {
    WebDocument getComponent();
}