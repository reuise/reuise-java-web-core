package dev.reuise.web.core.document;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebDocumentBody extends WebParentComponent , WebComponent , WebDocumentBodyPart {
    WebDocumentBody getComponent();
}