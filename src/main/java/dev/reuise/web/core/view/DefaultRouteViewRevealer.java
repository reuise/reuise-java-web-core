package dev.reuise.web.core.view;

import dev.reuise.web.core.WebComponent;

public class DefaultRouteViewRevealer implements RouteViewRevealer{

    @Override
    public void reveal(RouteViewRevealOptions options) {
        WebComponent view = options.getView();
        if(view == null) return;
        view.setVisible(options.isReveal());
    }
    
}
