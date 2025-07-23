package dev.reuise.web.core.view;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.layout.WebSheetLayoutPart;
import java.util.List;
// Url here??
// Routes here??
// RouteViewRevealer here??
// RevealHandlers here??
// BeforeRevealHandlers here??
// CurrentView here??
public interface WebSheetRouteLayoutPart extends WebSheetRouteLayoutFeatures , WebSheetLayoutPart , WebComponentPart {
    String getUrl();

    WebSheetRouteLayoutPart setUrl(String url);

    List<RouteOptions> getRoutes();

    WebSheetRouteLayoutPart setRoutes(List<RouteOptions> routes);

    WebSheetRouteLayoutPart addRoute(RouteOptions route);

    WebSheetRouteLayoutPart removeRoute(RouteOptions route);

    boolean hasRoute(RouteOptions route);

    WebSheetRouteLayoutPart addRoute(String path, RouteViewCreator creator);

    WebSheetRouteLayoutPart addRoute(String path, RouteViewCreator creator, boolean preCreate);

    RouteViewRevealer getRouteViewRevealer();

    WebSheetRouteLayoutPart setRouteViewRevealer(RouteViewRevealer routeViewRevealer);

    List<RouteViewRevealHandler> getRevealHandlers();

    WebSheetRouteLayoutPart setRevealHandlers(List<RouteViewRevealHandler> revealHandlers);

    WebSheetRouteLayoutPart addRevealHandler(RouteViewRevealHandler revealHandler);

    WebSheetRouteLayoutPart setRevealHandler(RouteViewRevealHandler revealHandler);

    WebSheetRouteLayoutPart removeRevealHandler(RouteViewRevealHandler revealHandler);

    List<RouteViewBeforeRevealHandler> getBeforeRevealHandlers();

    WebSheetRouteLayoutPart setBeforeRevealHandlers(List<RouteViewBeforeRevealHandler> beforeRevealHandlers);

    WebSheetRouteLayoutPart addBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebSheetRouteLayoutPart setBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebSheetRouteLayoutPart removeBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebView getCurrentView();

    WebSheetRouteLayoutPart setCurrentView(WebView currentView);

    WebRouteLayout getRouteLayout();

    WebSheetLayoutPart getSheetLayoutPart();
}