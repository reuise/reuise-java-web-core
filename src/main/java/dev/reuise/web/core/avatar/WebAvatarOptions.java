package dev.reuise.web.core.avatar;
import dev.reuise.core.avatar.CoreAvatarOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up unneeded interfaces
public interface WebAvatarOptions extends CoreAvatarOptions , WebBaseComponentPartOptions , WebParentComponentOptions , WebAvatarPartOptions , WebParentComponentPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}
