package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreBasicInputField;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponent;
public interface WebBasicInputField extends WebComponent , WebBasicInputFieldPart , CoreBasicInputField , WebBaseComponent {
    WebBasicInputField getComponent();
}