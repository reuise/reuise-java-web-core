package dev.reuise.web.core.parentcomponent;
import dev.reuise.core.parentcomponent.CoreParentComponent;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponent;
public interface WebParentComponent extends WebParentComponentPart , CoreParentComponent , WebComponent , WebBaseComponent {
    WebParentComponent getComponent();
}