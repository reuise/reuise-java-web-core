package dev.reuise.web.core.basecomponent;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.ScreenSize;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.AbstractCoreBaseComponentOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.style.StyleOptions;
import dev.reuise.webstyles.Style;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public abstract class AbstractWebBaseComponentOptions<S extends AbstractWebBaseComponentOptions<S>> extends AbstractCoreBaseComponentOptions<S> implements WebBaseComponentOptions {
    public void setRehydrate(boolean rehydrate) {
        setRehydration(rehydrate ? "." + getBaseStyleClass() : null, getParent());
    }

    @Override
    public S setRehydration(String rehydration, CoreComponent parent) {
        return setRehydration(rehydration, parent, false);
    }

    @Override
    public S setRehydration(String rehydration, CoreComponent parent, Boolean canFail) {
        if (parent != null)
            setParent(parent);

        setRequiredLayoutComponent(!canFail);
        return setRehydration(rehydration);
    }

    @Override
    public S setRehydration(String rehydration, Boolean canFail) {
        return setRehydration(rehydration, null, canFail);
    }

    public boolean isRehydrated() {
        String rehydration = getRehydration();
        return (rehydration != null) && (!rehydration.isEmpty());
    }

    protected AbstractWebBaseComponentOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        setDefaultTagName("div");
        setDefaultAttributes(new HashMap<String, String>());
        setStyleClasses(new ArrayList<>());
        setDefaultData(new HashMap<String, String>());
        setDefaultStyle(new StyleOptions());
        setDefaultInlineStyle(new StyleOptions());
        setStoreInElementOptions(new ArrayList<>());
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }

    @Override
    public String getId() {
        return ((String) (getOptionValue("id")));
    }

    @Override
    public ComponentOption<String> getIdOption() {
        return ((ComponentOption<String>) (getOption("id")));
    }

    @Override
    public S setId(String id) {
        setOption("id", id);
        return self();
    }

    private void setDefaultId(String id) {
        setDefaultOption("id", id);
    }

    @Override
    public String getTagName() {
        return ((String) (getOptionValue("tagName")));
    }

    @Override
    public ComponentOption<String> getTagNameOption() {
        return ((ComponentOption<String>) (getOption("tagName")));
    }

    @Override
    public S setTagName(String tagName) {
        setOption("tagName", tagName);
        return self();
    }

    private void setDefaultTagName(String tagName) {
        setDefaultOption("tagName", tagName);
    }

    @Override
    public String getXmlNamespace() {
        return ((String) (getOptionValue("xmlNamespace")));
    }

    @Override
    public ComponentOption<String> getXmlNamespaceOption() {
        return ((ComponentOption<String>) (getOption("xmlNamespace")));
    }

    @Override
    public S setXmlNamespace(String xmlNamespace) {
        setOption("xmlNamespace", xmlNamespace);
        return self();
    }

    private void setDefaultXmlNamespace(String xmlNamespace) {
        setDefaultOption("xmlNamespace", xmlNamespace);
    }

    @Override
    public String getTooltip() {
        return ((String) (getOptionValue("tooltip")));
    }

    @Override
    public ComponentOption<String> getTooltipOption() {
        return ((ComponentOption<String>) (getOption("tooltip")));
    }

    @Override
    public S setTooltip(String tooltip) {
        setOption("tooltip", tooltip);
        return self();
    }

    private void setDefaultTooltip(String tooltip) {
        setDefaultOption("tooltip", tooltip);
    }

    @Override
    public String getBaseStyleClass() {
        return ((String) (getOptionValue("baseStyleClass")));
    }

    @Override
    public ComponentOption<String> getBaseStyleClassOption() {
        return ((ComponentOption<String>) (getOption("baseStyleClass")));
    }

    @Override
    public S setBaseStyleClass(String baseStyleClass) {
        setOption("baseStyleClass", baseStyleClass);
        return self();
    }

    private void setDefaultBaseStyleClass(String baseStyleClass) {
        setDefaultOption("baseStyleClass", baseStyleClass);
    }

    @Override
    public Map<String, String> getAttributes() {
        return ((Map<String, String>) (getOptionValue("attributes")));
    }

    @Override
    public ComponentOption<Map<String, String>> getAttributesOption() {
        return ((ComponentOption<Map<String, String>>) (getOption("attributes")));
    }

    @Override
    public S setAttributes(Map<String, String> attributes) {
        setOption("attributes", attributes);
        return self();
    }

    private void setDefaultAttributes(Map<String, String> attributes) {
        setDefaultOption("attributes", attributes);
    }

    @Override
    public List<String> getStyleClasses() {
        return ((List<String>) (getOptionValue("styleClasses")));
    }

    @Override
    public ComponentOption<List<String>> getStyleClassesOption() {
        return ((ComponentOption<List<String>>) (getOption("styleClasses")));
    }

    @Override
    public S setStyleClasses(List<String> styleClasses) {
        setOption("styleClasses", styleClasses);
        return self();
    }

    @Override
    public S addStyleClass(String styleClass) {
        List<String> list = getStyleClasses();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setStyleClasses(list);
        }
        list.add(styleClass);
        return self();
    }

    @Override
    public S setStyleClass(String styleClass) {
        setStyleClasses(new ArrayList<String>(Arrays.asList(styleClass)));
        return self();
    }

    @Override
    public S setStyleClasses(String... styleClasses) {
        setStyleClasses(new ArrayList<String>(Arrays.asList(styleClasses)));
        return self();
    }

    // Implementation
    @Override
    public S removeStyleClass(String styleClass) {
        return self();
    }

    @Override
    public boolean hasStyleClass(String styleClass) {
        List<String> list = getStyleClasses();
        if (list == null) {
            return false;
        }
        return list.contains(styleClass);
    }

    private void setDefaultStyleClasses(List<String> styleClasses) {
        setDefaultOption("styleClasses", styleClasses);
    }

    @Override
    public Map<String, String> getData() {
        return ((Map<String, String>) (getOptionValue("data")));
    }

    @Override
    public ComponentOption<Map<String, String>> getDataOption() {
        return ((ComponentOption<Map<String, String>>) (getOption("data")));
    }

    @Override
    public S setData(Map<String, String> data) {
        setOption("data", data);
        return self();
    }

    private void setDefaultData(Map<String, String> data) {
        setDefaultOption("data", data);
    }

    @Override
    public Style getStyle() {
        return ((Style) (getOptionValue("style")));
    }

    @Override
    public ComponentOption<Style> getStyleOption() {
        return ((ComponentOption<Style>) (getOption("style")));
    }

    @Override
    public S setStyle(Style style) {
        setOption("style", style);
        return self();
    }

    @Override
    public S setStyle(Style style, State state) {
        setOption("style", style, state);
        return self();
    }

    @Override
    public S setStyleAllStates(Style style) {
        // HIMADDIE!!
        clearOptionStates("style");
        setStyle(style);
        return self();
    }

    @Override
    public S setStyle(ScreenSizeValues<Style> screenValues) {
        clearOption("style", null);
        if (screenValues == null)
            return self();

        screenValues.iterate((ScreenSize s,Style v) -> setStyle(v, s));
        return self();
    }

    @Override
    public Style getStyle(State state) {
        return ((Style) (getOptionValue("style", state)));
    }

    @Override
    public Collection<State> getStyleStates() {
        return getOptionStates("style");
    }

    @Override
    public ComponentOption<Style> getStyleOption(State state) {
        return ((ComponentOption<Style>) (getOption("style", state)));
    }

    private void setDefaultStyle(Style style) {
        setDefaultOption("style", style);
    }

    private void setDefaultStyle(Style style, State state) {
        setDefaultOption("style", style, state);
    }

    private void setDefaultStyleAllStates(Style style) {
        // HIMADDIE!!
        clearOptionStates("style");
        setStyle(style);
    }

    @Override
    public Style getInlineStyle() {
        return ((Style) (getOptionValue("inlineStyle")));
    }

    @Override
    public ComponentOption<Style> getInlineStyleOption() {
        return ((ComponentOption<Style>) (getOption("inlineStyle")));
    }

    @Override
    public S setInlineStyle(Style inlineStyle) {
        setOption("inlineStyle", inlineStyle);
        return self();
    }

    private void setDefaultInlineStyle(Style inlineStyle) {
        setDefaultOption("inlineStyle", inlineStyle);
    }

    @Override
    public String getRehydration() {
        return ((String) (getOptionValue("rehydration")));
    }

    @Override
    public ComponentOption<String> getRehydrationOption() {
        return ((ComponentOption<String>) (getOption("rehydration")));
    }

    @Override
    public S setRehydration(String rehydration) {
        setOption("rehydration", rehydration);
        return self();
    }

    private void setDefaultRehydration(String rehydration) {
        setDefaultOption("rehydration", rehydration);
    }

    @Override
    public boolean isContentEditable() {
        return Boolean.TRUE.equals(getOptionValue("contentEditable"));
    }

    @Override
    public ComponentOption<Boolean> getContentEditableOption() {
        return ((ComponentOption<Boolean>) (getOption("contentEditable")));
    }

    @Override
    public S setContentEditable(Boolean contentEditable) {
        setOption("contentEditable", contentEditable);
        return self();
    }

    private void setDefaultContentEditable(Boolean contentEditable) {
        setDefaultOption("contentEditable", contentEditable);
    }

    @Override
    public List<String> getStoreInElementOptions() {
        return ((List<String>) (getOptionValue("storeInElementOptions")));
    }

    @Override
    public ComponentOption<List<String>> getStoreInElementOptionsOption() {
        return ((ComponentOption<List<String>>) (getOption("storeInElementOptions")));
    }

    @Override
    public S setStoreInElementOptions(List<String> storeInElementOptions) {
        setOption("storeInElementOptions", storeInElementOptions);
        return self();
    }

    @Override
    public S addStoreInElementOptions(String storeInElementOptions) {
        List<String> list = getStoreInElementOptions();
        if (list == null) // CREATEIFNOTEXISTS!!
        {
            list = new ArrayList();
            setStoreInElementOptions(list);
        }
        list.add(storeInElementOptions);
        return self();
    }

    @Override
    public S setStoreInElementOptions(String storeInElementOptions) {
        setStoreInElementOptions(new ArrayList<String>(Arrays.asList(storeInElementOptions)));
        return self();
    }

    // Implementation
    @Override
    public S removeStoreInElementOptions(String storeInElementOptions) {
        return self();
    }

    // Implementation
    @Override
    public boolean hasStoreInElementOptions(String storeInElementOptions) {
        return false;
    }

    private void setDefaultStoreInElementOptions(List<String> storeInElementOptions) {
        setDefaultOption("storeInElementOptions", storeInElementOptions);
    }

    public WebBaseComponent getComponent() {
        return ((WebBaseComponent) (super.getComponent()));
    }

    public void setComponent(WebBaseComponent component) {
    }
}