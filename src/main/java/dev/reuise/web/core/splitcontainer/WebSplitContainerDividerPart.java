package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.splitcontainer.CoreSplitContainerDividerPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainerPart;
public interface WebSplitContainerDividerPart extends CoreSplitContainerDividerPart , WebSplitContainerDividerFeatures , WebComponentPart , WebContainerPart {
    WebContainerPart getContainerPart();
}