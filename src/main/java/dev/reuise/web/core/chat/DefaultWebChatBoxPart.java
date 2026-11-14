package dev.reuise.web.core.chat;
import dev.reuise.core.ComponentAnimation;
import dev.reuise.core.ComponentPart;
import dev.reuise.core.ComponentType;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.Interaction;
import dev.reuise.core.RootComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.chat.DefaultCoreChatBoxPart;
import dev.reuise.core.layout.BackdropFilter;
import dev.reuise.core.option.OptionApplicator;
import dev.reuise.core.theme.Theme;
import dev.reuise.web.core.WebComponent;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.web.core.basecomponent.WebBaseComponentPart;
import dev.reuise.web.core.button.WebButton;
import dev.reuise.web.core.floating.WebFloatingPanel;
import dev.reuise.web.core.input.WebBasicInputField;
import dev.reuise.web.core.layout.WebContainer;
import dev.reuise.web.core.layout.WebContainerPart;
import dev.reuise.web.core.parentcomponent.WebParentComponentPart;
import dev.reuise.web.core.text.WebParagraph;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleBuilder;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
// Option: Animation - WEB
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
// Option: LocaleContext - CORE
// Option: LinkUrlResolver - CORE
// Option: Wrapper - CORE
// Option: Theme - CORE
// Option: Visible - CORE
// Option: Enabled - CORE
// Option: Focused - CORE
// Option: Debug - CORE
// Option: DebugId - CORE
// base comp: container
// add composition for container: startAnimation
// add composition for container: cancelAnimation
// add composition for container: addMarkdown
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
public abstract class DefaultWebChatBoxPart<S extends DefaultWebChatBoxPart<S, O>, O extends WebChatBoxPartOptions> extends DefaultCoreChatBoxPart<S, O> implements WebChatBox , WebComponentPart {
    @Override
    public S setLoading(Boolean loading) {
        super.setLoading(Boolean.TRUE.equals(loading));
        setData("loading", Boolean.toString(isLoading()));
        synchronize();
        return self();
    }

    @Override
    public S setErrorMessage(String errorMessage) {
        super.setErrorMessage(errorMessage == null ? "" : errorMessage);
        setData("errormessage", getErrorMessage());
        if (getErrorDisplay() != null)
            getErrorDisplay().setText(getErrorMessage());

        synchronize();
        return self();
    }

    @Override
    public S setHandoffStatus(String handoffStatus) {
        if ((((!"available".equals(handoffStatus)) && (!"requested".equals(handoffStatus))) && (!"connected".equals(handoffStatus))) && (!"unavailable".equals(handoffStatus)))
            throw new IllegalArgumentException("Invalid handoff status: " + handoffStatus);

        super.setHandoffStatus(handoffStatus);
        setData("handoffstatus", handoffStatus);
        synchronize();
        synchronizeHandoff();
        return self();
    }

    @Override
    public S setHandoffMessage(String handoffMessage) {
        super.setHandoffMessage(handoffMessage == null ? "" : handoffMessage);
        setData("handoffmessage", getHandoffMessage());
        synchronizeHandoff();
        return self();
    }

    @Override
    public S setHandoffRequestedLabel(String handoffRequestedLabel) {
        super.setHandoffRequestedLabel(label(handoffRequestedLabel, "Connecting to a person..."));
        setData("handoffrequestedlabel", getHandoffRequestedLabel());
        synchronizeHandoff();
        return self();
    }

    @Override
    public S setHandoffConnectedLabel(String handoffConnectedLabel) {
        super.setHandoffConnectedLabel(label(handoffConnectedLabel, "Connected to a person"));
        setData("handoffconnectedlabel", getHandoffConnectedLabel());
        synchronizeHandoff();
        return self();
    }

    @Override
    public S setHandoffUnavailableLabel(String handoffUnavailableLabel) {
        super.setHandoffUnavailableLabel(label(handoffUnavailableLabel, "Human support unavailable"));
        setData("handoffunavailablelabel", getHandoffUnavailableLabel());
        synchronizeHandoff();
        return self();
    }

    @Override
    public S setMessagesLabel(String messagesLabel) {
        super.setMessagesLabel(label(messagesLabel, "Conversation"));
        setData("messageslabel", getMessagesLabel());
        if (getMessages() != null)
            getMessages().setAttribute("aria-label", getMessagesLabel());

        return self();
    }

    @Override
    public S setComposerLabel(String composerLabel) {
        super.setComposerLabel(label(composerLabel, "Message"));
        setData("composerlabel", getComposerLabel());
        if (getComposer() != null)
            getComposer().setAttribute("aria-label", getComposerLabel());

        return self();
    }

