package dev.reuise.web.core.chip;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.chip.AbstractCoreFilterChipOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.icon.WebIconOptions;
public abstract class AbstractWebFilterChipOptions<S extends AbstractWebFilterChipOptions<S>> extends AbstractCoreFilterChipOptions<S> implements WebFilterChipOptions {
    protected AbstractWebFilterChipOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    // Implementation
    // Implementation
    public void onInitialize() {
        super.onInitialize();
        if (!isRehydrated()) {
            if (isHasCheckIcon()) {
                WebSvgOptions checkIconSvgOpts = getComponentFactory().createSvgOptions();
                checkIconSvgOpts.setViewBox("0 0 18 18");
                WebIconOptions checkIconOpts = getComponentFactory().createIconOptions();
                checkIconOpts.setSvgOptions(checkIconSvgOpts);
                setStartIconOptions(checkIconOpts);
            }
            if (isHasRemoveIcon()) {
                WebSvgOptions removeIconSvgOpts = getComponentFactory().createSvgOptions();
                removeIconSvgOpts.setViewBox("0 96 960 960");
                WebIconOptions removeIconOpts = getComponentFactory().createIconOptions();
                removeIconOpts.setSvgOptions(removeIconSvgOpts);
                setEndIconOptions(removeIconOpts);
            }
        }
    }
}