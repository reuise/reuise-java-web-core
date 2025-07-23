package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.splitcontainer.CoreSplitContainerPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
public interface WebSplitContainerPart extends WebSplitContainerFeatures , CoreSplitContainerPart , WebComponentPart , WebContainerPart {
    WebContainer getContainer();

    WebSplitContainerPanel getStartPanel();

    WebSplitContainerDivider getDivider();

    WebSplitContainerPanel getEndPanel();

    WebContainerPart getContainerPart();
}