    @Override
    public S setComposerPlaceholder(String composerPlaceholder) {
        super.setComposerPlaceholder(composerPlaceholder == null ? "" : composerPlaceholder);
        setData("composerplaceholder", getComposerPlaceholder());
        if (getComposer() != null)
            getComposer().setPlaceholder(getComposerPlaceholder());

        return self();
    }

    @Override
    public S setSendLabel(String sendLabel) {
        super.setSendLabel(label(sendLabel, "Send"));
        setData("sendlabel", getSendLabel());
        if (getSendButton() != null)
            getSendButton().setLabel(getSendLabel());

        return self();
    }

    @Override
    public S setStopLabel(String stopLabel) {
        super.setStopLabel(label(stopLabel, "Stop"));
        setData("stoplabel", getStopLabel());
        if (getStopButton() != null)
            getStopButton().setLabel(getStopLabel());

        return self();
    }

    @Override
    public S setRetryLabel(String retryLabel) {
        super.setRetryLabel(label(retryLabel, "Retry"));
        setData("retrylabel", getRetryLabel());
        if (getRetryButton() != null)
            getRetryButton().setLabel(getRetryLabel());

        return self();
    }

    @Override
    public S setRequestHumanLabel(String requestHumanLabel) {
        super.setRequestHumanLabel(label(requestHumanLabel, "Talk to a person"));
        setData("requesthumanlabel", getRequestHumanLabel());
        if (getRequestHumanButton() != null)
            getRequestHumanButton().setLabel(getRequestHumanLabel());

        return self();
    }

    @Override
    public S setLoadingLabel(String loadingLabel) {
        super.setLoadingLabel(label(loadingLabel, "Responding..."));
        setData("loadinglabel", getLoadingLabel());
        if (getLoadingIndicator() != null)
            getLoadingIndicator().setText(getLoadingLabel());

        return self();
    }

    private void synchronize() {
        boolean loading = isLoading();
        if (getMessages() != null)
            getMessages().setAttribute("aria-busy", Boolean.toString(loading));

        if (getLoadingIndicator() != null)
            show(getLoadingIndicator(), loading);

        if (getSendButton() != null)
            show(getSendButton(), !loading);

        if (getStopButton() != null)
            show(getStopButton(), loading);

        boolean error = (getErrorMessage() != null) && (!getErrorMessage().isEmpty());
        if (getErrorDisplay() != null)
            show(getErrorDisplay(), error);

        if (getRetryButton() != null)
            show(getRetryButton(), error && (!loading));

        if (getRequestHumanButton() != null)
            show(getRequestHumanButton(), "available".equals(getHandoffStatus()));

    }

    private void synchronizeHandoff() {
        if (getHandoffDisplay() == null)
            return;

        String text = getHandoffMessage();
        if ((text == null) || text.isEmpty()) {
            if ("requested".equals(getHandoffStatus()))
                text = getHandoffRequestedLabel();
            else if ("connected".equals(getHandoffStatus()))
                text = getHandoffConnectedLabel();
            else if ("unavailable".equals(getHandoffStatus()))
                text = getHandoffUnavailableLabel();

        }
        text = (text == null) ? "" : text;
        getHandoffDisplay().setText(text);
        show(getHandoffDisplay(), !text.isEmpty());
    }

    private static String label(String value, String fallback) {
        return (value == null) || value.trim().isEmpty() ? fallback : value;
    }

    private static void show(WebComponent component, boolean visible) {
        if (visible)
            component.removeAttribute("hidden");
        else
            component.setAttribute("hidden", "");

    }

    private WebContainerPart containerPart;

    private WebParentComponentPart parentComponentPart;

    private WebBaseComponentPart baseComponentPart;

    protected DefaultWebChatBoxPart(O options) {
        super(options);
    }

    protected void setupReferences() {
        // Parts
        containerPart = getContainerPart();
        parentComponentPart = getParentComponentPart();
        baseComponentPart = getBaseComponentPart();
        super.setupReferences();
    }

    @Override
    public ComponentAnimation getAnimation() {
        return containerPart.getAnimation();
    }

    @Override
    public S setAnimation(ComponentAnimation animation) {
        this.containerPart.setAnimation(animation);
        return self();
    }

    @Override
    public S setBackdropFilter(BackdropFilter backdropFilter, Object value) {
        this.containerPart.setBackdropFilter(backdropFilter, value);
        return self();
    }

    public S startAnimation() {
        containerPart.startAnimation();
        return self();
    }

    public S cancelAnimation() {
        containerPart.cancelAnimation();
        return self();
    }

