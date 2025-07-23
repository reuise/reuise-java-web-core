package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreParagraphPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebParagraphPart extends WebParentComponentPart , CoreParagraphPart , WebComponentPart , WebParagraphFeatures {
    WebParentComponentPart getParentComponentPart();
}