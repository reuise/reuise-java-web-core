package dev.reuise.web.core.view;

import dev.reuise.web.core.view.RouteOptions;

public class RouteOptions {
    private String path;
    private RouteViewCreator viewCreator;
    private RouteViewCreator.Mode viewCreatorMode;
    private boolean splitCode = false;

    public RouteOptions(String path, RouteViewCreator viewCreator, RouteViewCreator.Mode viewCreatorMode) {
        this.path = path;
        this.viewCreator = viewCreator;
        this.viewCreatorMode = viewCreatorMode;
    }

    public RouteOptions(String path, RouteViewCreator viewCreator) {
        this(path, viewCreator, RouteViewCreator.Mode.REUSE_CREATE_ON_FIRST_REVEAL);
    }

    private RouteOptions(Builder builder) {
        this.path = builder.path;
        this.viewCreator = builder.viewCreator;
        this.splitCode = builder.splitCode;
        this.viewCreatorMode = builder.viewCreatorMode;
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
        return viewCreatorMode == RouteViewCreator.Mode.REUSE_PRECREATE;
    }

    public boolean isReuseView() {
        return viewCreatorMode == RouteViewCreator.Mode.REUSE_PRECREATE || viewCreatorMode == RouteViewCreator.Mode.REUSE_CREATE_ON_FIRST_REVEAL;
    }

    public RouteViewCreator getViewCreator() {
        return viewCreator;
    }

    public RouteOptions setViewCreator(RouteViewCreator viewCreator) {
        this.viewCreator = viewCreator;
        return this;
    }

    public RouteViewCreator.Mode getViewCreatorMode() {
        return viewCreatorMode;
    }

    public boolean isViewCreatorMode(RouteViewCreator.Mode mode) {
        return viewCreatorMode == mode;
    }

    public void setViewCreatorMode(RouteViewCreator.Mode viewCreatorMode) {
        this.viewCreatorMode = viewCreatorMode;
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
        private RouteViewCreator.Mode viewCreatorMode = RouteViewCreator.Mode.REUSE_CREATE_ON_FIRST_REVEAL;
        private boolean splitCode = false;

        public Builder setPath(String path) {
            this.path = path;
            return this;
        }

        public Builder setViewCreator(RouteViewCreator viewCreator) {
            this.viewCreator = viewCreator;
            return this;
        }

        public Builder setSplitCode(boolean splitCode) {
            this.splitCode = splitCode;
            return this;
        }

        public RouteViewCreator.Mode getViewCreatorMode() {
            return viewCreatorMode;
        }

        public void setViewCreatorMode(RouteViewCreator.Mode viewCreatorMode) {
            this.viewCreatorMode = viewCreatorMode;
        }

        public RouteOptions build() {
            return new RouteOptions(this);
        }
    }
}
