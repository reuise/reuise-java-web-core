package dev.reuise.web.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.input.AbstractCoreTextFieldOptions;
import dev.reuise.web.core.icon.WebIconOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
import dev.reuise.web.core.text.WebInlineTextOptions;
import dev.reuise.web.core.text.WebLabelOptions;
public abstract class AbstractWebTextFieldOptions<S extends AbstractWebTextFieldOptions<S>> extends AbstractCoreTextFieldOptions<S> implements WebTextFieldOptions {
    protected AbstractWebTextFieldOptions() {
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

    protected WebLabelOptions createDefaultLabelContainerOptions() {
        WebLabelOptions options = ((WebLabelOptions) (super.createDefaultLabelContainerOptions()));
        options.setStyleClass("reuise-textfield_label");
        return options;
    }

    protected WebContainerOptions createDefaultInputContainerOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultInputContainerOptions()));
        options.setStyleClass("reuise-textfield_inputcontainer");
        return options;
    }

    protected WebIconOptions createDefaultStartIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultStartIconOptions()));
        options.setStyleClass("reuise-textfield_starticon");
        return options;
    }

    protected WebBasicInputFieldOptions createDefaultInputOptions() {
        WebBasicInputFieldOptions options = ((WebBasicInputFieldOptions) (super.createDefaultInputOptions()));
        options.setStyleClass("reuise-textfield_input");
        return options;
    }

    protected WebIconOptions createDefaultEndIconOptions() {
        WebIconOptions options = ((WebIconOptions) (super.createDefaultEndIconOptions()));
        options.setStyleClass("reuise-textfield_endicon");
        return options;
    }

    protected WebInlineTextOptions createDefaultSupportingTextContainerOptions() {
        WebInlineTextOptions options = ((WebInlineTextOptions) (super.createDefaultSupportingTextContainerOptions()));
        options.setBaseStyleClass("reuise-textfield_supportingtext");
        options.setStyleClass("reuise-textfield_supportingtext");
        return options;
    }
}