package dev.reuise.web.core.input;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.input.DefaultCoreBasicInputFieldPart;
import dev.reuise.core.input.InputValidator;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
// Option: Id - WEB
// Option: TagName - WEB
// Option: XmlNamespace - WEB
// Option: Tooltip - WEB
// Option: BaseStyleClass - WEB
// Option: Attributes - WEB
// Option: StyleClasses - WEB
// Option: Data - WEB
// Option: Style - WEB
// Option: InlineStyle - WEB
// Option: Rehydration - WEB
// Option: ContentEditable - WEB
// Option: StoreInElementOptions - WEB
// Option: Mounted - CORE
// Option: Margin - CORE
// Option: MarginTop - CORE
// Option: MarginRight - CORE
// Option: MarginBottom - CORE
// Option: MarginLeft - CORE
// Option: Width - CORE
// Option: MinWidth - CORE
// Option: MaxWidth - CORE
// Option: Height - CORE
// Option: MinHeight - CORE
// Option: MaxHeight - CORE
// Option: RequiredLayoutComponent - CORE
// Option: Parent - CORE
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: baseComponent
// add composition for baseComponent: isRehydrated
// add composition for baseComponent: getComputedStyle
// add composition for baseComponent: addOrRemoveStyleClass
// add composition for baseComponent: hasStyleClass
// add composition for baseComponent: removeStyleClass
// add composition for baseComponent: setAttribute
// add composition for baseComponent: removeAttribute
// add composition for baseComponent: getAttribute
// add composition for baseComponent: hasAttribute
// add composition for baseComponent: setData
// add composition for baseComponent: getData
// add composition for baseComponent: hasData
// add composition for baseComponent: setAria
// add composition for baseComponent: getAria
// add composition for baseComponent: hasAria
// add composition for baseComponent: getUniqueId
// add composition for baseComponent: getUniqueStyleClass
// add composition for baseComponent: getStyleSheetId
// add composition for baseComponent: getStyleStates
// add composition for baseComponent: setStyleSheetFactory
// add composition for baseComponent: getStyle
// add composition for baseComponent: hasWrapper
// add composition for baseComponent: isInitialized
// add composition for baseComponent: log
// add composition for baseComponent: removeFromParent
public abstract class DefaultWebBasicInputFieldPart<S extends DefaultWebBasicInputFieldPart<S, O>, O extends WebBasicInputFieldPartOptions> extends DefaultCoreBasicInputFieldPart<S, O> implements WebComponentPart , WebBasicInputField {
    @Override
    public String getPlaceholder() {
        return getAttribute("placeholder");
    }

    @Override
    public S setPlaceholder(String placeholder) {
        setAttribute("placeholder", placeholder);
        return self();
    }

    @Override
    public S setAutocomplete(String autocomplete) {
        if (autocomplete == null)
            removeAttribute("autocomplete");
        else
            setAttribute("autocomplete", autocomplete);

        return self();
    }

    @Override
    public S setAutocomplete(boolean autocomplete) {
        if (!autocomplete)
            removeAttribute("autocomplete");
        else
            setAttribute("autocomplete", "off");

        return self();
    }

    @Override
    public boolean isRequired() {
        return hasAttribute("required");
    }

    @Override
    public S setRequired(Boolean required) {
        super.setRequired(required);
        if ((required == null) || required.booleanValue())
            removeAttribute("required");
        else
            setAttribute("required", "required");

        return self();
    }

    @Override
    public String getAutocomplete() {
        return getAttribute("autocomplete");
    }

    @Override
    public boolean isAutocomplete() {
        String value = getAttribute("autocomplete");
        return (value != null) && (!value.equals("off"));
    }

    @Override
    public S setReadOnly(Boolean readonly) {
        if ((readonly == null) || (!readonly.booleanValue()))
            removeAttribute("readonly");
        else
            setAttribute("readonly", "");

        return self();
    }

    @Override
    public boolean isReadOnly() {
        return hasAttribute("readonly");
    }

    @Override
    public boolean isError() {
        return hasStyleClass(getBaseStyleClass() + "--error");
    }

    @Override
    public S setError(Boolean error) {
        addOrRemoveStyleClass(getBaseStyleClass() + "--error", error);
        return self();
    }

