package dev.reuise.web.core.view;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
import java.util.List;
public interface WebRouteLayoutPartOptions {
    String getUrl();

    ComponentOption<String> getUrlOption();

    WebRouteLayoutPartOptions setUrl(String url);

    String getPath();

    ComponentOption<String> getPathOption();

    List<RouteOptions> getRoutes();

    ComponentOption<List<RouteOptions>> getRoutesOption();

    WebRouteLayoutPartOptions setRoutes(List<RouteOptions> routes);

    WebRouteLayoutPartOptions addRoute(RouteOptions route);

    WebRouteLayoutPartOptions removeRoute(RouteOptions route);

    WebRouteLayoutPartOptions clearRoutes();

    boolean hasRoute(RouteOptions route);

    RouteViewRevealer getRouteViewRevealer();

    ComponentOption<RouteViewRevealer> getRouteViewRevealerOption();

    WebRouteLayoutPartOptions setRouteViewRevealer(RouteViewRevealer routeViewRevealer);

    List<RouteViewRevealHandler> getRevealHandlers();

    ComponentOption<List<RouteViewRevealHandler>> getRevealHandlersOption();

    WebRouteLayoutPartOptions setRevealHandlers(List<RouteViewRevealHandler> revealHandlers);

    WebRouteLayoutPartOptions addRevealHandler(RouteViewRevealHandler revealHandler);

    WebRouteLayoutPartOptions setRevealHandler(RouteViewRevealHandler revealHandler);

    WebRouteLayoutPartOptions removeRevealHandler(RouteViewRevealHandler revealHandler);

    WebRouteLayoutPartOptions clearRevealHandlers();

    List<RouteViewBeforeRevealHandler> getBeforeRevealHandlers();

    ComponentOption<List<RouteViewBeforeRevealHandler>> getBeforeRevealHandlersOption();

    WebRouteLayoutPartOptions setBeforeRevealHandlers(List<RouteViewBeforeRevealHandler> beforeRevealHandlers);

    WebRouteLayoutPartOptions addBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebRouteLayoutPartOptions setBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebRouteLayoutPartOptions removeBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler);

    WebRouteLayoutPartOptions clearBeforeRevealHandlers();

    WebView getCurrentView();

    ComponentOption<WebView> getCurrentViewOption();

    WebRouteLayoutPartOptions setCurrentView(WebView currentView);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebRouteLayoutPartOptions addRoute(String path, RouteViewCreator creator);

    WebRouteLayoutPartOptions addRoute(String path, RouteViewCreator creator, RouteViewCreator.Mode creatorMode);

    WebComponentFactory getComponentFactory();

    WebRouteLayout getComponent();
}