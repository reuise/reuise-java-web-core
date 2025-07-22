package dev.reuise.web.core.media;
import dev.reuise.core.media.CoreTextTrackOptions;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.basecomponent.WebBaseComponentPartOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentOptions;
import dev.reuise.web.core.parentcomponent.WebParentComponentPartOptions;
// Todo: Clean up uneeded interfaces
public interface WebTextTrackOptions extends CoreTextTrackOptions , WebBaseComponentPartOptions , WebParentComponentOptions , WebParentComponentPartOptions , WebTextTrackPartOptions , WebComponentOptions {
    WebParentComponentPartOptions getParentComponentPart();

    WebBaseComponentPartOptions getBaseComponentPart();
}