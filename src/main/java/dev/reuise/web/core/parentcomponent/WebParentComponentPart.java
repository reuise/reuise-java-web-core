package dev.reuise.web.core.parentcomponent;
import dev.reuise.core.parentcomponent.CoreParentComponentPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
public interface WebParentComponentPart extends CoreParentComponentPart , WebComponentPart , WebParentComponentFeatures , WebBaseComponentPart {
    WebBaseComponentPart getBaseComponentPart();
}