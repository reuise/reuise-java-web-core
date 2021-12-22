package dev.reuise.web.core.button;
import dev.reuise.core.button.CoreButtonFoundation;
public class WebButtonFoundation {
    private final CoreButtonFoundation coreButtonFoundation;

    public WebButtonFoundation(WebButtonAdapter adapter, WebButtonOptions options) {
        this.coreButtonFoundation = new CoreButtonFoundation(adapter, options.getCoreButtonOptions());
    }
}