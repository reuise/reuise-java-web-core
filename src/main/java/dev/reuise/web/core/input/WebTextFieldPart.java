package dev.reuise.web.core.input;
import dev.reuise.core.input.CoreTextFieldPart;
import dev.reuise.core.input.InputValidator;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.icon.WebIcon;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebInlineText;
import dev.reuise.web.core.text.WebLabel;
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
public interface WebTextFieldPart extends WebParentComponentPart , CoreTextFieldPart , WebTextFieldFeatures , WebComponentPart {
    String getValue();

    WebTextFieldPart setValue(String value);

    String getPlaceholder();

    WebTextFieldPart setPlaceholder(String placeholder);

    String getPattern();

    WebTextFieldPart setPattern(String pattern);

    boolean isMultiline();

    WebTextFieldPart setMultiline(Boolean multiline);

    Integer getMinLines();

    WebTextFieldPart setMinLines(Integer minLines);

    Integer getMaxLines();

    WebTextFieldPart setMaxLines(Integer maxLines);

    boolean isReadOnly();

    WebTextFieldPart setReadOnly(Boolean readOnly);

    String getAutocomplete();

    WebTextFieldPart setAutocomplete(String autocomplete);

    List<InputValidator> getValidators();

    WebTextFieldPart setValidators(List<InputValidator> validators);

    WebTextFieldPart addValidator(InputValidator validator);

    WebTextFieldPart setValidator(InputValidator validator);

    WebTextFieldPart removeValidator(InputValidator validator);

    boolean isRequired();

    WebTextFieldPart setRequired(Boolean required);

    boolean isError();

    WebTextFieldPart setError(Boolean error);

    WebLabel getLabelContainer();

    WebContainer getInputContainer();

    WebIcon getStartIcon();

    WebBasicInputField getInput();

    WebIcon getEndIcon();

    WebInlineText getSupportingTextContainer();

    WebParentComponentPart getParentComponentPart();
}