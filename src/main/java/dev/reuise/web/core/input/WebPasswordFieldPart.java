package dev.reuise.web.core.input;
import dev.reuise.core.input.CorePasswordFieldPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebPasswordFieldPart extends CorePasswordFieldPart , WebTextFieldPart , WebComponentPart , WebPasswordFieldFeatures {
    WebTextFieldPart getTextFieldPart();
}