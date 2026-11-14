package dev.reuise.web.core.layout;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.layout.AbstractCoreContainerOptions;
import dev.reuise.core.option.ComponentOption;
public abstract class AbstractWebContainerOptions<S extends AbstractWebContainerOptions<S>> extends AbstractCoreContainerOptions<S> implements WebContainerOptions {
    protected AbstractWebContainerOptions() {
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
    public ComponentAnimation getAnimation() {
        return ((ComponentAnimation) (getOptionValue("animation")));
    }

    @Override
    public ComponentOption<ComponentAnimation> getAnimationOption() {
        return ((ComponentOption<ComponentAnimation>) (getOption("animation")));
    }

    @Override
    public S setAnimation(ComponentAnimation animation) {
        setOption("animation", animation);
        return self();
    }

    private void setDefaultAnimation(ComponentAnimation animation) {
        setDefaultOption("animation", animation);
    }
}
