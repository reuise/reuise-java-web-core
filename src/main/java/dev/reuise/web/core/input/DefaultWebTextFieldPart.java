package dev.reuise.web.core.input;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.input.DefaultCoreTextFieldPart;
import dev.reuise.core.input.TextFieldSize;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.icon.WebIcon;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebInlineText;
import dev.reuise.web.core.text.WebLabel;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
// Option: Children - CORE
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
// base comp: parentComponent
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
public abstract class DefaultWebTextFieldPart<S extends DefaultWebTextFieldPart<S, O>, O extends WebTextFieldPartOptions> extends DefaultCoreTextFieldPart<S, O> implements WebTextField , WebComponentPart {
    @Override
    public S setSize(TextFieldSize size) {
        if (size == null) {
            removeSizeStyleClass();
            return self();
        }
        for (TextFieldSize s : TextFieldSize.values()) {
            addOrRemoveStyleClass(createSizeStyleClassName(s), size == s);
        }
        return self();
    }

    @Override
    public TextFieldSize getSize() {
        for (TextFieldSize s : TextFieldSize.values()) {
            if (hasStyleClass(createSizeStyleClassName(s)))
                return s;

        }
        return null;
    }

    private void removeSizeStyleClass() {
        for (TextFieldSize s : TextFieldSize.values())
            removeStyleClass(createSizeStyleClassName(s));

    }

    private String createSizeStyleClassName(TextFieldSize size) {
        return (getBaseStyleClass() + "--") + size.getShortName();
    }

    @Override
    public boolean isError() {
        return hasStyleClass(getBaseStyleClass() + "--error");
    }

    @Override
    public S setError(Boolean error) {
        this.input.setError(error);
        addOrRemoveStyleClass(getBaseStyleClass() + "--error", error);
        return self();
    }

    @Override
    public S setError(String message) {
        setError(message != null);
        setSupportingText(message);
        return self();
    }

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebTextFieldPart(O options) {
        super(options);
    }

    protected void setupReferences() {
        // Parts
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        super.setupReferences();
    }

    @Override
    public RootComponent getRootComponent() {
        return parentComponentPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.parentComponentPart.setRootComponent(rootComponent);
        if (labelContainer != null)
            labelContainer.setRootComponent(rootComponent);

        if (inputContainer != null)
            inputContainer.setRootComponent(rootComponent);

        if (startIcon != null)
            startIcon.setRootComponent(rootComponent);

        if (input != null)
            input.setRootComponent(rootComponent);

        if (endIcon != null)
            endIcon.setRootComponent(rootComponent);

        if (supportingTextContainer != null)
            supportingTextContainer.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return parentComponentPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (labelContainer != null)
            labelContainer.setTheme(theme);

        if (inputContainer != null)
            inputContainer.setTheme(theme);

        if (startIcon != null)
            startIcon.setTheme(theme);

        if (input != null)
            input.setTheme(theme);

        if (endIcon != null)
            endIcon.setTheme(theme);

        if (supportingTextContainer != null)
            supportingTextContainer.setTheme(theme);

        this.parentComponentPart.setTheme(theme);
        return self();
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
        if (parentComponentPart == null)
            return false;

        return parentComponentPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return parentComponentPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        parentComponentPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return parentComponentPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        parentComponentPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        parentComponentPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        parentComponentPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        parentComponentPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return parentComponentPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return parentComponentPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        parentComponentPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return parentComponentPart.getData(data);
    }

    public boolean hasData(String data) {
        return parentComponentPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        parentComponentPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return parentComponentPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return parentComponentPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return parentComponentPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return parentComponentPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return parentComponentPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return parentComponentPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return parentComponentPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        parentComponentPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return parentComponentPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return parentComponentPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return parentComponentPart.hasWrapper();
    }

    public boolean isInitialized() {
        return parentComponentPart.isInitialized();
    }

    public void log(Object obj) {
        parentComponentPart.log(obj);
    }

    public void removeFromParent() {
        parentComponentPart.removeFromParent();
    }

