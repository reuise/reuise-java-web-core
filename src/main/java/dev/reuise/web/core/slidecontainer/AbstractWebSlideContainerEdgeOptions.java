package dev.reuise.web.core.slidecontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.slidecontainer.AbstractCoreSlideContainerEdgeOptions;
import dev.reuise.web.core.button.WebButton;
public abstract class AbstractWebSlideContainerEdgeOptions<S extends AbstractWebSlideContainerEdgeOptions<S>> extends AbstractCoreSlideContainerEdgeOptions<S> implements WebSlideContainerEdgeOptions {
    protected AbstractWebSlideContainerEdgeOptions() {
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
    public WebButton getSlideButton() {
        return ((WebButton) (getOptionValue("slideButton")));
    }

    @Override
    public ComponentOption<WebButton> getSlideButtonOption() {
        return ((ComponentOption<WebButton>) (getOption("slideButton")));
    }

    @Override
    public S setSlideButton(WebButton slideButton) {
        setOption("slideButton", slideButton);
        return self();
    }

    private void setDefaultSlideButton(WebButton slideButton) {
        setDefaultOption("slideButton", slideButton);
    }
}