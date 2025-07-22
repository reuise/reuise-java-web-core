package dev.reuise.web.core.media;
import dev.reuise.core.media.CoreMediaPlayer;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebMediaPlayer extends WebParentComponent , WebMediaPlayerPart , CoreMediaPlayer , WebComponent {
    WebMediaPlayer getComponent();
}