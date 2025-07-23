package dev.reuise.web.core.topappbar;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.core.topappbar.DefaultCoreTopAppBarPart;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.button.WebIconButton;
import dev.reuise.web.core.graphics.svg.WebSvg;
import dev.reuise.web.core.graphics.svg.WebSvgPath;
import dev.reuise.web.core.graphics.svg.WebSvgPathOptions;
import dev.reuise.web.core.icon.WebIcon;
import dev.reuise.web.core.image.WebImage;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
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
public abstract class DefaultWebTopAppBarPart<S extends DefaultWebTopAppBarPart<S, O>, O extends WebTopAppBarPartOptions> extends DefaultCoreTopAppBarPart<S, O> implements WebComponentPart , WebTopAppBar {
    @Override
    public S setFixed(Boolean fixed) {
        this.fixed.put(null, fixed);
        addOrRemoveStyleClass("reuise-top-app-bar--fixed", fixed);
        return self();
    }

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebTopAppBarPart(O options) {
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

        if (navigationButton != null)
            navigationButton.setRootComponent(rootComponent);

        if (titleContainer != null)
            titleContainer.setRootComponent(rootComponent);

        if (actionsContainer != null)
            actionsContainer.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return parentComponentPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (container != null)
            container.setTheme(theme);

        if (navigationButton != null)
            navigationButton.setTheme(theme);

        if (titleContainer != null)
            titleContainer.setTheme(theme);

        if (actionsContainer != null)
            actionsContainer.setTheme(theme);

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
    public WebTopAppBar getComponent() {
        return ((WebTopAppBar) (baseComponentPart.getComponent()));
    }

    // Implementation
    // Implementation
    // Implementation
    public boolean onPreInitialize(O options) {
        if (!super.onPreInitialize(options))
            return false;

        if ((!isRehydrated()) && (this.navigationButton != null)) {
            WebIconButton webNavigationButton = ((WebIconButton) (this.navigationButton));
            WebIcon icon = webNavigationButton.getIcon();
            if (icon != null) {
                WebSvg svg = icon.getSvg();
                WebImage img = icon.getImage();
                if ((svg != null) && (img == null)) {
                    WebSvgPathOptions svgPathOpts = getComponentFactory().createSvgPathOptions();
                    svgPathOpts.setPath("M3 18h18v-2H3v2zm0-5h18v-2H3v2zm0-7v2h18V6H3z");
                    WebSvgPath svgPath = getComponentFactory().createSvgPath(svgPathOpts);
                    svgPath.setAttribute("fill", "currentColor");
                    svg.add(svgPath);
                }
            }
        }
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
        parentComponentPart.onInitializeComponentType(rootComponent);
    }

    @Override
    public WebContainer getContainer() {
        return ((WebContainer) (super.getContainer()));
    }

    @Override
    public WebIconButton getNavigationButton() {
        return ((WebIconButton) (super.getNavigationButton()));
    }

    @Override
    public WebContainer getTitleContainer() {
        return ((WebContainer) (super.getTitleContainer()));
    }

    @Override
    public WebContainer getActionsContainer() {
        return ((WebContainer) (super.getActionsContainer()));
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        commonStyles.addRule(".reuise-top-app-bar").setBoxSizing("border-box").setPadding("0 16px");
        commonStyles.addRule(".reuise-top-app-bar:has(.reuise-top-app-bar_navigationbutton)").setPadding("0 16px 0 8px");
        commonStyles.addRule(".reuise-top-app-bar--fixed").setPosition("fixed").setTop("0").setRight("0").setLeft("0").setZIndex(9999);
        commonStyles.addRule(".reuise-top-app-bar_container").setDisplay("flex").setFlexWrap("nowrap").setColumnGap(8).setWidth("100%").setJustifyContent("space-between").setAlignItems("stretch");
        commonStyles.addRule(".reuise-top-app-bar_titlecontainer,.reuise-top-app-bar_actionscontainer").setDisplay("flex").setFlexWrap("nowrap").setColumnGap(8).setFlexDirection("row").setAlignItems("center");
        commonStyles.addRule(".reuise-top-app-bar_titlecontainer:empty,.reuise-top-app-bar_actionscontainer:empty").setDisplay("none");
        commonStyles.addRule(".reuise-top-app-bar_actionscontainer").setFlex("1 1 auto").setJustifyContent("start").setMarginLeft(8);
        commonStyles.addRule(".reuise-top-app-bar_actionscontainer").setFlex("0 1 auto").setJustifyContent("end");
        commonStyles.addRule(".reuise-top-app-bar_navigationbutton").setWidth(24).setHeight(24).setAlignSelf("center").setBorder("none").setBorderRadius("50%").setBackgroundColor("transparent").setPadding(9).setBoxSizing("content-box", true).setCursor("pointer");
        commonStyles.addRule(".reuise-top-app-bar_navigationbutton:hover").setBackgroundColor("#3c404314");
        commonStyles.addRule(".reuise-top-app-bar_navigationbutton path").setColor("#5f6368");
    }

    @Override
    public S setFixedAllStates(Boolean fixed) {
        setFixed(ScreenSizeValues.of(fixed, fixed));
        setFixed(fixed);
        return self();
    }

    @Override
    public S setHasNavigationButtonAllStates(Boolean hasNavigationButton) {
        setHasNavigationButton(ScreenSizeValues.of(hasNavigationButton, hasNavigationButton));
        setHasNavigationButton(hasNavigationButton);
        return self();
    }
}