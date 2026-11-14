package dev.reuise.web.core.graphics.svg;

import dev.reuise.core.TextDirection;
import dev.reuise.web.core.WebComponentFactory;
import dev.reuise.web.core.button.WebIconButton;

/**
 * An icon whose meaning may follow reading direction. Mirroring is opt-in:
 * ordinary {@code create} and {@code createButton} remain physically oriented.
 * Pass an explicit LTR or RTL direction and update it when the locale changes.
 */
public interface DirectionalBuiltinIcon extends BuiltinIcon {
    default WebSvg createForDirection(WebComponentFactory factory, TextDirection direction) {
        return createForDirection(factory, DEFAULT_SIZE, direction);
    }

    default WebSvg createForDirection(WebComponentFactory factory, BuiltinIconSize size, TextDirection direction) {
        if (size == null) throw new IllegalArgumentException("size is required");
        return createForDirection(factory, size.getPixels(), direction);
    }

    default WebSvg createForDirection(WebComponentFactory factory, int size, TextDirection direction) {
        validateDirection(direction);
        WebSvg svg = create(factory, size);
        setDirection(svg, direction);
        return svg;
    }

    default WebSvg createLabelledForDirection(WebComponentFactory factory, int size, String label,
            TextDirection direction) {
        validateDirection(direction);
        WebSvg svg = createLabelled(factory, size, label);
        setDirection(svg, direction);
        return svg;
    }

    default WebIconButton createButtonForDirection(WebComponentFactory factory, int size, String label,
            TextDirection direction) {
        validateDirection(direction);
        if (factory == null) throw new IllegalArgumentException("factory is required");
        if (size <= 0) throw new IllegalArgumentException("size must be positive");
        if (label == null || label.trim().isEmpty())
            throw new IllegalArgumentException("An icon button needs a non-empty label");
        WebSvg svg = createForDirection(factory, size, direction);
        WebIconButton button = factory.createIconButton(factory.createIconButtonOptions());
        button.setAttribute("type", "button");
        button.setAria("label", label);
        button.getIcon().setSize(size);
        button.getIcon().add(svg);
        return button;
    }

    default WebIconButton createButtonForDirection(WebComponentFactory factory, BuiltinIconSize size,
            String label, TextDirection direction) {
        if (size == null) throw new IllegalArgumentException("size is required");
        return createButtonForDirection(factory, size.getPixels(), label, direction);
    }

    /**
     * Updates a previously created or rehydrated icon in place. AUTO is not an
     * explicit effective direction; resolve it before calling this method.
     */
    default void setDirection(WebSvg svg, TextDirection direction) {
        validateDirection(direction);
        if (svg == null || svg.getChildren().size() != 1 || !(svg.getChildren().get(0) instanceof WebSvgPath))
            throw new IllegalArgumentException("Expected a built-in icon SVG with its path attached");
        WebSvgPath path = (WebSvgPath) svg.getChildren().get(0);
        if (direction == TextDirection.RTL)
            path.setAttribute("transform", "translate(24 0) scale(-1 1)");
        else
            path.removeAttribute("transform");
    }

    static void validateDirection(TextDirection direction) {
        if (direction != TextDirection.LTR && direction != TextDirection.RTL)
            throw new IllegalArgumentException("An explicit LTR or RTL direction is required");
    }
}
