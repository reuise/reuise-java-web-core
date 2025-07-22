package dev.reuise.web.core.badge;
import dev.reuise.core.badge.CoreBadge;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.basecomponent.WebBaseComponent;
public interface WebBadge extends WebBadgePart , WebComponent , CoreBadge , WebBaseComponent {
    WebBadge getComponent();
}