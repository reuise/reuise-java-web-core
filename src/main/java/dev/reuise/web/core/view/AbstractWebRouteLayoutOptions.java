package dev.reuise.web.core.view;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentOptions;
import dev.reuise.web.core.hydration.ClientConfigurationOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
public abstract class AbstractWebRouteLayoutOptions<S extends AbstractWebRouteLayoutOptions<S>> implements ClientConfigurationOptions , WebRouteLayoutOptions , WebComponentOptions {
    public S addRoute(String path, RouteViewCreator creator) {
        return addRoute(path, creator, RouteViewCreator.Mode.REUSE_CREATE_ON_FIRST_REVEAL);
    }

    public S addRoute(String path, RouteViewCreator creator, RouteViewCreator.Mode creatorMode) {
        return addRoute(new RouteOptions(path, creator, creatorMode));
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
    public String getPath() {
        return ((String) (getOptionValue("path")));
    }

    @Override
    public ComponentOption<String> getPathOption() {
        return ((ComponentOption<String>) (getOption("path")));
    }

    private void setDefaultPath(String path) {
        setDefaultOption("path", path);
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
        if (list == null)
            return self();

        list.remove(route);
        return self();
    }

    @Override
    public S clearRoutes() {
        List<RouteOptions> list = getRoutes();
        if (list == null)
            return self();

        list.clear();
        return self();
    }

    @Override
    public boolean hasRoute(RouteOptions route) {
        List<RouteOptions> list = getRoutes();
        if (list == null)
            return false;

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
        if (list == null)
            return self();

        list.remove(revealHandler);
        return self();
    }

    @Override
    public S clearRevealHandlers() {
        List<RouteViewRevealHandler> list = getRevealHandlers();
        if (list == null)
            return self();

        list.clear();
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
        if (list == null)
            return self();

        list.remove(beforeRevealHandler);
        return self();
    }

    @Override
    public S clearBeforeRevealHandlers() {
        List<RouteViewBeforeRevealHandler> list = getBeforeRevealHandlers();
        if (list == null)
            return self();

        list.clear();
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

    public String getClientConfigurationType() {
        return "RouteLayout";
    }

    public void restoreClientConfiguration(Map<String, Object> values) {
        restoreClientConfiguration(values, null);
    }

    public void restoreClientConfiguration(Map<String, Object> values, State state) {
        for (String key : values.keySet()) { switch (key) {case "tooltip": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "contentEditable": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "margin": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginTop": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginRight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginBottom": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "marginLeft": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "width": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "minWidth": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "maxWidth": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "height": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "minHeight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "maxHeight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "visible": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "enabled": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.bool(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;case "padding": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "paddingTop": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "paddingRight": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "paddingBottom": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "paddingLeft": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "position": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "inset": if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.scalar(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state), true)); } break;case "url": if (state != null) throw new IllegalArgumentException("Option has no states: " + key); if (getOption(key, state) == null || getOption(key, state) instanceof dev.reuise.core.option.DefaultComponentOption) { setOption(key, dev.reuise.web.core.hydration.ClientConfiguration.string(values.get(key)), state, false); getOptions(state).put(key, dev.reuise.core.option.RehydratedComponentOption.from(getOption(key, state))); } break;default: throw new IllegalArgumentException("Unknown client configuration option: " + key); } };
    }
}
