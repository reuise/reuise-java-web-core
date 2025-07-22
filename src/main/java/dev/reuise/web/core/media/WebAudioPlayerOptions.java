package dev.reuise.web.core.media;
import dev.reuise.core.media.CoreAudioPlayerOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebAudioPlayerOptions extends WebAudioPlayerPartOptions , WebBaseComponentPartOptions , CoreAudioPlayerOptions , WebParentComponentPartOptions , WebComponentOptions , WebMediaPlayerOptions , WebMediaPlayerPartOptions {
    WebMediaPlayerPartOptions getMediaPlayerPart();

    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}