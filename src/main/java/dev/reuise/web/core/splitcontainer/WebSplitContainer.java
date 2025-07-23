package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.splitcontainer.CoreSplitContainer;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebContainer;
public interface WebSplitContainer extends WebComponent , WebContainer , CoreSplitContainer , WebSplitContainerPart {
    WebSplitContainer getComponent();
}