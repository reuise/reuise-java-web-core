package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreInlineTextPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebInlineTextPart extends WebTextPart , CoreInlineTextPart , WebComponentPart , WebInlineTextFeatures {
    WebTextPart getTextPart();
}