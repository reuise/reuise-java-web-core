package dev.reuise.web.core.parentcomponent;
import dev.reuise.core.parentcomponent.CoreParentComponentFoundation;
public class WebParentComponentFoundation {
    private final CoreParentComponentFoundation coreParentComponentFoundation;

    public WebParentComponentFoundation(WebParentComponentAdapter adapter, WebParentComponentOptions options) {
        this.coreParentComponentFoundation = new CoreParentComponentFoundation(adapter, options.getCoreParentComponentOptions());
    }
}