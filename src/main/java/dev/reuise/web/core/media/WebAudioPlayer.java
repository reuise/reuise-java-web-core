package dev.reuise.web.core.media;
import dev.reuise.core.media.CoreAudioPlayer;
import dev.reuise.web.core.WebComponent;
public interface WebAudioPlayer extends WebAudioPlayerPart , WebComponent , WebMediaPlayer , CoreAudioPlayer {
    WebAudioPlayer getComponent();
}