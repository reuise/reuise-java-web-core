package dev.reuise.web.core.document;
import dev.reuise.core.State;
import dev.reuise.web.core.WebComponentFactory;
public interface WebDocumentBodyPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebDocumentBody getComponent();
}