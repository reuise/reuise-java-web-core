package dev.reuise.web.core.media;
import dev.reuise.core.media.CoreTextTrack;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebTextTrack extends CoreTextTrack , WebParentComponent , WebTextTrackPart , WebComponent {
    WebTextTrack getComponent();
}