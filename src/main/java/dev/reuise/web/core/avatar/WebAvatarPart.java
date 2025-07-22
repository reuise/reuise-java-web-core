package dev.reuise.web.core.avatar;
import dev.reuise.core.avatar.CoreAvatarPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.badge.WebBadge;
import dev.reuise.web.core.image.WebImage;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebAvatarPart extends WebParentComponentPart , WebAvatarFeatures , CoreAvatarPart , WebComponentPart {
    WebImage getImage();

    WebBadge getBadge();

    WebParentComponentPart getParentComponentPart();
}