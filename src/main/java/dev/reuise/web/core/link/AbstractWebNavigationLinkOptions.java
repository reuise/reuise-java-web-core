package dev.reuise.web.core.link;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.link.AbstractCoreNavigationLinkOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.view.PathMatchType;
public abstract class AbstractWebNavigationLinkOptions<S extends AbstractWebNavigationLinkOptions<S>> extends AbstractCoreNavigationLinkOptions<S> implements WebNavigationLinkOptions {
    protected AbstractWebNavigationLinkOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        setDefaultActiveMatchType(PathMatchType.PATTERN);
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    @Override
    public PathMatchType getActiveMatchType() {
        return ((PathMatchType) (getOptionValue("activeMatchType")));
    }

    @Override
    public ComponentOption<PathMatchType> getActiveMatchTypeOption() {
        return ((ComponentOption<PathMatchType>) (getOption("activeMatchType")));
    }

    @Override
    public S setActiveMatchType(PathMatchType activeMatchType) {
        setOption("activeMatchType", activeMatchType, true);
        return self();
    }

    private void setDefaultActiveMatchType(PathMatchType activeMatchType) {
        setDefaultOption("activeMatchType", activeMatchType, true);
    }
}