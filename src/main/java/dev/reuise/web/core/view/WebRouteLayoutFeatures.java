package dev.reuise.web.core.view;
import java.util.List;
public interface WebRouteLayoutFeatures {
    String getUrl();

    WebRouteLayoutFeatures setUrl(String url);

    String getPath();

    List<RouteOptions> getRoutes();

    WebRouteLayoutFeatures setRoutes(List<RouteOptions> routes);

    WebRouteLayoutFeatures addRoute(RouteOptions route);

    WebRouteLayoutFeatures removeRoute(RouteOptions route);

    WebRouteLayoutFeatures clearRoutes();

    boolean hasRoute(RouteOptions route);

    RouteViewRevealer getRouteViewRevealer();

    WebRouteLayoutFeatures setRouteViewRevealer(RouteViewRevealer routeViewRevealer);

    List<RouteViewRevealHandler> getRevealHandlers();

    WebRouteLayoutFeatures setRevealHandlers(List<RouteViewRevealHandler> revealHandlers);

    WebRouteLayoutFeatures addRevealHandler(RouteViewRevealHandler revealHandler);

    WebRouteLayoutFeatures setRevealHandler(RouteViewRevealHandler revealHandler);

    WebRouteLayoutFeatures removeRevealHandler(RouteViewRevealHandler revealHandler);

    WebRouteLayoutFeatures clearRevealHandlers();

    List<RouteViewBeforeRevealHandler> getBeforeRevealHandlers();

    WebRouteLayoutFeatures setBeforeRevealHandlers(List<RouteViewBeforeRevealHandler> beforeRevealHandlers);

    WebRouteLayoutFeatures addBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebRouteLayoutFeatures setBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebRouteLayoutFeatures removeBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebRouteLayoutFeatures clearBeforeRevealHandlers();

    WebView getCurrentView();

    WebRouteLayoutFeatures setCurrentView(WebView currentView);

    WebRouteLayoutFeatures addRoute(String path, RouteViewCreator creator);

    WebRouteLayoutFeatures addRoute(String path, RouteViewCreator creator, RouteViewCreator.Mode creatorMode);
}
