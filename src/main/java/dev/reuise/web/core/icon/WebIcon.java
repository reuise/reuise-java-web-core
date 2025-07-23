package dev.reuise.web.core.icon;
import dev.reuise.core.icon.CoreIcon;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebIcon extends WebIconPart , WebParentComponent , CoreIcon , WebComponent {
    WebIcon getComponent();
}