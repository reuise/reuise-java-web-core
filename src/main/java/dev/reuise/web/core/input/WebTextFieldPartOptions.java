package dev.reuise.web.core.input;
import dev.reuise.core.State;
import dev.reuise.core.input.CoreTextFieldPartOptions;
import dev.reuise.core.input.InputValidator;
import dev.reuise.web.core.WebComponentFactory;
import java.util.List;
// Value here??
// Placeholder here??
// Pattern here??
// Multiline here??
// MinLines here??
// MaxLines here??
// ReadOnly here??
// Autocomplete here??
// Validators here??
// Required here??
// Error here??
public interface WebTextFieldPartOptions extends CoreTextFieldPartOptions {
    String getValue();

    WebTextFieldPartOptions setValue(String value);

    String getPlaceholder();

    WebTextFieldPartOptions setPlaceholder(String placeholder);

    String getPattern();

    WebTextFieldPartOptions setPattern(String pattern);

    boolean isMultiline();

    WebTextFieldPartOptions setMultiline(Boolean multiline);

    Integer getMinLines();

    WebTextFieldPartOptions setMinLines(Integer minLines);

    Integer getMaxLines();

    WebTextFieldPartOptions setMaxLines(Integer maxLines);

    boolean isReadOnly();

    WebTextFieldPartOptions setReadOnly(Boolean readOnly);

    String getAutocomplete();

    WebTextFieldPartOptions setAutocomplete(String autocomplete);

    List<InputValidator> getValidators();

    WebTextFieldPartOptions setValidators(List<InputValidator> validators);

    WebTextFieldPartOptions addValidator(InputValidator validator);

    WebTextFieldPartOptions setValidator(InputValidator validator);

    WebTextFieldPartOptions removeValidator(InputValidator validator);

    boolean isRequired();

    WebTextFieldPartOptions setRequired(Boolean required);

    boolean isError();

    WebTextFieldPartOptions setError(Boolean error);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebTextField getComponent();
}