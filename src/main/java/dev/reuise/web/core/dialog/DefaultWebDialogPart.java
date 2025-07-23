package dev.reuise.web.core.dialog;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.dialog.DefaultCoreDialogPart;
import dev.reuise.core.dialog.DialogSize;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.ComponentTheme;
import dev.reuise.core.theme.Theme;
import dev.reuise.core.theme.ThemeColorSet;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebFlexContainer;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebHeading;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheet;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.ArrayList;
import java.util.Arrays;
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
public abstract class DefaultWebDialogPart<S extends DefaultWebDialogPart<S, O>, O extends WebDialogPartOptions> extends DefaultCoreDialogPart<S, O> implements WebDialog , WebComponentPart {
    @Override
    public void open() {
        addStyleClass("reuise-dialog--opened");
    }

    @Override
    public void close() {
        removeStyleClass("reuise-dialog--opened");
        if (Boolean.TRUE.equals(this.removeOnClose))
            removeFromParent();

    }

    @Override
    public DialogSize getSize() {
        return null;
    }

    @Override
    public S setSize(DialogSize size) {
        return setSize(size, null);
    }

    @Override
    public S setSize(DialogSize size, State state) {
        if (size == null)
            return self();

        Style containerStyle = ((WebContainer) (this.container)).getStyle(state);
        if (containerStyle == null)
            self();

        if (size == DialogSize.FULL_SCREEN) {
            containerStyle.setWidth("100vw").setHeight("100vh");
        } else {
            containerStyle.setWidth("100vw").setMaxWidth(size.getWidth());
        }
        return self();
    }

    @Override
    public DialogSize getSize(State state) {
        return null;
    }

    @Override
    public boolean isModal() {
        String modal = getAria("modal");
        return (modal != null) && Boolean.parseBoolean(modal);
    }

    @Override
    public S setModal(Boolean modal) {
        setAria("modal", Boolean.toString(modal));
        return self();
    }

    @Override
    public void shake() {
        getContainer().addStyleClass(getBaseStyleClass() + "--shaking");
    }

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebDialogPart(O options) {
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
        if (container != null)
            container.setRootComponent(rootComponent);

        if (header != null)
            header.setRootComponent(rootComponent);

        if (titleHeading != null)
            titleHeading.setRootComponent(rootComponent);

        if (body != null)
            body.setRootComponent(rootComponent);

        if (footer != null)
            footer.setRootComponent(rootComponent);

        if (scrim != null)
            scrim.setRootComponent(rootComponent);

        if (acceptButton != null)
            acceptButton.setRootComponent(rootComponent);

        if (cancelButton != null)
            cancelButton.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return parentComponentPart.getTheme();
    }

    // Implementation
    @Override
    public S setTheme(Theme theme) {
        this.parentComponentPart.setTheme(theme);
        if (theme == null)
            return self();

        ComponentTheme dialogTheme = theme.getDialogTheme();
        if (dialogTheme != null) {
            ThemeColorSet backgroundColor = dialogTheme.getBackgroundColor();
            if (backgroundColor != null) {
                getContainer().getStyle().setBackground(backgroundColor.getNormal().toHex());
            }
            int cornerRadius = dialogTheme.getCornerRadius();
            if (cornerRadius != 0) {
                getContainer().getStyle().setBorderRadius(cornerRadius + "px");
            }
        }
        super.setTheme(theme);
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
    public WebDialog getComponent() {
        return ((WebDialog) (baseComponentPart.getComponent()));
    }

    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        setupReferences();
        return true;
    }

    // Implementation
    // Implementation
    // Implementation
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
        parentComponentPart.onInitializeComponentType(rootComponent);
    }

    @Override
    public WebContainer getContainer() {
        return ((WebContainer) (super.getContainer()));
    }

    @Override
    public WebContainer getHeader() {
        return ((WebContainer) (super.getHeader()));
    }

    @Override
    public WebHeading getTitleHeading() {
        return ((WebHeading) (super.getTitleHeading()));
    }

    @Override
    public WebFlexContainer getBody() {
        return ((WebFlexContainer) (super.getBody()));
    }

    @Override
    public WebFlexContainer getFooter() {
        return ((WebFlexContainer) (super.getFooter()));
    }

    @Override
    public WebContainer getScrim() {
        return ((WebContainer) (super.getScrim()));
    }

    @Override
    public WebButton getAcceptButton() {
        return ((WebButton) (super.getAcceptButton()));
    }

    @Override
    public WebButton getCancelButton() {
        return ((WebButton) (super.getCancelButton()));
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        commonStyles.addRule(".reuise-dialog").setPosition("fixed").setTop("0").setLeft("0").setRight("0").setBottom("0").setJustifyContent("center").setAlignItems("center").setZIndex(999999);
        commonStyles.addRule(".reuise-dialog:not(.reuise-dialog--opened)").setDisplay("none");
        commonStyles.addRule(".reuise-dialog--opened").setDisplay("flex");
        commonStyles.addRule(".reuise-dialog_container").setPosition("absolute").setBackgroundColor("white").setBorderRadius("28px").setZIndex(1);
        commonStyles.addRule(".reuise-dialog_header").setPadding("24px 24px 16px");
        commonStyles.addRule(".reuise-dialog_body").setBoxSizing("border-box").setPadding("0 24px 24px");
        commonStyles.addRule(".reuise-dialog_footer").setDisplay("flex").setJustifyContent("end").setPadding("0 24px 24px");
        commonStyles.addRule(".reuise-dialog_scrim").setPosition("absolute").setTop("0").setLeft("0").setRight("0").setBottom("0").setBackgroundColor("rgb(0 0 0 / 50%)").setCursor("pointer");
        commonStyles.addRule(".reuise-dialog--shaking").setAnimation("reuise-dialog_shakeanimation 0.3s ease");
        StyleSheet keyframes = commonStyles.addAtRule("keyframes reuise-dialog_shakeanimation");
        keyframes.addRule("0%").setTransform("translateX(0)");
        keyframes.addRule("20%").setTransform("translateX(-8px)");
        keyframes.addRule("40%").setTransform("translateX(8px)");
        keyframes.addRule("60%").setTransform("translateX(-6px)");
        keyframes.addRule("80%").setTransform("translateX(6px)");
        keyframes.addRule("100%").setTransform("translateX(0)");
    }

    @Override
    public S setSizeAllStates(DialogSize size) {
        setSize(ScreenSizeValues.of(size, size));
        setSize(size);
        return self();
    }

    @Override
    public S setAction(CoreButton action) {
        setActions(new ArrayList<CoreButton>(Arrays.asList(action)));
        return self();
    }
}