    public S addMarkdown(String markdown) {
        containerPart.addMarkdown(markdown);
        return self();
    }

    @Override
    public RootComponent getRootComponent() {
        return containerPart.getRootComponent();
    }

    @Override
    public void setRootComponent(RootComponent rootComponent) {
        super.setRootComponent(rootComponent);
        this.containerPart.setRootComponent(rootComponent);
        if (floatingPanel != null)
            floatingPanel.setRootComponent(rootComponent);

        if (chatContent != null)
            chatContent.setRootComponent(rootComponent);

        if (messages != null)
            messages.setRootComponent(rootComponent);

        if (loadingIndicator != null)
            loadingIndicator.setRootComponent(rootComponent);

        if (errorDisplay != null)
            errorDisplay.setRootComponent(rootComponent);

        if (retryButton != null)
            retryButton.setRootComponent(rootComponent);

        if (handoffDisplay != null)
            handoffDisplay.setRootComponent(rootComponent);

        if (requestHumanButton != null)
            requestHumanButton.setRootComponent(rootComponent);

        if (composerArea != null)
            composerArea.setRootComponent(rootComponent);

        if (composer != null)
            composer.setRootComponent(rootComponent);

        if (sendButton != null)
            sendButton.setRootComponent(rootComponent);

        if (stopButton != null)
            stopButton.setRootComponent(rootComponent);

    }

    @Override
    public Theme getTheme() {
        return containerPart.getTheme();
    }

    @Override
    public S setTheme(Theme theme) {
        super.setTheme(theme);
        if (floatingPanel != null)
            floatingPanel.setTheme(theme);

        if (chatContent != null)
            chatContent.setTheme(theme);

        if (messages != null)
            messages.setTheme(theme);

        if (loadingIndicator != null)
            loadingIndicator.setTheme(theme);

        if (errorDisplay != null)
            errorDisplay.setTheme(theme);

        if (retryButton != null)
            retryButton.setTheme(theme);

        if (handoffDisplay != null)
            handoffDisplay.setTheme(theme);

        if (requestHumanButton != null)
            requestHumanButton.setTheme(theme);

        if (composerArea != null)
            composerArea.setTheme(theme);

        if (composer != null)
            composer.setTheme(theme);

        if (sendButton != null)
            sendButton.setTheme(theme);

        if (stopButton != null)
            stopButton.setTheme(theme);

        this.containerPart.setTheme(theme);
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
        if (containerPart == null)
            return false;

        return containerPart.isRehydrated();
    }

    public Style getComputedStyle() {
        return containerPart.getComputedStyle();
    }

    public S addOrRemoveStyleClass(String styleClass, boolean add) {
        containerPart.addOrRemoveStyleClass(styleClass, add);
        return self();
    }

    public boolean hasStyleClass(String styleClass) {
        return containerPart.hasStyleClass(styleClass);
    }

    public S removeStyleClass(String styleClass) {
        containerPart.removeStyleClass(styleClass);
        return self();
    }

    public S setAttribute(String attribute, String value) {
        containerPart.setAttribute(attribute, value);
        return self();
    }

    public S setAttribute(String attribute) {
        containerPart.setAttribute(attribute);
        return self();
    }

    public S removeAttribute(String attribute) {
        containerPart.removeAttribute(attribute);
        return self();
    }

    public String getAttribute(String attribute) {
        return containerPart.getAttribute(attribute);
    }

    public boolean hasAttribute(String attribute) {
        return containerPart.hasAttribute(attribute);
    }

    public S setData(String data, String value) {
        containerPart.setData(data, value);
        return self();
    }

    public String getData(String data) {
        return containerPart.getData(data);
    }

    public boolean hasData(String data) {
        return containerPart.hasData(data);
    }

    public S setAria(String attribute, String value) {
        containerPart.setAria(attribute, value);
        return self();
    }

    public String getAria(String attribute) {
        return containerPart.getAria(attribute);
    }

    public boolean hasAria(String attribute) {
        return containerPart.hasAria(attribute);
    }

    public String getUniqueId() {
        return containerPart.getUniqueId();
    }

    public String getUniqueStyleClass() {
        return containerPart.getUniqueStyleClass();
    }

    public String getStyleSheetId() {
        return containerPart.getStyleSheetId();
    }

    public String getStyleSheetId(State state) {
        return containerPart.getStyleSheetId(state);
    }

    public Set<State> getStyleStates() {
        return containerPart.getStyleStates();
    }

    public void setStyleSheetFactory(StyleSheetFactory styleSheetFactory) {
        containerPart.setStyleSheetFactory(styleSheetFactory);
    }

