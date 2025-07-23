package dev.reuise.web.core.media;
import dev.reuise.core.media.CoreVideoPlayerOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebVideoPlayerOptions extends WebBaseComponentPartOptions , WebVideoPlayerPartOptions , CoreVideoPlayerOptions , WebParentComponentPartOptions , WebComponentOptions , WebMediaPlayerOptions , WebMediaPlayerPartOptions {
    WebMediaPlayerPartOptions getMediaPlayerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}