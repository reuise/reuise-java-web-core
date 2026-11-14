package dev.reuise.web.core.text;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.text.AbstractCoreParagraphOptions;
public abstract class AbstractWebParagraphOptions<S extends AbstractWebParagraphOptions<S>> extends AbstractCoreParagraphOptions<S> implements WebParagraphOptions {
    protected AbstractWebParagraphOptions() {
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
