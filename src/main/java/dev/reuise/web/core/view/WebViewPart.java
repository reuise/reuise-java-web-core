package dev.reuise.web.core.view;
import dev.reuise.core.view.CoreViewPart;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebFlexContainerPart;
public interface WebViewPart extends WebViewFeatures , CoreViewPart , WebComponentPart , WebFlexContainerPart {
    String getParameter(String parameter);

    void onReveal(RevealOptions revealOptions);

    WebFlexContainerPart getFlexContainerPart();
}