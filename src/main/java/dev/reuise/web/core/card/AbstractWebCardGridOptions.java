package dev.reuise.web.core.card;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.card.AbstractCoreCardGridOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
public abstract class AbstractWebCardGridOptions<S extends AbstractWebCardGridOptions<S>> extends AbstractCoreCardGridOptions<S> implements WebCardGridOptions {
    protected AbstractWebCardGridOptions() {
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

    protected WebContainerOptions createDefaultScrimOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultScrimOptions()));
        options.setStyleClass("reuise-cardgrid_scrim");
        return options;
    }

    protected WebContainerOptions createDefaultCardContainerOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultCardContainerOptions()));
        options.setStyleClass("reuise-cardgrid_cardcontainer");
        return options;
    }
}