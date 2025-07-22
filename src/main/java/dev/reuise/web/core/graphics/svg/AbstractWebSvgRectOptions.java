package dev.reuise.web.core.graphics.svg;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.core.WebComponentOptions;
public abstract class AbstractWebSvgRectOptions<S extends AbstractWebSvgRectOptions<S>> implements WebSvgRectOptions , WebComponentOptions {
    protected AbstractWebSvgRectOptions() {
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