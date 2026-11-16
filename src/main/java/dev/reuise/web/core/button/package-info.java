/**
 * Buttons and action layout.
 *
 * <p>Button appearance shortcuts are available on web buttons and their options:
 * {@code setBorder(false)} hides the border; {@code setBorder(true)} enables a
 * solid border using BorderWidth/BorderColor (default 1px/currentColor).
 * setBorder(String) accepts a CSS border shorthand. setBorderColor(String),
 * setBorderWidth(String) and setBorderRadius(String) configure colour, CSS
 * thickness and roundness. {@code setBackground(false)} suppresses colour and
 * images/gradients in every interaction state; setBackground(true) removes that
 * suppression while retaining the configured BackgroundColor.
 * setBackgroundColor(String) and setBackground(String) accept CSS colour and
 * shorthand values. Null clears that shortcut; blank values are rejected.
 * These settings are serialized and restored during explicit SSR hydration.
 *
 * <p>Web buttons use the shared style API for borders and backgrounds:
 * {@code button.getStyle().setBorder("none")} disables the border;
 * {@code setBorder("1px solid currentColor")} enables it. setBorderColor(String),
 * setBorderWidth(Object), setBorderStyle(String) and setBorderRadius(Object)
 * independently control colour, thickness, line style and roundness.
 * {@code button.getStyle().setBackgroundColor("transparent")} removes the
 * background colour; setBackgroundImage("none") also clears an image or gradient.
 * Use getStyle(Interaction.HOVER) or getStyle(Interaction.FOCUS) for interaction
 * styling. Removing a border or background does not remove the focus indicator.
 * Explicit background colours take precedence over local/document theme colours,
 * including after theme updates and SSR hydration.
 *
 * <p>ButtonBar is a FlexContainer specialization: a horizontal, vertically centered
 * row that wraps by default, using the shared 16-pixel spacing token. Add an existing
 * button with addButton(button), add a labelled button with addButton("Save"), or use
 * createButton("Save") to add one and obtain it for further configuration.
 * Button types, handlers and normal tab order are unchanged; this is not an ARIA toolbar.
 *
 * <p>Inherited Gap, RowGap, ColumnGap, Direction, Wrap, AlignItems and JustifyContent
 * options support the existing State/ScreenSize overloads. For example, setGap with
 * SpacingScale.value(8) and ScreenSize.EXTRA_SMALL, then SpacingScale.value(16) and
 * ScreenSize.MEDIUM. Override --reuise-space-16 on an ancestor to change the default.
 *
 * <p>Dialog.getFooter() is a ButtonBar, end-aligned by default. Accept/Cancel and
 * custom dialog actions share its gap and wrapping. Existing addAction/setActions APIs
 * remain available; changing custom actions preserves the built-in buttons and body.
 */
package dev.reuise.web.core.button;
