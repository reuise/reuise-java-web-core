package dev.reuise.web.core.basecomponent;
import dev.reuise.core.basecomponent.CoreBaseComponent;
import dev.reuise.web.core.WebComponent;
public interface WebBaseComponent extends CoreBaseComponent , WebComponent , WebBaseComponentPart {
    WebBaseComponent getComponent();
}