package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.splitcontainer.CoreSplitContainerDivider;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebSplitContainerDivider extends CoreSplitContainerDivider , WebComponent , WebSplitContainerDividerPart , WebContainer {
    WebSplitContainerDivider getComponent();
}