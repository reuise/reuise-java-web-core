package dev.reuise.web.core.media;
import dev.reuise.core.media.CoreTextTrackPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebTextTrackPart extends WebTextTrackFeatures , WebParentComponentPart , WebComponentPart , CoreTextTrackPart {
    WebParentComponentPart getParentComponentPart();
}