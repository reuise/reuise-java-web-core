package dev.reuise.web.core.chip;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.chip.AbstractCoreChipGroupOptions;
import dev.reuise.core.chip.CoreChipOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.icon.WebIconOptions;
public abstract class AbstractWebChipGroupOptions<S extends AbstractWebChipGroupOptions<S>> extends AbstractCoreChipGroupOptions<S> implements WebChipGroupOptions {
    protected AbstractWebChipGroupOptions() {
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
        if (isHideUnselected()) {
            CoreChipOptions addButtonOptions = getAddButtonOptions();
            if ((!isRehydrated()) && (addButtonOptions != null)) {
                WebSvgOptions svgOpts = getComponentFactory().createSvgOptions();
                svgOpts.setViewBox("0 -960 960 960");
                WebIconOptions addIconOpts = getComponentFactory().createIconOptions();
                addIconOpts.setSvgOptions(svgOpts);
                addButtonOptions.setStartIconOptions(addIconOpts);
            }
        }
    }

    protected WebChipOptions createDefaultAddButtonOptions() {
        WebChipOptions options = ((WebChipOptions) (super.createDefaultAddButtonOptions()));
        options.setStyleClass("reuise-chipgroup_addbutton");
        return options;
    }
}