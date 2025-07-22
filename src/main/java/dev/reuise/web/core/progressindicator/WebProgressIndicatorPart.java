package dev.reuise.web.core.progressindicator;
import dev.reuise.core.progressindicator.CoreProgressIndicatorPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
public interface WebProgressIndicatorPart extends WebParentComponentPart , WebProgressIndicatorFeatures , WebComponentPart , CoreProgressIndicatorPart {
    WebContainer getTrack();

    WebParentComponentPart getParentComponentPart();
}