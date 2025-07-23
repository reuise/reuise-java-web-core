package dev.reuise.web.core.badge;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.badge.AbstractCoreBadgeOptions;
public abstract class AbstractWebBadgeOptions<S extends AbstractWebBadgeOptions<S>> extends AbstractCoreBadgeOptions<S> implements WebBadgeOptions {
    protected AbstractWebBadgeOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }
}