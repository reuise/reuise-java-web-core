package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreButtonPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.icon.WebIcon;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebInlineText;
public interface WebButtonPart extends WebParentComponentPart , WebButtonFeatures , WebComponentPart , CoreButtonPart {
    WebIcon getStartIcon();

    WebInlineText getLabelContainer();

    WebIcon getEndIcon();

    WebParentComponentPart getParentComponentPart();
}