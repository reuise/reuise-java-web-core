package dev.reuise.web.core.splitcontainer;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.splitcontainer.AbstractCoreSplitContainerOptions;
import dev.reuise.web.core.layout.WebContainerOptions;
public abstract class AbstractWebSplitContainerOptions<S extends AbstractWebSplitContainerOptions<S>> extends AbstractCoreSplitContainerOptions<S> implements WebSplitContainerOptions {
    protected AbstractWebSplitContainerOptions() {
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

    protected WebContainerOptions createDefaultContainerOptions() {
        WebContainerOptions options = ((WebContainerOptions) (super.createDefaultContainerOptions()));
        options.setStyleClass("reuise-splitcontainer_container");
        return options;
    }

    protected WebSplitContainerPanelOptions createDefaultStartPanelOptions() {
        WebSplitContainerPanelOptions options = ((WebSplitContainerPanelOptions) (super.createDefaultStartPanelOptions()));
        options.setStyleClass("reuise-splitcontainer_startpanel");
        return options;
    }

    protected WebSplitContainerDividerOptions createDefaultDividerOptions() {
        WebSplitContainerDividerOptions options = ((WebSplitContainerDividerOptions) (super.createDefaultDividerOptions()));
        options.setStyleClass("reuise-splitcontainer_divider");
        return options;
    }

    protected WebSplitContainerPanelOptions createDefaultEndPanelOptions() {
        WebSplitContainerPanelOptions options = ((WebSplitContainerPanelOptions) (super.createDefaultEndPanelOptions()));
        options.setStyleClass("reuise-splitcontainer_endpanel");
        return options;
    }
}