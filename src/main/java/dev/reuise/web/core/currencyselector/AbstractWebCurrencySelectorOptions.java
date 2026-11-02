package dev.reuise.web.core.currencyselector;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.currencyselector.AbstractCoreCurrencySelectorOptions;
public abstract class AbstractWebCurrencySelectorOptions<S extends AbstractWebCurrencySelectorOptions<S>> extends AbstractCoreCurrencySelectorOptions<S> implements WebCurrencySelectorOptions {
    protected AbstractWebCurrencySelectorOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    public void onInitialize() {
        super.onInitialize();
    }
}
