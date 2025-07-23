package dev.reuise.web.core.view;
import dev.reuise.core.view.CoreSheetView;
import dev.reuise.web.core.WebComponent;
public interface WebSheetView extends WebSheetViewPart , WebView , WebComponent , CoreSheetView {
    WebSheetView getComponent();
}