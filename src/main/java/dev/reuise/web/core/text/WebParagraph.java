package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreParagraph;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebParagraph extends WebParagraphPart , WebParentComponent , WebComponent , CoreParagraph {
    WebParagraph getComponent();
}