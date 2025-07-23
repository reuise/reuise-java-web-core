package dev.reuise.web.core.checkbox;
import dev.reuise.core.checkbox.CoreBasicCheckboxPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
public interface WebBasicCheckboxPart extends CoreBasicCheckboxPart , WebBasicCheckboxFeatures , WebComponentPart , WebBaseComponentPart {
    WebBaseComponentPart getBaseComponentPart();
}