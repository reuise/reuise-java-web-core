package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreTextField;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTextField extends CoreTextField , WebParentComponent , WebComponent , WebTextFieldPart {
    WebTextField getComponent();
}