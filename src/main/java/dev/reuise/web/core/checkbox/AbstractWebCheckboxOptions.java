package dev.reuise.web.core.checkbox;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.checkbox.AbstractCoreCheckboxOptions;
import dev.reuise.web.core.text.WebLabelOptions;
public abstract class AbstractWebCheckboxOptions<S extends AbstractWebCheckboxOptions<S>> extends AbstractCoreCheckboxOptions<S> implements WebCheckboxOptions {
    protected AbstractWebCheckboxOptions() {
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

    protected WebBasicCheckboxOptions createDefaultCheckboxOptions() {
        WebBasicCheckboxOptions options = ((WebBasicCheckboxOptions) (super.createDefaultCheckboxOptions()));
        options.setStyleClass("reuise-checkbox_checkbox");
        return options;
    }

    protected WebLabelOptions createDefaultLabelContainerOptions() {
        WebLabelOptions options = ((WebLabelOptions) (super.createDefaultLabelContainerOptions()));
        options.setBaseStyleClass("reuise-checkbox_label");
        options.setStyleClass("reuise-checkbox_label");
        return options;
    }
}