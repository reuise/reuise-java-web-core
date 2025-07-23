package dev.reuise.web.core.media;
import dev.reuise.core.media.CoreVideoPlayer;
import dev.reuise.web.core.WebComponent;
public interface WebVideoPlayer extends WebVideoPlayerPart , WebComponent , WebMediaPlayer , CoreVideoPlayer {
    WebVideoPlayer getComponent();
}