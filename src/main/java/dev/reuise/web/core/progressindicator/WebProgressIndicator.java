package dev.reuise.web.core.progressindicator;
import dev.reuise.core.progressindicator.CoreProgressIndicator;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebProgressIndicator extends CoreProgressIndicator , WebProgressIndicatorPart , WebParentComponent , WebComponent {
    WebProgressIndicator getComponent();
}