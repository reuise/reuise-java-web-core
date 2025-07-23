package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanel;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebSplitContainerPanel extends CoreSplitContainerPanel , WebComponent , WebSplitContainerPanelPart , WebContainer {
    WebSplitContainerPanel getComponent();
}