    @Override
    public WebComponentFactory getComponentFactory() {
        return ((WebComponentFactory) (baseComponentPart.getComponentFactory()));
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
    public WebTextField getComponent() {
        return ((WebTextField) (baseComponentPart.getComponent()));
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

    // Implementation
    // Implementation
    public void onCreate(O options) {
        super.onCreate(options);
        if (this.input != null) {
            WebBasicInputField webInput = ((WebBasicInputField) (this.input));
            webInput.setId(webInput.getUniqueId());
        }
        if (!isRehydrated()) {
            addOrRemoveStyleClass(getBaseStyleClass() + "--withstarticon", this.startIcon != null);
            addOrRemoveStyleClass(getBaseStyleClass() + "--withendicon", this.endIcon != null);
        }
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        super.onInitializeComponentType(rootComponent);
        parentComponentPart.onInitializeComponentType(rootComponent);
    }

    @Override
    public WebLabel getLabelContainer() {
        return ((WebLabel) (super.getLabelContainer()));
    }

    @Override
    public WebContainer getInputContainer() {
        return ((WebContainer) (super.getInputContainer()));
    }

    @Override
    public WebIcon getStartIcon() {
        return ((WebIcon) (super.getStartIcon()));
    }

    @Override
    public WebBasicInputField getInput() {
        return ((WebBasicInputField) (super.getInput()));
    }

    @Override
    public WebIcon getEndIcon() {
        return ((WebIcon) (super.getEndIcon()));
    }

    @Override
    public WebInlineText getSupportingTextContainer() {
        return ((WebInlineText) (super.getSupportingTextContainer()));
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        commonStyles.addRule(".reuise-textfield").setWidth("100%").setDisplay("flex").setFlexDirection("column");
        commonStyles.addRule(".reuise-textfield_inputcontainer").setDisplay("flex").setPosition("relative").setHeight("inherit").setFlexDirection("row").setBoxSizing("border-box").setBorder("none").setBackground("rgb(0 0 0 / 6%)").setAlignItems("center").setCursor("text").setOverflow("hidden");
        commonStyles.addRule(".reuise-textfield_inputcontainer:focus-within").setOutlineWidth("1px").setOutlineStyle("solid").setOutlineOffset("-1px");
        commonStyles.addRule(".reuise-textfield_input").setFlex("1 1 auto").setBorder("none").setHeight("inherit").setOverflow("auto").setBackgroundColor("transparent");
        commonStyles.addRule("textarea.reuise-textfield_input").setFontFamily("inherit");
        commonStyles.addRule(".reuise-textfield--withstarticon .reuise-textfield_input").setPaddingLeft(40);
        commonStyles.addRule(".reuise-textfield--withendicon .reuise-textfield_input").setPaddingRight(40);
        commonStyles.addRule(".reuise-textfield_input:focus-visible").setOutline("none");
        commonStyles.addRule(".reuise-textfield_label").setPadding("0 0 4px 8px").setFontSize(14);
        commonStyles.addRule(".reuise-textfield>reuise-textfield_inputcontainer>.reuise-icon").setPosition("absolute").setFlex("0 0 min-content").setOverflow("hidden").setPointerEvents("none");
        commonStyles.addRule(".reuise-textfield>reuise-textfield_inputcontainer>.reuise-icon svg:empty").setDisplay("none");
        commonStyles.addRule(".reuise-textfield_starticon").setPosition("absolute").setPadding("0 8px 0 16px");
        commonStyles.addRule(".reuise-textfield_endicon").setPosition("absolute").setRight(0).setPadding("0 16px 0 8px");
        commonStyles.addRule(".reuise-textfield--error .reuise-textfield_label, .reuise-textfield--error .reuise-textfield_supportingtext").setColor("#B3261E");
        commonStyles.addRule(".reuise-textfield_supportingtext").setDisplay("flex").setPadding("4px 16px 0px 16px").setFontSize(12).setLineHeight(16).setFontWeight("400");
        /* commonStyles.addRule(".reuise-textfield:has()")
        .setWidth("100%")
        .setDisplay("flex")
        .setFlexDirection("column");
         */
        for (TextFieldSize s : TextFieldSize.values()) {
            commonStyles.addRule(("." + createSizeStyleClassName(s)) + " .reuise-textfield_inputcontainer").setBorderRadius(s.getRadius());
            commonStyles.addRule(("." + createSizeStyleClassName(s)) + " .reuise-textfield_input").setLineHeight(s.getLineHeight()).setFontSize(s.getFontSize()).setPaddingTop(s.getPaddingY()).setPaddingRight(s.getPaddingX()).setPaddingBottom(s.getPaddingY()).setPaddingLeft(s.getPaddingX());
            commonStyles.addRule(("." + createSizeStyleClassName(s)) + ":has(.reuise-textfield_starticon) .reuise-textfield_input").setPaddingLeft(((s.getPaddingX() + s.getIconSize()) + 8) + "px", true);
            commonStyles.addRule(((("." + createSizeStyleClassName(s)) + " .reuise-textfield_starticon,.") + createSizeStyleClassName(s)) + " .reuise-textfield_endicon").setWidth(s.getIconSize()).setHeight(s.getIconSize());
        }
        // commonStyles.addRule(".r.reuise-textfield_inputcontainer:has(input:is(:-webkit-autofill,
        // :autofill))");
    }
}