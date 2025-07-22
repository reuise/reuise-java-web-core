package dev.reuise.web.core.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public abstract class AbstractWebRouteLayoutOptions<S extends AbstractWebRouteLayoutOptions<S>> implements WebRouteLayoutOptions , WebComponentOptions {
    public S addRoute(String path, RouteViewCreator creator) {
        return addRoute(path, creator, false);
    }

    public S addRoute(String path, RouteViewCreator creator, boolean preCreate) {
        return addRoute(new RouteOptions(path, creator, preCreate));
    }

    public S setUrl(String url, boolean updateUrl) {
        return setUrl(url);
    }

    protected AbstractWebRouteLayoutOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setRoutes(new ArrayList<>());
        setDefaultRouteViewRevealer(new DefaultRouteViewRevealer());
        setDefaultRevealHandlers(new ArrayList<>());
        setDefaultBeforeRevealHandlers(new ArrayList<>());
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getUrl() {
        return ((String) (getOptionValue("url")));
    }

    @Override
    public ComponentOption<String> getUrlOption() {
        return ((ComponentOption<String>) (getOption("url")));
    }

    @Override
    public S setUrl(String url) {
        setOption("url", url);
        return self();
    }

    private void setDefaultUrl(String url) {
        setDefaultOption("url", url);
    }

    @Override
    public List<RouteOptions> getRoutes() {
        return ((List<RouteOptions>) (getOptionValue("routes")));
    }

    @Override
    public ComponentOption<List<RouteOptions>> getRoutesOption() {
        return ((ComponentOption<List<RouteOptions>>) (getOption("routes")));
    }

    @Override
    public S setRoutes(List<RouteOptions> routes) {
        setOption("routes", routes, true);
        return self();
    }

    @Override
    public S addRoute(RouteOptions route) {
        List<RouteOptions> list = getRoutes();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setRoutes(list);
        }
        list.add(route);
        return self();
    }

    @Override
    public S removeRoute(RouteOptions route) {
        List<RouteOptions> list = getRoutes();
        if (list == null) {
            return self();
        }
        list.remove(route);
        return self();
    }

    @Override
    public boolean hasRoute(RouteOptions route) {
        List<RouteOptions> list = getRoutes();
        if (list == null) {
            return false;
        }
        return list.contains(route);
    }

    private void setDefaultRoutes(List<RouteOptions> routes) {
        setDefaultOption("routes", routes, true);
    }

    @Override
    public RouteViewRevealer getRouteViewRevealer() {
        return ((RouteViewRevealer) (getOptionValue("routeViewRevealer")));
    }

    @Override
    public ComponentOption<RouteViewRevealer> getRouteViewRevealerOption() {
        return ((ComponentOption<RouteViewRevealer>) (getOption("routeViewRevealer")));
    }

    @Override
    public S setRouteViewRevealer(RouteViewRevealer routeViewRevealer) {
        setOption("routeViewRevealer", routeViewRevealer, true);
        return self();
    }

    private void setDefaultRouteViewRevealer(RouteViewRevealer routeViewRevealer) {
        setDefaultOption("routeViewRevealer", routeViewRevealer, true);
    }

    @Override
    public List<RouteViewRevealHandler> getRevealHandlers() {
        return ((List<RouteViewRevealHandler>) (getOptionValue("revealHandlers")));
    }

    @Override
    public ComponentOption<List<RouteViewRevealHandler>> getRevealHandlersOption() {
        return ((ComponentOption<List<RouteViewRevealHandler>>) (getOption("revealHandlers")));
    }

    @Override
    public S setRevealHandlers(List<RouteViewRevealHandler> revealHandlers) {
        setOption("revealHandlers", revealHandlers, true);
        return self();
    }

    @Override
    public S addRevealHandler(RouteViewRevealHandler revealHandler) {
        List<RouteViewRevealHandler> list = getRevealHandlers();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setRevealHandlers(list);
        }
        list.add(revealHandler);
        return self();
    }

    @Override
    public S setRevealHandler(RouteViewRevealHandler revealHandler) {
        setRevealHandlers(new ArrayList<RouteViewRevealHandler>(Arrays.asList(revealHandler)));
        return self();
    }

    @Override
    public S removeRevealHandler(RouteViewRevealHandler revealHandler) {
        List<RouteViewRevealHandler> list = getRevealHandlers();
        if (list == null) {
            return self();
        }
        list.remove(revealHandler);
        return self();
    }

    private void setDefaultRevealHandlers(List<RouteViewRevealHandler> revealHandlers) {
        setDefaultOption("revealHandlers", revealHandlers, true);
    }

    @Override
    public List<RouteViewBeforeRevealHandler> getBeforeRevealHandlers() {
        return ((List<RouteViewBeforeRevealHandler>) (getOptionValue("beforeRevealHandlers")));
    }

    @Override
    public ComponentOption<List<RouteViewBeforeRevealHandler>> getBeforeRevealHandlersOption() {
        return ((ComponentOption<List<RouteViewBeforeRevealHandler>>) (getOption("beforeRevealHandlers")));
    }

    @Override
    public S setBeforeRevealHandlers(List<RouteViewBeforeRevealHandler> beforeRevealHandlers) {
        setOption("beforeRevealHandlers", beforeRevealHandlers, true);
        return self();
    }

    @Override
    public S addBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler) {
        List<RouteViewBeforeRevealHandler> list = getBeforeRevealHandlers();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setBeforeRevealHandlers(list);
        }
        list.add(beforeRevealHandler);
        return self();
    }

    @Override
    public S setBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler) {
        setBeforeRevealHandlers(new ArrayList<RouteViewBeforeRevealHandler>(Arrays.asList(beforeRevealHandler)));
        return self();
    }

    @Override
    public S removeBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler) {
        List<RouteViewBeforeRevealHandler> list = getBeforeRevealHandlers();
        if (list == null) {
            return self();
        }
        list.remove(beforeRevealHandler);
        return self();
    }

    private void setDefaultBeforeRevealHandlers(List<RouteViewBeforeRevealHandler> beforeRevealHandlers) {
        setDefaultOption("beforeRevealHandlers", beforeRevealHandlers, true);
    }

    @Override
    public WebView getCurrentView() {
        return ((WebView) (getOptionValue("currentView")));
    }

    @Override
    public ComponentOption<WebView> getCurrentViewOption() {
        return ((ComponentOption<WebView>) (getOption("currentView")));
    }

    @Override
    public S setCurrentView(WebView currentView) {
        setOption("currentView", currentView);
        return self();
    }

    private void setDefaultCurrentView(WebView currentView) {
        setDefaultOption("currentView", currentView);
    }

    protected abstract S self();
}