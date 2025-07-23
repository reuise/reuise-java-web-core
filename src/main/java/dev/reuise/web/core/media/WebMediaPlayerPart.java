package dev.reuise.web.core.media;
import dev.reuise.core.media.CoreMediaPlayerPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebMediaPlayerPart extends WebParentComponentPart , WebMediaPlayerFeatures , CoreMediaPlayerPart , WebComponentPart {
    WebParentComponentPart getParentComponentPart();
}