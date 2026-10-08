package dev.reuise.web.core.accordion;
import dev.reuise.core.State;
import dev.reuise.core.accordion.CoreAccordionPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebAccordionPartOptions extends CoreAccordionPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebAccordion getComponent();
}
