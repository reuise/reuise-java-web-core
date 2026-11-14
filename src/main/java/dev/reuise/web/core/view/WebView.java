package dev.reuise.web.core.view;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.view.CoreView;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.layout.WebFlexContainer;
public interface WebView extends WebFlexContainer , CoreView , WebComponent , WebViewPart {
    WebView getComponent();

    WebView setAnimation(ComponentAnimation animation);

    WebView startAnimation();

    WebView cancelAnimation();
}
