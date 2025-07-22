package dev.reuise.web.core.basecomponent;
import dev.reuise.core.CoreComponent;
import dev.reuise.core.ScreenSizeValues;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.CoreBaseComponentFeatures;
import dev.reuise.webstyles.Style;
import java.util.List;
import java.util.Map;
public interface WebBaseComponentFeatures extends CoreBaseComponentFeatures {
    String getId();

    WebBaseComponentFeatures setId(String id);

    String getTagName();

    WebBaseComponentFeatures setTagName(String tagName);

    String getXmlNamespace();

    WebBaseComponentFeatures setXmlNamespace(String xmlNamespace);

    String getTooltip();

    WebBaseComponentFeatures setTooltip(String tooltip);

    String getBaseStyleClass();

    WebBaseComponentFeatures setBaseStyleClass(String baseStyleClass);

    Map<String, String> getAttributes();

    WebBaseComponentFeatures setAttributes(Map<String, String> attributes);

    List<String> getStyleClasses();

    WebBaseComponentFeatures setStyleClasses(List<String> styleClasses);

    WebBaseComponentFeatures addStyleClass(String styleClass);

    WebBaseComponentFeatures setStyleClass(String styleClass);

    WebBaseComponentFeatures setStyleClasses(String... styleClasses);

    WebBaseComponentFeatures removeStyleClass(String styleClass);

    boolean hasStyleClass(String styleClass);

    Map<String, String> getData();

    WebBaseComponentFeatures setData(Map<String, String> data);

    Style getStyle();

    WebBaseComponentFeatures setStyle(Style style);

    WebBaseComponentFeatures setStyle(Style style, State state);

    WebBaseComponentFeatures setStyleAllStates(Style style);

    WebBaseComponentFeatures setStyle(ScreenSizeValues<Style> style);

    Style getStyle(State state);

    Style getInlineStyle();

    WebBaseComponentFeatures setInlineStyle(Style inlineStyle);

    String getRehydration();

    WebBaseComponentFeatures setRehydration(String rehydration);

    boolean isContentEditable();

    WebBaseComponentFeatures setContentEditable(Boolean contentEditable);

    List<String> getStoreInElementOptions();

    WebBaseComponentFeatures setStoreInElementOptions(List<String> storeInElementOptions);

    WebBaseComponentFeatures addStoreInElementOptions(String storeInElementOptions);

    WebBaseComponentFeatures setStoreInElementOptions(String storeInElementOptions);

    WebBaseComponentFeatures removeStoreInElementOptions(String storeInElementOptions);

    boolean hasStoreInElementOptions(String storeInElementOptions);

    WebBaseComponentFeatures setRehydration(String rehydration, Boolean canFail);

    WebBaseComponentFeatures setRehydration(String selector, CoreComponent parent);

    WebBaseComponentFeatures setRehydration(String selector, CoreComponent parent, Boolean canFail);
}