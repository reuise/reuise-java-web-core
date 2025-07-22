package dev.reuise.web.core.divider;
import dev.reuise.core.divider.CoreDivider;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.parentcomponent.WebParentComponent;
public interface WebDivider extends CoreDivider , WebParentComponent , WebDividerPart , WebComponent {
    WebDivider getComponent();
}