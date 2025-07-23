package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreIconButtonPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.icon.WebIcon;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebIconButtonPart extends WebParentComponentPart , CoreIconButtonPart , WebIconButtonFeatures , WebComponentPart {
    WebIcon getIcon();

    WebParentComponentPart getParentComponentPart();
}