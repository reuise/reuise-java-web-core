package dev.reuise.web.core.card;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Html;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.button.CoreButton;
import dev.reuise.core.card.CardOrientation;
import dev.reuise.core.card.DefaultCoreCardPart;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.image.WebImage;
import dev.reuise.web.core.layout.WebContainerPart;
import dev.reuise.web.core.layout.WebFlexContainer;
import dev.reuise.web.core.layout.WebFlexContainerPart;
import dev.reuise.web.core.layout.WebSurfacePart;
import dev.reuise.web.core.link.WebLink;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebTextBlock;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
// Option: Type - CORE
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
// base comp: surface
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
public abstract class DefaultWebCardPart<S extends DefaultWebCardPart<S, O>, O extends WebCardPartOptions> extends DefaultCoreCardPart<S, O> implements WebCard , WebComponentPart {
    @Override
    public S setOrientation(CardOrientation orientation) {
        if (orientation == null) {
            removeOrientationStyleClass();
            return self();
        }
        for (CardOrientation o : CardOrientation.values()) {
            addOrRemoveStyleClass(createOrientationStyleClassName(o), orientation == o);
        }
        return self();
    }

    @Override
    public CardOrientation getOrientation() {
        for (CardOrientation o : CardOrientation.values()) {
            if (hasStyleClass(createOrientationStyleClassName(o)))
                return o;

        }
        return null;
    }

    private void removeOrientationStyleClass() {
        for (CardOrientation o : CardOrientation.values())
            removeStyleClass(createOrientationStyleClassName(o));

    }

    private String createOrientationStyleClassName(CardOrientation orientation) {
        return (getBaseStyleClass() + "--") + orientation.name().toLowerCase();
    }

    @Override
    public S setUrl(String url, Boolean useHistoryApi) {
        if (this.mediaLink != null)
            ((WebLink) (this.mediaLink)).setUrl(url, useHistoryApi);

        if (this.headingLink != null)
            ((WebLink) (this.headingLink)).setUrl(url, useHistoryApi);

        return self();
    }

    public S setImageAltText(String imageAltText) {
        if (this.image != null) {
            WebImage webImage = ((WebImage) (this.image));
            webImage.setAltText(imageAltText);
        }
        return self();
    }

    public String getImageAltText() {
        if (this.image == null)
            return null;

        WebImage webImage = ((WebImage) (this.image));
        return webImage.getAltText();
    }

    private WebSurfacePart surfacePart;

    private WebFlexContainerPart flexContainerPart;

    private WebContainerPart containerPart;

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebCardPart(O options) {
        super(options);
    }

    protected void setupReferences() {
        // Parts
        surfacePart = getSurfacePart();
        flexContainerPart = getFlexContainerPart();
        containerPart = getContainerPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        super.setupReferences();
    }

