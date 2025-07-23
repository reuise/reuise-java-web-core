package dev.reuise.web.core.scrollablecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.scrollablecontainer.AbstractCoreScrollableContainerEdgeOptions;
import dev.reuise.web.core.button.WebButton;
public abstract class AbstractWebScrollableContainerEdgeOptions<S extends AbstractWebScrollableContainerEdgeOptions<S>> extends AbstractCoreScrollableContainerEdgeOptions<S> implements WebScrollableContainerEdgeOptions {
    protected AbstractWebScrollableContainerEdgeOptions() {
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

    @Override
    public WebButton getScrollButton() {
        return ((WebButton) (getOptionValue("scrollButton")));
    }

    @Override
    public ComponentOption<WebButton> getScrollButtonOption() {
        return ((ComponentOption<WebButton>) (getOption("scrollButton")));
    }

    @Override
    public S setScrollButton(WebButton scrollButton) {
        setOption("scrollButton", scrollButton);
        return self();
    }

    private void setDefaultScrollButton(WebButton scrollButton) {
        setDefaultOption("scrollButton", scrollButton);
    }
}