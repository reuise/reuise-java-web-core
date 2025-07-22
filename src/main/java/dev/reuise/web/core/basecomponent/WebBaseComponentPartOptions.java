package dev.reuise.web.core.basecomponent;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.CoreBaseComponentPartOptions;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.webstyles.Style;
import java.util.Collection;
import java.util.List;
import java.util.Map;
public interface WebBaseComponentPartOptions extends CoreBaseComponentPartOptions {
    String getId();

    ComponentOption<String> getIdOption();

    WebBaseComponentPartOptions setId(String id);

    String getTagName();

    ComponentOption<String> getTagNameOption();

    WebBaseComponentPartOptions setTagName(String tagName);

    String getXmlNamespace();

    ComponentOption<String> getXmlNamespaceOption();

    WebBaseComponentPartOptions setXmlNamespace(String xmlNamespace);

    String getTooltip();

    ComponentOption<String> getTooltipOption();

    WebBaseComponentPartOptions setTooltip(String tooltip);

    String getBaseStyleClass();

    ComponentOption<String> getBaseStyleClassOption();

    WebBaseComponentPartOptions setBaseStyleClass(String baseStyleClass);

    Map<String, String> getAttributes();

    ComponentOption<Map<String, String>> getAttributesOption();

    WebBaseComponentPartOptions setAttributes(Map<String, String> attributes);

    List<String> getStyleClasses();

    ComponentOption<List<String>> getStyleClassesOption();

    WebBaseComponentPartOptions setStyleClasses(List<String> styleClasses);

    WebBaseComponentPartOptions addStyleClass(String styleClass);

    WebBaseComponentPartOptions setStyleClass(String styleClass);

    WebBaseComponentPartOptions setStyleClasses(String... styleClasses);

    WebBaseComponentPartOptions removeStyleClass(String styleClass);

    boolean hasStyleClass(String styleClass);

    Map<String, String> getData();

    ComponentOption<Map<String, String>> getDataOption();

    WebBaseComponentPartOptions setData(Map<String, String> data);

    Style getStyle();

    ComponentOption<Style> getStyleOption();

    WebBaseComponentPartOptions setStyle(Style style);

    WebBaseComponentPartOptions setStyle(Style style, State state);

    WebBaseComponentPartOptions setStyleAllStates(Style style);

    WebBaseComponentPartOptions setStyle(ScreenSizeValues<Style> style);

    Style getStyle(State state);

    ComponentOption<Style> getStyleOption(State state);

    Collection<State> getStyleStates();

    Style getInlineStyle();

    ComponentOption<Style> getInlineStyleOption();

    WebBaseComponentPartOptions setInlineStyle(Style inlineStyle);

    String getRehydration();

    ComponentOption<String> getRehydrationOption();

    WebBaseComponentPartOptions setRehydration(String rehydration);

    boolean isContentEditable();

    ComponentOption<Boolean> getContentEditableOption();

    WebBaseComponentPartOptions setContentEditable(Boolean contentEditable);

    List<String> getStoreInElementOptions();

    ComponentOption<List<String>> getStoreInElementOptionsOption();

    WebBaseComponentPartOptions setStoreInElementOptions(List<String> storeInElementOptions);

    WebBaseComponentPartOptions addStoreInElementOptions(String storeInElementOptions);

    WebBaseComponentPartOptions setStoreInElementOptions(String storeInElementOptions);

    WebBaseComponentPartOptions removeStoreInElementOptions(String storeInElementOptions);

    boolean hasStoreInElementOptions(String storeInElementOptions);

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebBaseComponentPartOptions setRehydration(String rehydration, Boolean canFail);

    WebBaseComponentPartOptions setRehydration(String selector, CoreComponent parent);

    WebBaseComponentPartOptions setRehydration(String selector, CoreComponent parent, Boolean canFail);

    void setRehydrate(boolean rehydrate);

    boolean isRehydrated();

    WebComponentFactory getComponentFactory();

    WebBaseComponent getComponent();
}