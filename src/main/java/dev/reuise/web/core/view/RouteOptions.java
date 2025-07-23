package dev.reuise.web.core.view;

import dev.reuise.web.core.view.RouteOptions;

public class RouteOptions {
    private String path;
    private RouteViewCreator viewCreator;
    private boolean preCreate = false;
    private boolean splitCode = false;

    public RouteOptions(String path, RouteViewCreator viewCreator, boolean preCreate) {
        this.path = path;
        this.viewCreator = viewCreator;
        this.preCreate = preCreate;
    }

    private RouteOptions(Builder builder) {
        this.path = builder.path;
        this.viewCreator = builder.viewCreator;
        this.preCreate = builder.preCreate;
        this.splitCode = builder.splitCode;
    }

    public RouteOptions(String path, RouteViewCreator viewCreator) {
        this(path, viewCreator, false);
    }

    public String getPath() {
        return path;
    }

    public RouteOptions setPath(String path) {
        this.path = path;
        return this;
    }

    public boolean isSplitCode() {
        return splitCode;
    }

    public RouteOptions setSplitCode(boolean splitCode) {
        this.splitCode = splitCode;
        return this;
    }

    public boolean isPreCreate() {
        return preCreate;
    }

    public RouteOptions setPreCreate(boolean preCreate) {
        this.preCreate = preCreate;
        return this;
    }

    public RouteViewCreator getViewCreator() {
        return viewCreator;
    }

    public RouteOptions setViewCreator(RouteViewCreator viewCreator) {
        this.viewCreator = viewCreator;
        return this;
    }

    public static <V extends WebView> RouteOptions create(String path, RouteViewCreator viewCreator) {
        return new RouteOptions(path, viewCreator);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String path;
        private RouteViewCreator viewCreator;
        private boolean preCreate = false;
        private boolean splitCode = false;

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setViewCreator(RouteViewCreator viewCreator) {
            this.viewCreator = viewCreator;
            return this;
        }

        public Builder setPreCreate(boolean preCreate) {
            this.preCreate = preCreate;
            return this;
        }

        public Builder setSplitCode(boolean splitCode) {
            this.splitCode = splitCode;
            return this;
        }

        public RouteOptions build() {
            return new RouteOptions(this);
        }
    }
}
