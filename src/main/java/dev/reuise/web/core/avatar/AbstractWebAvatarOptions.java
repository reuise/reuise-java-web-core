package dev.reuise.web.core.avatar;
import dev.reuise.core.CoreComponentOptions;
import dev.reuise.core.avatar.AbstractCoreAvatarOptions;
import dev.reuise.web.core.badge.WebBadgeOptions;
import dev.reuise.web.core.image.WebImageOptions;
public abstract class AbstractWebAvatarOptions<S extends AbstractWebAvatarOptions<S>> extends AbstractCoreAvatarOptions<S> implements WebAvatarOptions {
    protected AbstractWebAvatarOptions() {
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

    protected WebImageOptions createDefaultImageOptions() {
        WebImageOptions options = ((WebImageOptions) (super.createDefaultImageOptions()));
        options.setStyleClass("reuise-avatar_image");
        return options;
    }

    protected WebBadgeOptions createDefaultBadgeOptions() {
        WebBadgeOptions options = ((WebBadgeOptions) (super.createDefaultBadgeOptions()));
        options.setStyleClass("reuise-avatar_badge");
        return options;
    }
}