    @Override
    public RootComponent getRootComponent() {
        return surfacePart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.surfacePart.setRootComponent(rootComponent);
        if (mediaLink != null)
            mediaLink.setRootComponent(rootComponent);

        if (mediaContainer != null)
            mediaContainer.setRootComponent(rootComponent);

        if (image != null)
            image.setRootComponent(rootComponent);

        if (textContent != null)
            textContent.setRootComponent(rootComponent);

        if (headline != null)
            headline.setRootComponent(rootComponent);

        if (headingLink != null)
            headingLink.setRootComponent(rootComponent);

        if (headingContainer != null)
            headingContainer.setRootComponent(rootComponent);

        if (subHeadingContainer != null)
            subHeadingContainer.setRootComponent(rootComponent);

        if (textContainer != null)
            textContainer.setRootComponent(rootComponent);

        if (actionsContainer != null)
            actionsContainer.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return surfacePart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (mediaLink != null)
            mediaLink.setTheme(theme);

        if (mediaContainer != null)
            mediaContainer.setTheme(theme);

        if (image != null)
            image.setTheme(theme);

        if (textContent != null)
            textContent.setTheme(theme);

        if (headline != null)
            headline.setTheme(theme);

        if (headingLink != null)
            headingLink.setTheme(theme);

        if (headingContainer != null)
            headingContainer.setTheme(theme);

        if (subHeadingContainer != null)
            subHeadingContainer.setTheme(theme);

        if (textContainer != null)
            textContainer.setTheme(theme);

        if (actionsContainer != null)
            actionsContainer.setTheme(theme);

        this.surfacePart.setTheme(theme);
        return self();
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S addHeading(int level, String text) {
        surfacePart.addHeading(level, text);
        return self();
    }

    public S addHeading(String text) {
        surfacePart.addHeading(text);
        return self();
    }

    public S addHeading(int level, Html html) {
        surfacePart.addHeading(level, html);
        return self();
    }

    public S addHeading(Html html) {
        surfacePart.addHeading(html);
        return self();
    }

    public S addDivider() {
        surfacePart.addDivider();
        return self();
    }

    public S addDivider(String label) {
        surfacePart.addDivider(label);
        return self();
    }

    public S addParagraph(String text) {
        surfacePart.addParagraph(text);
        return self();
    }

    public S addParagraph(Html html) {
        surfacePart.addParagraph(html);
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
        if (surfacePart == null)
            return false;

        return surfacePart.isRehydrated();
    }

    public Style getComputedStyle() {
        return surfacePart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        surfacePart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return surfacePart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        surfacePart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        surfacePart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        surfacePart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        surfacePart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return surfacePart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return surfacePart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        surfacePart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return surfacePart.getData(data);
    }

    public boolean hasData(String data) {
        return surfacePart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        surfacePart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return surfacePart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return surfacePart.hasAria(attribute);
    }

    public String getUniqueId() {
        return surfacePart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return surfacePart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return surfacePart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return surfacePart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return surfacePart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        surfacePart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return surfacePart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return surfacePart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return surfacePart.hasWrapper();
    }

    public boolean isInitialized() {
        return surfacePart.isInitialized();
    }

    public void log(Object obj) {
        surfacePart.log(obj);
    }

    public void removeFromParent() {
        surfacePart.removeFromParent();
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
    public WebCard getComponent() {
        return ((WebCard) (baseComponentPart.getComponent()));
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
        WebCardPart component = ((WebCardPart) (options.getComponent()));
        if (component == null)
            System.out.println("component is null");

        // Apply options for default state
        applicator.add(options.getImageAltTextOption(), component::setImageAltText);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        super.onInitializeComponentType(rootComponent);
        surfacePart.onInitializeComponentType(rootComponent);
    }

    @Override
    public WebLink getMediaLink() {
        return ((WebLink) (super.getMediaLink()));
    }

    @Override
    public WebFlexContainer getMediaContainer() {
        return ((WebFlexContainer) (super.getMediaContainer()));
    }

    @Override
    public WebImage getImage() {
        return ((WebImage) (super.getImage()));
    }

    @Override
    public WebFlexContainer getTextContent() {
        return ((WebFlexContainer) (super.getTextContent()));
    }

    @Override
    public WebFlexContainer getHeadline() {
        return ((WebFlexContainer) (super.getHeadline()));
    }

    @Override
    public WebLink getHeadingLink() {
        return ((WebLink) (super.getHeadingLink()));
    }

    @Override
    public WebTextBlock getHeadingContainer() {
        return ((WebTextBlock) (super.getHeadingContainer()));
    }

    @Override
    public WebTextBlock getSubHeadingContainer() {
        return ((WebTextBlock) (super.getSubHeadingContainer()));
    }

    @Override
    public WebTextBlock getTextContainer() {
        return ((WebTextBlock) (super.getTextContainer()));
    }

    @Override
    public WebFlexContainer getActionsContainer() {
        return ((WebFlexContainer) (super.getActionsContainer()));
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        commonStyles.addRule(".reuise-card").setDisplay("flex").setBorderRadius(12);
        commonStyles.addRule(".reuise-card--vertical").setFlexDirection("column");
        commonStyles.addRule(".reuise-card--horizontal").setFlexDirection("row");
        commonStyles.addRule(".reuise-card .reuise-card_textcontent").setDisplay("flex").setFlexDirection("column").setRowGap("32px").setPadding("16px");
        commonStyles.addRule(".reuise-card .reuise-card_headline").setDisplay("flex").setFlexDirection("column");
        commonStyles.addRule(".reuise-card .reuise-card_heading").setFontSize("16px").setFontWeight("400").setColor("#1D1B20").setLineHeight("24px");
        commonStyles.addRule(".reuise-card .reuise-card_subheading").setFontSize("14px").setFontWeight("400").setColor("#49454F").setLineHeight("20px");
        commonStyles.addRule(".reuise-card .reuise-card_text").setFontSize("14px").setFontWeight("400").setColor("#49454F").setLineHeight("20px");
        commonStyles.addRule(".reuise-card .reuise-card_media").setDisplay("flex").setOverflow("hidden").setJustifyContent("center");
        commonStyles.addRule(".reuise-card .reuise-card_heading_link").setTextDecoration("none");
        /* commonStyles.addRule(".reuise-card .reuise-card_image")
        .setAlignSelf("center");
         */
        commonStyles.addRule(".reuise-card--filled");
        commonStyles.addRule(".reuise-card--elevated").setBoxShadow("0px 1px 3px 1px rgba(0, 0, 0, 0.15), 0px 1px 2px 0px rgba(0, 0, 0, 0.30)");
        commonStyles.addRule(".reuise-card--outlined").setBorder("1px solid #CAC4D0");
    }

    @Override
    public S setAction(CoreButton action) {
        setActions(new ArrayList<CoreButton>(Arrays.asList(action)));
        return self();
    }
}