package dev.reuise.web.core.currencyselector;
import dev.reuise.core.State;
import dev.reuise.core.currencyselector.CoreCurrencySelectorPartOptions;
import dev.reuise.web.core.WebComponentFactory;
public interface WebCurrencySelectorPartOptions extends CoreCurrencySelectorPartOptions {
    <T> void setDefaultOption(String option, T value);

    <T> void setDefaultOption(String option, T value, boolean force);

    <T> void setDefaultOption(String option, T value, State state);

    <T> void setDefaultOption(String option, T value, State state, boolean force);

    WebComponentFactory getComponentFactory();

    WebCurrencySelector getComponent();
}
