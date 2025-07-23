package dev.reuise.web.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.input.AbstractCoreChipFieldOptions;
import dev.reuise.web.core.chip.WebChipGroupOptions;
public abstract class AbstractWebChipFieldOptions<S extends AbstractWebChipFieldOptions<S>> extends AbstractCoreChipFieldOptions<S> implements WebChipFieldOptions {
    protected AbstractWebChipFieldOptions() {
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

    protected WebChipGroupOptions createDefaultChipGroupOptions() {
        WebChipGroupOptions options = ((WebChipGroupOptions) (super.createDefaultChipGroupOptions()));
        options.setStyleClass("reuise-textfield_chipgroup");
        return options;
    }
}