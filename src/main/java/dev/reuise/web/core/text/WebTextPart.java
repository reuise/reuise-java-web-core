package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreTextPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebTextPart extends WebParentComponentPart , CoreTextPart , WebTextFeatures , WebComponentPart {
    WebParentComponentPart getParentComponentPart();
}