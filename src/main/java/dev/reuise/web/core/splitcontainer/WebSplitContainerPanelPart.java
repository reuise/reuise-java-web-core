package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanelPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainerPart;
public interface WebSplitContainerPanelPart extends CoreSplitContainerPanelPart , WebSplitContainerPanelFeatures , WebComponentPart , WebContainerPart {
    WebContainerPart getContainerPart();
}