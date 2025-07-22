package dev.reuise.web.core.media;
import dev.reuise.core.media.CoreVideoPlayerPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebVideoPlayerPart extends CoreVideoPlayerPart , WebMediaPlayerPart , WebComponentPart , WebVideoPlayerFeatures {
    WebMediaPlayerPart getMediaPlayerPart();
}