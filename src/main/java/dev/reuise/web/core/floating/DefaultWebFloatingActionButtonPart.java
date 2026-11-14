package dev.reuise.web.core.floating;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.button.ButtonType;
import dev.reuise.core.floating.DefaultCoreFloatingActionButtonPart;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.button.WebButtonPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebInlineText;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
// Option: UseHistoryApi - WEB
// Option: Loading - CORE
// Option: SkeletonOptions - CORE
// Option: Label - CORE
// Option: Size - CORE
// Option: Type - CORE
// Option: Url - CORE
// Option: Target - CORE
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
// Option: LocaleContext - CORE
// Option: LinkUrlResolver - CORE
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: button
// add composition for button: isType
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
public abstract class DefaultWebFloatingActionButtonPart<S extends DefaultWebFloatingActionButtonPart<S, O>, O extends WebFloatingActionButtonPartOptions> extends DefaultCoreFloatingActionButtonPart<S, O> implements WebComponentPart , WebFloatingActionButton {
    @Override
    public S setAccessibleLabel(String accessibleLabel) {
        super.setAccessibleLabel(FloatingPresentation.label(accessibleLabel));
        setData("accessiblelabel", getAccessibleLabel());
        setAttribute("aria-label", getAccessibleLabel());
        return self();
    }

    @Override
    public S setUnreadCount(Integer unreadCount) {
        super.setUnreadCount(FloatingPresentation.unread(unreadCount));
        setData("unreadcount", Integer.toString(getUnreadCount()));
        if (getBadge() != null) {
            getBadge().setText(FloatingPresentation.badge(unreadCount));
            if (getUnreadCount() == 0)
                getBadge().setAttribute("hidden", "");
            else
                getBadge().removeAttribute("hidden");

        }
        return self();
    }

    @Override
    public S setCorner(String corner) {
        super.setCorner(FloatingPresentation.corner(corner));
        setData("corner", getCorner());
        return self();
    }

    private WebButtonPart buttonPart;

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebFloatingActionButtonPart(O options) {
        super(options);
    }

    protected void setupReferences() {
        // Parts
        buttonPart = getButtonPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        super.setupReferences();
    }

    @Override
    public boolean isUseHistoryApi() {
        return buttonPart.isUseHistoryApi();
    }

    @Override
    public S setUseHistoryApi(Boolean useHistoryApi) {
        this.buttonPart.setUseHistoryApi(useHistoryApi);
        return self();
    }

    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        this.buttonPart.setUrl(url, useHistoryApi);
        return self();
    }

    public boolean isType(ButtonType type) {
        return buttonPart.isType(type);
    }

    @Override
    public RootComponent getRootComponent() {
        return buttonPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.buttonPart.setRootComponent(rootComponent);
        if (badge != null)
            badge.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return buttonPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (badge != null)
            badge.setTheme(theme);

        this.buttonPart.setTheme(theme);
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
    public S clearStyleClasses() {
        baseComponentPart.clearStyleClasses();
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
        if (buttonPart == null)
            return false;

        return buttonPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return buttonPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        buttonPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return buttonPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        buttonPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        buttonPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        buttonPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        buttonPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return buttonPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return buttonPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        buttonPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return buttonPart.getData(data);
    }

    public boolean hasData(String data) {
        return buttonPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        buttonPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return buttonPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return buttonPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return buttonPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return buttonPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return buttonPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return buttonPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return buttonPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        buttonPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return buttonPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return buttonPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return buttonPart.hasWrapper();
    }

    public boolean isInitialized() {
        return buttonPart.isInitialized();
    }

    public void log(Object obj) {
        buttonPart.log(obj);
    }

    public void removeFromParent() {
        buttonPart.removeFromParent();
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
    public WebFloatingActionButton getComponent() {
        return ((WebFloatingActionButton) (baseComponentPart.getComponent()));
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
        setAttribute("type", "button");
        if ((getBadge().getId() == null) || getBadge().getId().isEmpty())
            getBadge().setId(getBadge().getUniqueId());

        setAttribute("aria-describedby", getBadge().getId());
        setAccessibleLabel(options.getAccessibleLabel());
        setUnreadCount(options.getUnreadCount());
        setCorner(options.getCorner());
    }

    public void onCreate(O options) {
        super.onCreate(options);
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        super.onInitializeComponentType(rootComponent);
        buttonPart.onInitializeComponentType(rootComponent);
    }

    @Override
    public WebInlineText getBadge() {
        return ((WebInlineText) (super.getBadge()));
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        FloatingStyles.initialize(commonStyles);
    }
}
