package dev.reuise.web.core.document;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.web.core.WebComponentOptions;
public abstract class AbstractWebDocumentBodyOptions<S extends AbstractWebDocumentBodyOptions<S>> implements WebDocumentBodyOptions , WebComponentOptions {
    protected AbstractWebDocumentBodyOptions() {
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