package dev.reuise.web.core.view;
import dev.reuise.core.State;
import dev.reuise.core.option.ComponentOption;
import dev.reuise.core.view.CoreViewPartOptions;
import dev.reuise.web.core.WebComponentFactory;
import java.util.Map;
public interface WebViewPartOptions extends CoreViewPartOptions {
    Map<String, String> getParameters();

    ComponentOption<Map<String, String>> getParametersOption();

    String getContentType();

    ComponentOption<String> getContentTypeOption();

    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebView getComponent();
}