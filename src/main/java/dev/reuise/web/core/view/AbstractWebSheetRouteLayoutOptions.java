package dev.reuise.web.core.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.CoreContainerPartOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerDividerPartOptions;
import dev.reuise.core.splitcontainer.CoreSplitContainerPanelPartOptions;
import dev.reuise.web.core.WebComponentOptions;
import java.util.List;
public abstract class AbstractWebSheetRouteLayoutOptions<S extends AbstractWebSheetRouteLayoutOptions<S>> implements WebSheetRouteLayoutOptions , WebComponentOptions {
    // Indirect layout child
    private CoreContainerPartOptions containerOptions;

    // Indirect layout child
    private CoreSplitContainerPanelPartOptions startPanelOptions;

    // Indirect layout child
    private CoreSplitContainerDividerPartOptions dividerOptions;

    // Indirect layout child
    private CoreSplitContainerPanelPartOptions endPanelOptions;

    protected dev.reuise.web.core.view.WebRouteLayoutOptions routeLayoutOptions;

    protected AbstractWebSheetRouteLayoutOptions() {
        routeLayoutOptions = createDefaultRouteLayoutOptions();
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        containerOptions = getContainerOptions();
        startPanelOptions = getStartPanelOptions();
        dividerOptions = getDividerOptions();
        endPanelOptions = getEndPanelOptions();
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getUrl() {
        return routeLayoutOptions.getUrl();
    }

    @Override
    public S setUrl(String url) {
        this.routeLayoutOptions.setUrl(url);
        return self();
    }

    @Override
    public List<RouteOptions> getRoutes() {
        return routeLayoutOptions.getRoutes();
    }

    @Override
    public S setRoutes(List<RouteOptions> routes) {
        this.routeLayoutOptions.setRoutes(routes);
        return self();
    }

    @Override
    public S addRoute(RouteOptions route) {
        this.routeLayoutOptions.addRoute(route);
        return self();
    }

    @Override
    public S removeRoute(RouteOptions route) {
        routeLayoutOptions.removeRoute(route);
        return self();
    }

    @Override
    public boolean hasRoute(RouteOptions route) {
        return routeLayoutOptions.hasRoute(route);
    }

    @Override
    public S addRoute(String path, RouteViewCreator creator) {
        this.routeLayoutOptions.addRoute(path, creator);
        return self();
    }

    @Override
    public S addRoute(String path, RouteViewCreator creator, boolean preCreate) {
        this.routeLayoutOptions.addRoute(path, creator, preCreate);
        return self();
    }

    @Override
    public RouteViewRevealer getRouteViewRevealer() {
        return routeLayoutOptions.getRouteViewRevealer();
    }

    @Override
    public S setRouteViewRevealer(RouteViewRevealer routeViewRevealer) {
        this.routeLayoutOptions.setRouteViewRevealer(routeViewRevealer);
        return self();
    }

    @Override
    public List<RouteViewRevealHandler> getRevealHandlers() {
        return routeLayoutOptions.getRevealHandlers();
    }

    @Override
    public S setRevealHandlers(List<RouteViewRevealHandler> revealHandlers) {
        this.routeLayoutOptions.setRevealHandlers(revealHandlers);
        return self();
    }

    @Override
    public S addRevealHandler(RouteViewRevealHandler revealHandler) {
        this.routeLayoutOptions.addRevealHandler(revealHandler);
        return self();
    }

    @Override
    public S setRevealHandler(RouteViewRevealHandler revealHandler) {
        routeLayoutOptions.setRevealHandler(revealHandler);
        return self();
    }

    @Override
    public S removeRevealHandler(RouteViewRevealHandler revealHandler) {
        routeLayoutOptions.removeRevealHandler(revealHandler);
        return self();
    }

    @Override
    public List<RouteViewBeforeRevealHandler> getBeforeRevealHandlers() {
        return routeLayoutOptions.getBeforeRevealHandlers();
    }

    @Override
    public S setBeforeRevealHandlers(List<RouteViewBeforeRevealHandler> beforeRevealHandlers) {
        this.routeLayoutOptions.setBeforeRevealHandlers(beforeRevealHandlers);
        return self();
    }

    @Override
    public S addBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler) {
        this.routeLayoutOptions.addBeforeRevealHandler(beforeRevealHandler);
        return self();
    }

    @Override
    public S setBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler) {
        routeLayoutOptions.setBeforeRevealHandler(beforeRevealHandler);
        return self();
    }

    @Override
    public S removeBeforeRevealHandler(RouteViewBeforeRevealHandler beforeRevealHandler) {
        routeLayoutOptions.removeBeforeRevealHandler(beforeRevealHandler);
        return self();
    }

    @Override
    public WebView getCurrentView() {
        return routeLayoutOptions.getCurrentView();
    }

    @Override
    public S setCurrentView(WebView currentView) {
        this.routeLayoutOptions.setCurrentView(currentView);
        return self();
    }

    @Override
    public dev.reuise.web.core.view.WebRouteLayoutOptions getRouteLayoutOptions() {
        return routeLayoutOptions;
    }

    @Override
    public boolean hasRouteLayoutOptions() {
        return routeLayoutOptions != null;
    }

    @Override
    public S setRouteLayoutOptions(dev.reuise.web.core.view.WebRouteLayoutOptions routeLayoutOptions) {
        if (!hasRouteLayoutOptions())
            this.routeLayoutOptions = createDefaultRouteLayoutOptions();

        // Merge with default options
        this.routeLayoutOptions.merge(routeLayoutOptions);
        return self();
    }

    protected WebRouteLayoutOptions createDefaultRouteLayoutOptions() {
        WebRouteLayoutOptions options = getComponentFactory().createRouteLayoutOptions();
        options.setStyleClass("reuise-sheetroutelayout_routecontainer");
        options.setStyleClass("reuise-sheetroutelayout_routelayout");
        return options;
    }

    protected abstract S self();
}