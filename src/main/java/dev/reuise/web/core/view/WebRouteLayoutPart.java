package dev.reuise.web.core.view;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebContainerPart;
import java.util.Collection;
public interface WebRouteLayoutPart extends WebComponentPart , WebContainerPart , WebRouteLayoutFeatures {
    boolean isCurrentView(WebView view);

    Collection<WebView> getViews();

    void reveal(String url);

    void reveal(String url, boolean updateUrl);

    void reveal(String url, Collection<RouteViewRevealHandler> handler);

    void reveal(WebView route, Collection<RouteViewRevealHandler> handler);

    void reveal(WebView route, boolean reveal);

    void reveal(WebView route, boolean reveal, boolean forceCreate);

    WebContainerPart getContainerPart();
}