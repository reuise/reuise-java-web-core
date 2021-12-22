package dev.reuise.web.core.parentcomponent;
import dev.reuise.core.parentcomponent.CoreParentComponentOptions;
public class WebParentComponentOptions {
    private final CoreParentComponentOptions coreParentComponentOptions;

    public WebParentComponentOptions() {
        this.coreParentComponentOptions = new CoreParentComponentOptions();
    }

    public CoreParentComponentOptions getCoreParentComponentOptions() {
        return this.coreParentComponentOptions;
    }
}