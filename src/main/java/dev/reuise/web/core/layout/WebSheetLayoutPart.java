package dev.reuise.web.core.layout;
import dev.reuise.core.layout.CoreSheetLayoutPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.splitcontainer.WebSplitContainerPart;
public interface WebSheetLayoutPart extends WebSheetLayoutFeatures , CoreSheetLayoutPart , WebComponentPart , WebSplitContainerPart {
    WebSplitContainerPart getSplitContainerPart();
}