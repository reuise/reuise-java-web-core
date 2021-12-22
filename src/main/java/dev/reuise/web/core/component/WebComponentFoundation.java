package dev.reuise.web.core.component;
import dev.reuise.core.component.CoreComponentFoundation;
public class WebComponentFoundation {
    private final CoreComponentFoundation coreComponentFoundation;

    public WebComponentFoundation(WebComponentAdapter adapter, WebComponentOptions options) {
        this.coreComponentFoundation = new CoreComponentFoundation(adapter, options.getCoreComponentOptions());
    }
}