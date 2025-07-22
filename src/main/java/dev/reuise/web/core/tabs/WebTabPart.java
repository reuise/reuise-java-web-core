package dev.reuise.web.core.tabs;
import dev.reuise.core.tabs.CoreTabPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.badge.WebBadge;
import dev.reuise.web.core.icon.WebIcon;
import dev.reuise.web.core.link.WebLink;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebInlineText;
public interface WebTabPart extends WebParentComponentPart , CoreTabPart , WebTabFeatures , WebComponentPart {
    WebLink getLink();

    WebBadge getBadge();

    WebIcon getIcon();

    WebInlineText getLabelContainer();

    WebParentComponentPart getParentComponentPart();
}