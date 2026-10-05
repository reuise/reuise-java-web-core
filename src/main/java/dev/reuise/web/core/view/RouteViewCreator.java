package dev.reuise.web.core.view;

public interface RouteViewCreator {
    public enum Mode {
        REUSE_PRECREATE, // Pre-create and cache all views when the layout is initialized.
        REUSE_CREATE_ON_FIRST_REVEAL, // Create a new instance only when the view is first shown, then reuse it.
        RECREATE_ON_REVEAL; // Always create a new view instance each time it's shown.
    }

    WebView create(RouteOptions routeOptions, RouteViewRevealOptions revealOptions);
}
