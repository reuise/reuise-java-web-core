package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreBasicInputFieldPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
public interface WebBasicInputFieldPart extends CoreBasicInputFieldPart , WebComponentPart , WebBasicInputFieldFeatures , WebBaseComponentPart {
    WebBaseComponentPart getBaseComponentPart();
}