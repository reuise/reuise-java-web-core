package dev.reuise.web.core.media;
import dev.reuise.core.media.CoreAudioPlayerPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebAudioPlayerPart extends WebMediaPlayerPart , CoreAudioPlayerPart , WebComponentPart , WebAudioPlayerFeatures {
    WebMediaPlayerPart getMediaPlayerPart();
}