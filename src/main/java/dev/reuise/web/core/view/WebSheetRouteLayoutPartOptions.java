package dev.reuise.web.core.view;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentCreator;
import dev.reuise.web.core.WebComponentFactory;
import java.util.List;
// Url here??
// Routes here??
// RouteViewRevealer here??
// RevealHandlers here??
// BeforeRevealHandlers here??
// CurrentView here??
public interface WebSheetRouteLayoutPartOptions {
    String getUrl();

    WebSheetRouteLayoutPartOptions setUrl(String url);

    List<RouteOptions> getRoutes();

    WebSheetRouteLayoutPartOptions setRoutes(List<RouteOptions> routes);

    WebSheetRouteLayoutPartOptions addRoute(RouteOptions route);

    WebSheetRouteLayoutPartOptions removeRoute(RouteOptions route);

    WebSheetRouteLayoutPartOptions clearRoutes();

    boolean hasRoute(RouteOptions route);

    WebSheetRouteLayoutPartOptions addRoute(String path, RouteViewCreator creator);

    WebSheetRouteLayoutPartOptions addRoute(String path, RouteViewCreator creator, boolean preCreate);

    RouteViewRevealer getRouteViewRevealer();

    WebSheetRouteLayoutPartOptions setRouteViewRevealer(RouteViewRevealer routeViewRevealer);

    List<RouteViewRevealHandler> getRevealHandlers();

    WebSheetRouteLayoutPartOptions setRevealHandlers(List<RouteViewRevealHandler> revealHandlers);

    WebSheetRouteLayoutPartOptions addRevealHandler(RouteViewRevealHandler revealHandler);

    WebSheetRouteLayoutPartOptions setRevealHandler(RouteViewRevealHandler revealHandler);

    WebSheetRouteLayoutPartOptions removeRevealHandler(RouteViewRevealHandler revealHandler);

    WebSheetRouteLayoutPartOptions clearRevealHandlers();

    List<RouteViewBeforeRevealHandler> getBeforeRevealHandlers();

    WebSheetRouteLayoutPartOptions setBeforeRevealHandlers(List<RouteViewBeforeRevealHandler> beforeRevealHandlers);

    WebSheetRouteLayoutPartOptions addBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebSheetRouteLayoutPartOptions setBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebSheetRouteLayoutPartOptions removeBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebSheetRouteLayoutPartOptions clearBeforeRevealHandlers();

    WebView getCurrentView();

    WebSheetRouteLayoutPartOptions setCurrentView(WebView currentView);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebRouteLayoutOptions getRouteLayoutOptions();

    WebSheetRouteLayoutPartOptions setRouteLayoutOptions(WebRouteLayoutOptions routeLayoutOptions);

    boolean hasRouteLayoutOptions();

    ComponentCreator<? extends WebRouteLayout, ? extends WebRouteLayoutOptions> getRouteLayoutCreator();

    WebComponentFactory getComponentFactory();

    WebSheetRouteLayout getComponent();
}