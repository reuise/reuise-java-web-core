package dev.reuise.web.core.avatar;
import dev.reuise.core.avatar.CoreAvatar;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebAvatar extends WebParentComponent , CoreAvatar , WebComponent , WebAvatarPart {
    WebAvatar getComponent();
}