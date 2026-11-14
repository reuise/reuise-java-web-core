/**
 * Buttons and action layout.
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