    public Style getStyle(State state, Interaction interaction) {
        return containerPart.getStyle(state, interaction);
    }

    public Style getStyle(Interaction interaction) {
        return containerPart.getStyle(interaction);
    }

    public boolean hasWrapper() {
        return containerPart.hasWrapper();
    }

    public boolean isInitialized() {
        return containerPart.isInitialized();
    }

    public void log(Object obj) {
        containerPart.log(obj);
    }

    public void removeFromParent() {
        containerPart.removeFromParent();
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
    public WebChatBox getComponent() {
        return ((WebChatBox) (baseComponentPart.getComponent()));
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
        getMessages().setAttribute("role", "log");
        getMessages().setAttribute("aria-live", "polite");
        getMessages().setAttribute("aria-relevant", "additions text");
        getLoadingIndicator().setAttribute("role", "status");
        getErrorDisplay().setAttribute("role", "alert");
        getHandoffDisplay().setAttribute("role", "status");
        getSendButton().setAttribute("type", "button");
        getStopButton().setAttribute("type", "button");
        getRetryButton().setAttribute("type", "button");
        getRequestHumanButton().setAttribute("type", "button");
        setMessagesLabel(options.getMessagesLabel());
        setComposerLabel(options.getComposerLabel());
        setComposerPlaceholder(options.getComposerPlaceholder());
        setSendLabel(options.getSendLabel());
        setStopLabel(options.getStopLabel());
        setRetryLabel(options.getRetryLabel());
        setRequestHumanLabel(options.getRequestHumanLabel());
        setLoadingLabel(options.getLoadingLabel());
        setErrorMessage(options.getErrorMessage());
        setHandoffRequestedLabel(options.getHandoffRequestedLabel());
        setHandoffConnectedLabel(options.getHandoffConnectedLabel());
        setHandoffUnavailableLabel(options.getHandoffUnavailableLabel());
        setHandoffMessage(options.getHandoffMessage());
        setHandoffStatus(options.getHandoffStatus());
        setLoading(options.isLoading());
    }

    public void onCreate(O options) {
        super.onCreate(options);
    }

    public void applyOptions(O options, OptionApplicator applicator, Collection<State> states) {
        super.applyOptions(options, applicator, states);
    }

    public void onInitializeComponentType(RootComponent rootComponent) {
        super.onInitializeComponentType(rootComponent);
        containerPart.onInitializeComponentType(rootComponent);
    }

    @Override
    public WebFloatingPanel getFloatingPanel() {
        return ((WebFloatingPanel) (super.getFloatingPanel()));
    }

    @Override
    public WebContainer getChatContent() {
        return ((WebContainer) (super.getChatContent()));
    }

    @Override
    public WebContainer getMessages() {
        return ((WebContainer) (super.getMessages()));
    }

    @Override
    public WebParagraph getLoadingIndicator() {
        return ((WebParagraph) (super.getLoadingIndicator()));
    }

    @Override
    public WebParagraph getErrorDisplay() {
        return ((WebParagraph) (super.getErrorDisplay()));
    }

    @Override
    public WebButton getRetryButton() {
        return ((WebButton) (super.getRetryButton()));
    }

    @Override
    public WebParagraph getHandoffDisplay() {
        return ((WebParagraph) (super.getHandoffDisplay()));
    }

    @Override
    public WebButton getRequestHumanButton() {
        return ((WebButton) (super.getRequestHumanButton()));
    }

    @Override
    public WebContainer getComposerArea() {
        return ((WebContainer) (super.getComposerArea()));
    }

    @Override
    public WebBasicInputField getComposer() {
        return ((WebBasicInputField) (super.getComposer()));
    }

    @Override
    public WebButton getSendButton() {
        return ((WebButton) (super.getSendButton()));
    }

    @Override
    public WebButton getStopButton() {
        return ((WebButton) (super.getStopButton()));
    }

    // Implementation
    // Implementation
    public void onInitializeCommonStyle(StyleBuilder commonStyles) {
        commonStyles.addRule(".reuise-chatbox_chatcontent").setDisplay("flex").setFlexDirection("column").setMinHeight(0).setHeight("100%");
        commonStyles.addRule(".reuise-chatbox_messages").setFlexGrow(1).setMinHeight("100px").setOverflow("auto");
        commonStyles.addRule(".reuise-chatbox_composerarea").setDisplay("flex").setAlignItems("end");
        commonStyles.addRule(".reuise-chatbox_composer").setFlexGrow(1).setMinWidth(0);
        commonStyles.addRule(".reuise-chatbox [hidden]").setDisplay("none", true);
    }
}
