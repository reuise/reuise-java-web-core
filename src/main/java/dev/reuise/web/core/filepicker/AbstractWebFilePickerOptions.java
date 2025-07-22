package dev.reuise.web.core.filepicker;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentOptions;
public abstract class AbstractWebFilePickerOptions<S extends AbstractWebFilePickerOptions<S>> implements WebFilePickerOptions , WebComponentOptions {
    protected AbstractWebFilePickerOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
    }

    public boolean onPreInitialize() {
        setDefaultMultiple(false);
        return true;
    }

    public void onInitialize() {
    }

    @Override
    public String getAccept() {
        return ((String) (getOptionValue("accept")));
    }

    @Override
    public ComponentOption<String> getAcceptOption() {
        return ((ComponentOption<String>) (getOption("accept")));
    }

    @Override
    public S setAccept(String accept) {
        setOption("accept", accept);
        return self();
    }

    private void setDefaultAccept(String accept) {
        setDefaultOption("accept", accept);
    }

    @Override
    public boolean isMultiple() {
        return Boolean.TRUE.equals(getOptionValue("multiple"));
    }

    @Override
    public ComponentOption<Boolean> getMultipleOption() {
        return ((ComponentOption<Boolean>) (getOption("multiple")));
    }

    @Override
    public S setMultiple(Boolean multiple) {
        setOption("multiple", multiple);
        return self();
    }

    private void setDefaultMultiple(Boolean multiple) {
        setDefaultOption("multiple", multiple);
    }

    protected abstract S self();
}