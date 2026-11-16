package dev.reuise.web.core.graphics.svg;

import dev.reuise.core.CoreComponent;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.button.WebIconButton;

/**
 * An individually referenced 24-by-24 SVG icon.
 *
 * <p>Use {@code SearchIcon.INSTANCE.create(factory)} for a decorative icon.
 * For an icon-only button, put that decorative SVG inside the button and set
 * the button's accessible name, or use {@link #createButton}, which requires
 * a non-blank label. Use {@link #createLabelled} only when the SVG itself conveys
 * meaning independently of a control or adjacent text.</p>
 *
 * <p>{@link BuiltinIconSize} supplies standard 16, 20 and 24 pixel sizes;
 * positive custom pixel sizes are also accepted.</p>
 *
 * <p>On the client, do not call {@code create} again for an SSR icon. Use
 * {@link #rehydrate} with a selector identifying the existing SVG and its
 * already-rehydrated parent, then attach it to the parent component. Both the
 * SVG and its path are associated with their existing DOM nodes.</p>
 */
public interface BuiltinIcon {
    int DEFAULT_SIZE = 24;

    String path();

    /** Filled icons use even-odd subpaths; line icons retain round 2px strokes. */
    default boolean isFilled() {
        return false;
    }

    default WebSvg create(WebComponentFactory factory) {
        return create(factory, DEFAULT_SIZE);
    }

    default WebSvg create(WebComponentFactory factory, int size) {
        return createIcon(factory, size, null);
    }

    default WebSvg create(WebComponentFactory factory, BuiltinIconSize size) {
        if (size == null) throw new IllegalArgumentException("size is required");
        return create(factory, size.getPixels());
    }

    default WebSvg createLabelled(WebComponentFactory factory, String label) {
        return createLabelled(factory, DEFAULT_SIZE, label);
    }

    default WebSvg createLabelled(WebComponentFactory factory, int size, String label) {
        if (label == null || label.trim().isEmpty())
            throw new IllegalArgumentException("A labelled icon needs a non-empty label");
        return createIcon(factory, size, label);
    }

    default WebSvg createLabelled(WebComponentFactory factory, BuiltinIconSize size, String label) {
        if (size == null) throw new IllegalArgumentException("size is required");
        return createLabelled(factory, size.getPixels(), label);
    }

    /** Creates a new non-submit icon-only button with a required accessible name. */
    default WebIconButton createButton(WebComponentFactory factory, String label) {
        return createButton(factory, DEFAULT_SIZE, label);
    }

    default WebIconButton createButton(WebComponentFactory factory, BuiltinIconSize size, String label) {
        if (size == null) throw new IllegalArgumentException("size is required");
        return createButton(factory, size.getPixels(), label);
    }

    default WebIconButton createButton(WebComponentFactory factory, int size, String label) {
        if (factory == null) throw new IllegalArgumentException("factory is required");
        if (size <= 0) throw new IllegalArgumentException("size must be positive");
        if (label == null || label.trim().isEmpty())
            throw new IllegalArgumentException("An icon button needs a non-empty label");
        WebIconButton button = factory.createIconButton(factory.createIconButtonOptions());
        button.setAttribute("type", "button");
        button.setAria("label", label);
        button.getIcon().setSize(size);
        button.getIcon().add(create(factory, size));
        return button;
    }

    default WebSvg createIcon(WebComponentFactory factory, int size, String label) {
        if (factory == null) throw new IllegalArgumentException("factory is required");
        if (size <= 0) throw new IllegalArgumentException("size must be positive");
        if (label != null && label.trim().isEmpty())
            throw new IllegalArgumentException("A labelled icon needs a non-empty label");
        WebSvg svg = factory.createSvg(factory.createSvgOptions());
        svg.setViewBox("0 0 24 24");
        svg.setAttribute("width", Integer.toString(size));
        svg.setAttribute("height", Integer.toString(size));
        svg.setAttribute("focusable", "false");
        if (label == null) {
            svg.setAttribute("aria-hidden", "true");
        } else {
            svg.setAttribute("role", "img");
            svg.setAria("label", label);
        }
        if (isFilled()) {
            svg.addFillPath(path(), "currentColor").setAttribute("fill-rule", "evenodd");
        } else {
            WebSvgPath path = svg.addStrokePath(path(), "currentColor", 2);
            path.setAttribute("stroke-linecap", "round");
            path.setAttribute("stroke-linejoin", "round");
        }
        return svg;
    }

    /**
     * Reassociates the SVG and its single path with existing server markup.
     * The selector must uniquely identify the icon within {@code parent}.
     */
    default WebSvg rehydrate(WebComponentFactory factory, String selector, CoreComponent parent) {
        if (factory == null || parent == null || selector == null || selector.trim().isEmpty())
            throw new IllegalArgumentException("factory, selector and parent are required");
        WebSvgOptions options = factory.createSvgOptions();
        options.setRehydration(selector, parent);
        WebSvg svg = factory.createSvg(options);
        if (!svg.isRehydrated())
            throw new IllegalStateException("Could not rehydrate icon: " + selector);
        WebSvgPathOptions pathOptions = factory.createSvgPathOptions();
        pathOptions.setRehydration("path", svg);
        WebSvgPath path = factory.createSvgPath(pathOptions);
        if (!path.isRehydrated())
            throw new IllegalStateException("Could not rehydrate icon path: " + selector);
        svg.add(path);
        return svg;
    }
}
