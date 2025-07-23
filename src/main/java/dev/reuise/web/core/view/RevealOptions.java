package dev.reuise.web.core.view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RevealOptions {
    private String routePath;
    private String path;
    private Map<String, String> parameters = new HashMap<>();
    private AntPathMatcher matcher = new AntPathMatcher();

    public String getRoutePath() {
        return routePath;
    }

    public boolean isRoutePathMatch(String path) {
        return this.routePath != null && matcher.match(this.routePath, path);
    }

    public boolean isRoutePathMatch(String... paths) {
        return this.routePath != null && Arrays.asList(paths).stream().anyMatch(this::isRoutePathMatch);
    }

    public boolean isPathMatch(String path) {
        return this.path != null && matcher.match(path, this.path);
    }

    public boolean isPathMatch(String... paths) {
        return this.path != null && Arrays.asList(paths).stream().anyMatch(this::isPathMatch);
    }

    public void setRoutePath(String path) {
        this.routePath = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public String getParameter(String name) {
        return parameters.get(name);
    }

    public RevealOptions setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
}
