package dev.reuise.web.core.input;
import dev.reuise.core.input.CorePasswordField;
import dev.reuise.web.core.WebComponent;
public interface WebPasswordField extends WebComponent , WebTextField , WebPasswordFieldPart , CorePasswordField {
    WebPasswordField getComponent();
}