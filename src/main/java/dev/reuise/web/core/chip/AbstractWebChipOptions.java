package dev.reuise.web.core.chip;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.chip.AbstractCoreChipOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.text.WebLabelOptions;
public abstract class AbstractWebChipOptions<S extends AbstractWebChipOptions<S>> extends AbstractCoreChipOptions<S> implements WebChipOptions {
    protected AbstractWebChipOptions() {
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

    protected WebIconOptions createDefaultStartIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultStartIconOptions()));
        options.setStyleClass("reuise-chip_starticon");
        return options;
    }

    protected WebLabelOptions createDefaultLabelContainerOptions() {
        WebLabelOptions options = ((WebLabelOptions) (super.createDefaultLabelContainerOptions()));
        options.setBaseStyleClass("reuise-chip_label");
        options.setStyleClass("reuise-chip_label");
        return options;
    }

    protected WebIconOptions createDefaultEndIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultEndIconOptions()));
        options.setStyleClass("reuise-chip_endicon");
        return options;
    }
}