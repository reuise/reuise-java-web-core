package dev.reuise.web.core.scriptcomponent;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebScriptComponentPart extends WebScriptComponentFeatures , WebParentComponentPart , WebComponentPart {
    WebParentComponentPart getParentComponentPart();
}