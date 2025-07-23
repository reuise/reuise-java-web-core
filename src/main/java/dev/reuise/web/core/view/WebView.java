package dev.reuise.web.core.view;
import dev.reuise.core.view.CoreView;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebFlexContainer;
public interface WebView extends WebFlexContainer , CoreView , WebComponent , WebViewPart {
    WebView getComponent();
}