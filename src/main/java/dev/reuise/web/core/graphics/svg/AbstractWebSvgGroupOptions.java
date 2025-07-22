package dev.reuise.web.core.graphics.svg;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.core.WebComponentOptions;
public abstract class AbstractWebSvgGroupOptions<S extends AbstractWebSvgGroupOptions<S>> implements WebSvgGroupOptions , WebComponentOptions {
    protected AbstractWebSvgGroupOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    protected abstract S self();
}