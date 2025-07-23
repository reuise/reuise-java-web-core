package dev.reuise.web.core.document;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebDocumentBodyPart extends WebParentComponentPart , WebComponentPart , WebDocumentBodyFeatures {
    WebParentComponentPart getParentComponentPart();
}