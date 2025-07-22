package dev.reuise.web.core.basecomponent;
import dev.reuise.core.Interaction;
import dev.reuise.core.State;
import dev.reuise.core.basecomponent.CoreBaseComponentPart;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.WebComponentPart;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleSheetFactory;
import java.util.Set;
public interface WebBaseComponentPart extends WebBaseComponentFeatures , WebComponentPart , CoreBaseComponentPart {
    boolean isRehydrated();

    Style getComputedStyle();

    WebBaseComponentPart addOrRemoveStyleClass(String styleClass, boolean add);

    boolean hasStyleClass(String styleClass);

    WebBaseComponentPart removeStyleClass(String styleClass);

    WebBaseComponentPart setAttribute(String attribute, String value);

    WebBaseComponentPart setAttribute(String attribute);

    WebBaseComponentPart removeAttribute(String attribute);

    String getAttribute(String attribute);

    boolean hasAttribute(String attribute);

    WebBaseComponentPart setData(String data, String value);

    String getData(String data);

    boolean hasData(String data);

    WebBaseComponentPart setAria(String attribute, String value);

    String getAria(String attribute);

    boolean hasAria(String attribute);

    String getUniqueId();

    String getUniqueStyleClass();

    String getStyleSheetId();

    String getStyleSheetId(State state);

    Set<State> getStyleStates();

    void setStyleSheetFactory(StyleSheetFactory styleSheetFactory);

    Style getStyle(State state, Interaction interaction);

    Style getStyle(Interaction interaction);

    WebComponentFactory getComponentFactory();
}