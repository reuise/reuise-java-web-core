package dev.reuise.web.core.graphics.svg;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentOptions;
public abstract class AbstractWebSvgPathOptions<S extends AbstractWebSvgPathOptions<S>> implements WebSvgPathOptions , WebComponentOptions {
    protected AbstractWebSvgPathOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getPath() {
        return ((String) (getOptionValue("path")));
    }

    @Override
    public ComponentOption<String> getPathOption() {
        return ((ComponentOption<String>) (getOption("path")));
    }

    @Override
    public S setPath(String path) {
        setOption("path", path);
        return self();
    }

    private void setDefaultPath(String path) {
        setDefaultOption("path", path);
    }

    protected abstract S self();
}