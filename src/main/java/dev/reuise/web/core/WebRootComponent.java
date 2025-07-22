package dev.reuise.web.core;
import dev.reuise.core.RootComponent;
import dev.reuise.webstyles.StyleBuilder;
public interface WebRootComponent extends RootComponent {
    StyleBuilder getCommonStyles();

    String getPath();

    String getUrl();
}