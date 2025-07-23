package dev.reuise.web.core.view;

import java.util.List;
import java.util.Map;

import dev.reuise.web.core.WebComponent;

public class RouteViewRevealOptions extends RevealOptions {
    private RouteOptions route;
    private boolean reveal;
    private WebView view;
    private List<RouteViewRevealHandler> revealHandlers;
    private List<RouteViewBeforeRevealHandler> beforeRevealHandlers;

    @Override
    public RouteViewRevealOptions setParameters(Map<String, String> parameters) {
        super.setParameters(parameters);
        return this;
    }

    public WebComponent getView() {
        return view;
    }

    public RouteViewRevealOptions setView(WebView view) {
        this.view = view;
        return this;
    }

    public boolean isReveal() {
        return reveal;
    }

    public RouteViewRevealOptions setReveal(boolean reveal) {
        this.reveal = reveal;
        return this;
    }

    public RouteOptions getRoute() {
        return route;
    }

    public RouteViewRevealOptions setRoute(RouteOptions route) {
        this.route = route;
        return this;
    }

    public List<RouteViewRevealHandler> getRevealHandlers() {
        return revealHandlers;
    }

    public RouteViewRevealOptions setRevealHandlers(List<RouteViewRevealHandler> revealHandlers) {
        this.revealHandlers = revealHandlers;
        return this;
    }

    public List<RouteViewBeforeRevealHandler> getBeforeRevealHandlers() {
        return beforeRevealHandlers;
    }

    public RouteViewRevealOptions setBeforeRevealHandlers(List<RouteViewBeforeRevealHandler> beforeRevealHandlers) {
        this.beforeRevealHandlers = beforeRevealHandlers;
        return this;
    }
}
