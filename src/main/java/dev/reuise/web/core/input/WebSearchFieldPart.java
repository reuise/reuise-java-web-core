package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreSearchFieldPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebSearchFieldPart extends CoreSearchFieldPart , WebTextFieldPart , WebSearchFieldFeatures , WebComponentPart {
    WebTextFieldPart getTextFieldPart();
}