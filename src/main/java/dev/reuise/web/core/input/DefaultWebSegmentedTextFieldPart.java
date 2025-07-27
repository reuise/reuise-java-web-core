package dev.reuise.web.core.input;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Html;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.input.DefaultCoreSegmentedTextFieldPart;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.layout.WebContainerPart;
import dev.reuise.web.core.layout.WebFlexContainerPart;
import dev.reuise.web.core.layout.WebRowLayoutPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
// Option: Direction - CORE
// Option: JustifyContent - CORE
// Option: AlignItems - CORE
// Option: ColumnGap - CORE
// Option: RowGap - CORE
// Option: Gap - CORE
// Option: Wrap - CORE
// Option: Padding - CORE
// Option: PaddingTop - CORE
// Option: PaddingRight - CORE
// Option: PaddingBottom - CORE
// Option: PaddingLeft - CORE
// Option: Position - CORE
// Option: Inset - CORE
// Option: BackdropFilter - CORE
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
// base comp: rowLayout
// base comp: flexContainer
// base comp: container
// add composition for container: addHeading
// add composition for container: addDivider
// add composition for container: addParagraph
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
public abstract class DefaultWebSegmentedTextFieldPart<S extends DefaultWebSegmentedTextFieldPart<S, O>, O extends WebSegmentedTextFieldPartOptions> extends DefaultCoreSegmentedTextFieldPart<S, O> implements WebComponentPart , WebSegmentedTextField {
    private WebRowLayoutPart rowLayoutPart;

    private WebFlexContainerPart flexContainerPart;

    private WebContainerPart containerPart;

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebSegmentedTextFieldPart(O options) {
        super(options);
    }

    protected void setupReferences() {
        // Parts
        rowLayoutPart = getRowLayoutPart();
        flexContainerPart = getFlexContainerPart();
        containerPart = getContainerPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        super.setupReferences();
    }

    @Override
    public RootComponent getRootComponent() {
        return rowLayoutPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        this.rowLayoutPart.setRootComponent(rootComponent);
    }

    @Override
    public Theme getTheme() {
        return rowLayoutPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        this.rowLayoutPart.setTheme(theme);
        return self();
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S addHeading(int level, String text) {
        rowLayoutPart.addHeading(level, text);
        return self();
    }

    public S addHeading(String text) {
        rowLayoutPart.addHeading(text);
        return self();
    }

    public S addHeading(int level, Html html) {
        rowLayoutPart.addHeading(level, html);
        return self();
    }

    public S addHeading(Html html) {
        rowLayoutPart.addHeading(html);
        return self();
    }

    public S addDivider() {
        rowLayoutPart.addDivider();
        return self();
    }

    public S addDivider(String label) {
        rowLayoutPart.addDivider(label);
        return self();
    }

    public S addParagraph(String text) {
        rowLayoutPart.addParagraph(text);
        return self();
    }

    public S addParagraph(Html html) {
        rowLayoutPart.addParagraph(html);
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
        if (rowLayoutPart == null)
            return false;

        return rowLayoutPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return rowLayoutPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        rowLayoutPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return rowLayoutPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        rowLayoutPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        rowLayoutPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        rowLayoutPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        rowLayoutPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return rowLayoutPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return rowLayoutPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        rowLayoutPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return rowLayoutPart.getData(data);
    }

    public boolean hasData(String data) {
        return rowLayoutPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        rowLayoutPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return rowLayoutPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return rowLayoutPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return rowLayoutPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return rowLayoutPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return rowLayoutPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return rowLayoutPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return rowLayoutPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        rowLayoutPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return rowLayoutPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return rowLayoutPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return rowLayoutPart.hasWrapper();
    }

    public boolean isInitialized() {
        return rowLayoutPart.isInitialized();
    }

    public void log(Object obj) {
        rowLayoutPart.log(obj);
    }

    public void removeFromParent() {
        rowLayoutPart.removeFromParent();
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
    public WebSegmentedTextField getComponent() {
        return ((WebSegmentedTextField) (baseComponentPart.getComponent()));
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
        rowLayoutPart.onInitializeComponentType(rootComponent);
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        commonStyles.addRule(".reuise-segmentedtextfield").setWidth("100%").setJustifyContent("space-evenly");
    }
}