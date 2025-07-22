package dev.reuise.web.core.scriptcomponent;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebScriptComponent extends WebParentComponent , WebScriptComponentPart , WebComponent {
    WebScriptComponent getComponent();
}