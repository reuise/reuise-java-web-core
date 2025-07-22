package dev.reuise.web.core.media;
import dev.reuise.core.media.CoreMediaPlayerOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebMediaPlayerOptions extends WebBaseComponentPartOptions , WebParentComponentOptions , CoreMediaPlayerOptions , WebParentComponentPartOptions , WebComponentOptions , WebMediaPlayerPartOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}