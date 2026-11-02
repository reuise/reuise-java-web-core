package dev.reuise.web.core.currencyselector;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.currencyselector.Currencies;
import dev.reuise.core.currencyselector.Currency;
import dev.reuise.core.currencyselector.DefaultCoreCurrencySelectorPart;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.list.WebListItem;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.selectmenu.WebSelectMenuPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
// Option: Items - CORE
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
// base comp: selectMenu
// add composition for selectMenu: addItem
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
public abstract class DefaultWebCurrencySelectorPart<S extends DefaultWebCurrencySelectorPart<S, O>, O extends WebCurrencySelectorPartOptions> extends DefaultCoreCurrencySelectorPart<S, O> implements WebCurrencySelector , WebComponentPart {
    private WebSelectMenuPart selectMenuPart;

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebCurrencySelectorPart(O options) {
        super(options);
    }

    protected void setupReferences() {
        // Parts
        selectMenuPart = getSelectMenuPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        super.setupReferences();
    }

    public S addItem(WebListItem item) {
        selectMenuPart.addItem(item);
        return self();
    }

    public S addItem(String text) {
        selectMenuPart.addItem(text);
        return self();
    }

    @Override
    public RootComponent getRootComponent() {
        return selectMenuPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.selectMenuPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return selectMenuPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.selectMenuPart.setTheme(theme);
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
        if (selectMenuPart == null)
            return false;

        return selectMenuPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return selectMenuPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        selectMenuPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return selectMenuPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        selectMenuPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        selectMenuPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        selectMenuPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        selectMenuPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return selectMenuPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return selectMenuPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        selectMenuPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return selectMenuPart.getData(data);
    }

    public boolean hasData(String data) {
        return selectMenuPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        selectMenuPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return selectMenuPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return selectMenuPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return selectMenuPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return selectMenuPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return selectMenuPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return selectMenuPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return selectMenuPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        selectMenuPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return selectMenuPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return selectMenuPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return selectMenuPart.hasWrapper();
    }

    public boolean isInitialized() {
        return selectMenuPart.isInitialized();
    }

    public void log(Object obj) {
        selectMenuPart.log(obj);
    }

    public void removeFromParent() {
        selectMenuPart.removeFromParent();
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
    public WebCurrencySelector getComponent() {
        return ((WebCurrencySelector) (baseComponentPart.getComponent()));
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
        if (!isRehydrated()) {
            List<Currency> shown = new ArrayList<>();
            List<String> codes = options.getCurrencies();
            if ((codes == null) || codes.isEmpty()) {
                shown.addAll(Currencies.getAll());
            } else {
                for (String code : codes) {
                    Currency currency = Currencies.getByCode(code);
                    if (currency != null)
                        shown.add(currency);

                }
            }
            List<String> suggested = options.getSuggestedCurrencies();
            if (suggested != null) {
                List<Currency> first = new ArrayList<>();
                for (String code : suggested) {
                    Currency currency = Currencies.getByCode(code);
                    if ((currency != null) && shown.remove(currency))
                        first.add(currency);

                }
                shown.addAll(0, first);
            }
            for (Currency currency : shown)
                addItem(currency.getLabel());

        }
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        super.onInitializeComponentType(rootComponent);
        selectMenuPart.onInitializeComponentType(rootComponent);
    }

    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
    }

    @Override
    public S setCurrency(String currency) {
        setCurrencies(new ArrayList<String>(Arrays.asList(currency)));
        return self();
    }

    @Override
    public S setSuggestedCurrency(String suggestedCurrency) {
        setSuggestedCurrencies(new ArrayList<String>(Arrays.asList(suggestedCurrency)));
        return self();
    }
}
