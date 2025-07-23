package dev.reuise.web.core.view;

import dev.reuise.web.core.view.RevealOptions;

public interface RouteViewBeforeRevealHandler {
    boolean onBeforeReveal(RevealOptions options);
}
