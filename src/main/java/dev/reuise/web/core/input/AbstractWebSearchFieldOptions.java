package dev.reuise.web.core.input;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.icon.CoreIconOptions;
import dev.reuise.core.input.AbstractCoreSearchFieldOptions;
import dev.reuise.web.core.graphics.svg.WebSvgOptions;
import dev.reuise.web.core.icon.WebIconOptions;
public abstract class AbstractWebSearchFieldOptions<S extends AbstractWebSearchFieldOptions<S>> extends AbstractCoreSearchFieldOptions<S> implements WebSearchFieldOptions {
    protected AbstractWebSearchFieldOptions() {
    }

    public <O extends CoreComponentOptions> void initialize(O options) {
        super.initialize(options);
    }

    public boolean onPreInitialize() {
        if (!super.onPreInitialize())
            return false;

        return true;
    }

    // Implementation
    // Implementation
    public void onInitialize() {
        super.onInitialize();
        CoreIconOptions startIconOptions = getTextFieldPart().getStartIconOptions();
        if ((!isRehydrated()) && (startIconOptions == null)) {
            WebSvgOptions arrowSvgOpts = getComponentFactory().createSvgOptions();
            arrowSvgOpts.setViewBox("0 0 24 24");
            WebIconOptions arrowIconOpts = getComponentFactory().createIconOptions();
            arrowIconOpts.setSvgOptions(arrowSvgOpts);
            this.getTextFieldPart().setStartIconOptions(arrowIconOpts);
        }
    }
}