    @Override
    public S setMinLines(Integer minLines) {
        if ((minLines == null) || (minLines < 1))
            return self();

        setMultiline(true);
        setAttribute("rows", Integer.toString(minLines));
        Integer maxLines = getMaxLines();
        if ((maxLines == null) || (maxLines < minLines))
            setMaxLines(minLines);

        return self();
    }

    @Override
    public Integer getMinLines() {
        String rows = getAttribute("rows");
        if (rows == null)
            return null;

        return Integer.parseInt(rows);
    }

    @Override
    public S setMaxLines(Integer maxLines) {
        if ((maxLines == null) || (maxLines < 1))
            return self();

        setMultiline(true);
        Integer minLines = getMinLines();
        if ((minLines == null) || (minLines > maxLines))
            setMinLines(maxLines);

        return self();
    }

    @Override
    public Integer getMaxLines() {
        return null;
    }

    @Override
    public boolean isMultiline() {
        return getTagName().equals("textarea");
    }

    @Override
    public S setMultiline(Boolean multiline) {
        setTagName(multiline ? "textarea" : "input");
        if (multiline) {
            removeAttribute("type");
        } else {
            setAttribute("type", "text");
        }
        return self();
    }

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebBasicInputFieldPart(O options) {
        super(options);
    }

    protected void setupReferences() {
        // Parts
        baseComponentPart = getBaseComponentPart();
        super.setupReferences();
    }

    @Override
    public String getId() {
        return baseComponentPart.getId();
    }

    @Override
    public S setId(String id) {
        this.baseComponentPart.setId(id);
        return self();
    }

    @Override
    public String getTagName() {
        return baseComponentPart.getTagName();
    }

    @Override
    public S setTagName(String tagName) {
        this.baseComponentPart.setTagName(tagName);
        return self();
    }

    @Override
    public String getXmlNamespace() {
        return baseComponentPart.getXmlNamespace();
    }

    @Override
    public S setXmlNamespace(String xmlNamespace) {
        this.baseComponentPart.setXmlNamespace(xmlNamespace);
        return self();
    }

    @Override
    public String getTooltip() {
        return baseComponentPart.getTooltip();
    }

    @Override
    public S setTooltip(String tooltip) {
        this.baseComponentPart.setTooltip(tooltip);
        return self();
    }

    @Override
    public String getBaseStyleClass() {
        return baseComponentPart.getBaseStyleClass();
    }

    @Override
    public S setBaseStyleClass(String baseStyleClass) {
        this.baseComponentPart.setBaseStyleClass(baseStyleClass);
        return self();
    }

    @Override
    public Map<String, String> getAttributes() {
        return baseComponentPart.getAttributes();
    }

    @Override
    public S setAttributes(Map<String, String> attributes) {
        this.baseComponentPart.setAttributes(attributes);
        return self();
    }

    @Override
    public List<String> getStyleClasses() {
        return baseComponentPart.getStyleClasses();
    }

    @Override
    public S setStyleClasses(List<String> styleClasses) {
        this.baseComponentPart.setStyleClasses(styleClasses);
        return self();
    }

    @Override
    public S addStyleClass(String styleClass) {
        this.baseComponentPart.addStyleClass(styleClass);
        return self();
    }

    @Override
    public S setStyleClass(String styleClass) {
        baseComponentPart.setStyleClass(styleClass);
        return self();
    }

    @Override
    public S setStyleClasses(String... styleClasses) {
        baseComponentPart.setStyleClasses(styleClasses);
        return self();
    }

    @Override
    public Map<String, String> getData() {
        return baseComponentPart.getData();
    }

    @Override
    public S setData(Map<String, String> data) {
        this.baseComponentPart.setData(data);
        return self();
    }

    @Override
    public Style getStyle() {
        return baseComponentPart.getStyle();
    }

    @Override
    public S setStyle(Style style) {
        this.baseComponentPart.setStyle(style);
        return self();
    }

    @Override
    public S setStyle(Style style, State state) {
        this.baseComponentPart.setStyle(style, state);
        return self();
    }

    @Override
    public S setStyleAllStates(Style style) {
        setStyle(ScreenSizeValues.of(style, style));
        setStyle(style);
        return self();
    }

    @Override
    public S setStyle(ScreenSizeValues<Style> style) {
        this.baseComponentPart.setStyle(style);
        return self();
    }

    @Override
    public Style getStyle(State state) {
        return baseComponentPart.getStyle(state);
    }

