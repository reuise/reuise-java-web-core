package dev.reuise.web.core.text;
import dev.reuise.core.text.CoreLabelPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebLabelPart extends CoreLabelPart , WebComponentPart , WebLabelFeatures , WebInlineTextPart {
    WebInlineTextPart getInlineTextPart();
}