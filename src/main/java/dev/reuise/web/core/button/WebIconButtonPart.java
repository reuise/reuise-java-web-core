package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreIconButtonPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.icon.WebIcon;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
// Size here??
public interface WebIconButtonPart extends WebParentComponentPart , CoreIconButtonPart , WebIconButtonFeatures , WebComponentPart {
    Object getSize();

    WebIconButtonPart setSize(Object size);

    WebIcon getIcon();

    WebParentComponentPart getParentComponentPart();
}