    @Override
    public Style getInlineStyle() {
        return baseComponentPart.getInlineStyle();
    }

    @Override
    public S setInlineStyle(Style inlineStyle) {
        this.baseComponentPart.setInlineStyle(inlineStyle);
        return self();
    }

    @Override
    public String getRehydration() {
        return baseComponentPart.getRehydration();
    }

    @Override
    public S setRehydration(String rehydration) {
        this.baseComponentPart.setRehydration(rehydration);
        return self();
    }

    @Override
    public boolean isContentEditable() {
        return baseComponentPart.isContentEditable();
    }

    @Override
    public S setContentEditable(Boolean contentEditable) {
        this.baseComponentPart.setContentEditable(contentEditable);
        return self();
    }

    @Override
    public List<String> getStoreInElementOptions() {
        return baseComponentPart.getStoreInElementOptions();
    }

    @Override
    public S setStoreInElementOptions(List<String> storeInElementOptions) {
        this.baseComponentPart.setStoreInElementOptions(storeInElementOptions);
        return self();
    }

    @Override
    public S addStoreInElementOptions(String storeInElementOptions) {
        this.baseComponentPart.addStoreInElementOptions(storeInElementOptions);
        return self();
    }

    @Override
    public S setStoreInElementOptions(String storeInElementOptions) {
        baseComponentPart.setStoreInElementOptions(storeInElementOptions);
        return self();
    }

    @Override
    public S removeStoreInElementOptions(String storeInElementOptions) {
        baseComponentPart.removeStoreInElementOptions(storeInElementOptions);
        return self();
    }

    @Override
    public boolean hasStoreInElementOptions(String storeInElementOptions) {
        return baseComponentPart.hasStoreInElementOptions(storeInElementOptions);
    }

    @Override
    public S setRehydration(String rehydration, Boolean canFail) {
        this.baseComponentPart.setRehydration(rehydration, canFail);
        return self();
    }

    @Override
    public S setRehydration(String selector, CoreComponent parent) {
        this.baseComponentPart.setRehydration(selector, parent);
        return self();
    }

    @Override
    public S setRehydration(String selector, CoreComponent parent, Boolean canFail) {
        this.baseComponentPart.setRehydration(selector, parent, canFail);
        return self();
    }

    public boolean isRehydrated() {
        if (baseComponentPart == null)
            return false;

        return baseComponentPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return baseComponentPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        baseComponentPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return baseComponentPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        baseComponentPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        baseComponentPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        baseComponentPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        baseComponentPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return baseComponentPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return baseComponentPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        baseComponentPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return baseComponentPart.getData(data);
    }

    public boolean hasData(String data) {
        return baseComponentPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        baseComponentPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return baseComponentPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return baseComponentPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return baseComponentPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return baseComponentPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return baseComponentPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return baseComponentPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return baseComponentPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        baseComponentPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return baseComponentPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return baseComponentPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return baseComponentPart.hasWrapper();
    }

    public boolean isInitialized() {
        return baseComponentPart.isInitialized();
    }

    public void log(Object obj) {
        baseComponentPart.log(obj);
    }

    public void removeFromParent() {
        baseComponentPart.removeFromParent();
    }

    @Override
    public WebComponentFactory getComponentFactory() {
        return ((WebComponentFactory) (baseComponentPart.getComponentFactory()));
    }

    @Override
    public RootComponent getRootComponent() {
        return baseComponentPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.baseComponentPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return baseComponentPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.baseComponentPart.setTheme(theme);
        return self();
    }

    @Override
    public void addPart(ComponentPart.Type type, ComponentPart part) {
        baseComponentPart.addPart(type, part);
    }

    @Override
    public <C extends ComponentType<?, T>, T extends CoreComponentOptions> void initialize(C component, T options) {
        setupReferences();
        baseComponentPart.initialize(component, options);
    }

    @Override
    public WebBasicInputField getComponent() {
        return ((WebBasicInputField) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        setupReferences();
        return true;
    }

    public void onInitialize(O options) {
        super.onInitialize(options);
    }

    public void onCreate(O options) {
        super.onCreate(options);
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        super.onInitializeComponentType(rootComponent);
        baseComponentPart.onInitializeComponentType(rootComponent);
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
    }

    @Override
    public S setValidator(InputValidator validator) {
        setValidators(new ArrayList<InputValidator>(Arrays.asList(validator)));
        return self();
    }
}