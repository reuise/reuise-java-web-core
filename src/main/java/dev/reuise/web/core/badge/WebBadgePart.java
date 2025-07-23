package dev.reuise.web.core.badge;
import dev.reuise.core.badge.CoreBadgePart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
public interface WebBadgePart extends WebBadgeFeatures , WebComponentPart , CoreBadgePart , WebBaseComponentPart {
    WebBaseComponentPart getBaseComponentPart();
}