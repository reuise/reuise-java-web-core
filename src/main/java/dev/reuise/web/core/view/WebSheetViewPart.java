package dev.reuise.web.core.view;
import dev.reuise.core.view.CoreSheetViewPart;
import dev.reuise.web.core.WebComponentPart;
public interface WebSheetViewPart extends WebViewPart , CoreSheetViewPart , WebComponentPart , WebSheetViewFeatures {
    WebViewPart getViewPart();
}