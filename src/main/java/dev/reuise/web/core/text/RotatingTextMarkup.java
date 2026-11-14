package dev.reuise.web.core.text;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import dev.reuise.core.HtmlEscaper;

/** Shared SSR and client markup. Items are overlaid so all contribute to the grid size. */
public final class RotatingTextMarkup {
    private static final String HEX = "#([0-9a-fA-F]{3,4}|[0-9a-fA-F]{6}|[0-9a-fA-F]{8})";
    private static final String FUNCTION = "(rgba?|hsla?|hwb|lab|lch|oklab|oklch|color|color-mix|light-dark|var)"
            + "\\([a-zA-Z0-9#.,%/+\\- ]*(\\([a-zA-Z0-9#.,%/+\\- ]*\\)[a-zA-Z0-9#.,%/+\\- ]*)*\\)";
    private static final Set<String> NAMED = new HashSet<>(Arrays.asList(("transparent currentcolor aliceblue "
            + "antiquewhite aqua aquamarine azure beige bisque black blanchedalmond blue blueviolet brown burlywood "
            + "cadetblue chartreuse chocolate coral cornflowerblue cornsilk crimson cyan darkblue darkcyan "
            + "darkgoldenrod darkgray darkgreen darkgrey darkkhaki darkmagenta darkolivegreen darkorange darkorchid "
            + "darkred darksalmon darkseagreen darkslateblue darkslategray darkslategrey darkturquoise darkviolet "
            + "deeppink deepskyblue dimgray dimgrey dodgerblue firebrick floralwhite forestgreen fuchsia gainsboro "
            + "ghostwhite gold goldenrod gray green greenyellow grey honeydew hotpink indianred indigo ivory khaki "
            + "lavender lavenderblush lawngreen lemonchiffon lightblue lightcoral lightcyan lightgoldenrodyellow "
            + "lightgray lightgreen lightgrey lightpink lightsalmon lightseagreen lightskyblue lightslategray "
            + "lightslategrey lightsteelblue lightyellow lime limegreen linen magenta maroon mediumaquamarine "
            + "mediumblue mediumorchid mediumpurple mediumseagreen mediumslateblue mediumspringgreen "
            + "mediumturquoise mediumvioletred midnightblue mintcream mistyrose moccasin navajowhite navy oldlace "
            + "olive olivedrab orange orangered orchid palegoldenrod palegreen paleturquoise palevioletred "
            + "papayawhip peachpuff peru pink plum powderblue purple rebeccapurple red rosybrown royalblue "
            + "saddlebrown salmon sandybrown seagreen seashell sienna silver skyblue slateblue slategray slategrey "
            + "snow springgreen steelblue tan teal thistle tomato turquoise violet wheat white whitesmoke yellow "
            + "yellowgreen").split(" ")));

    private RotatingTextMarkup() {}

    /**
     * Rejects colours outside the supported subset so mistakes are reported instead of being
     * silently ignored by the browser: hex, CSS named colours, or colour/var() functions.
     */
    public static void validate(List<Map<String, String>> items) {
        if (items == null) return;
        for (int i = 0; i < items.size(); i++) color(items.get(i), i);
    }

    public static boolean isSupportedColor(String color) {
        if (color == null) return false;
        String value = color.trim();
        return value.matches(HEX) || NAMED.contains(value.toLowerCase())
                || value.toLowerCase().matches(FUNCTION);
    }

    public static String render(List<Map<String, String>> items) {
        StringBuilder out = new StringBuilder();
        String first = items == null || items.isEmpty() ? "" : text(items.get(0));
        out.append("<span data-rotating-label style=\"position:absolute;width:1px;height:1px;padding:0;margin:-1px;overflow:hidden;clip:rect(0,0,0,0);white-space:nowrap;border:0\">")
                .append(HtmlEscaper.text(first)).append("</span>");
        out.append("<span aria-hidden=\"true\" data-rotating-items style=\"display:inline-grid;max-width:100%;overflow:hidden;vertical-align:baseline\">");
        if (items != null) {
            for (int i = 0; i < items.size(); i++) {
                Map<String, String> item = items.get(i);
                String color = color(item, i);
                out.append("<span data-rotating-item");
                if (color != null) out.append(" data-rotating-color=\"").append(HtmlEscaper.attribute(color)).append("\"");
                out.append(" style=\"grid-area:1/1;min-width:0;white-space:normal;overflow-wrap:anywhere;");
                if (i != 0) out.append("visibility:hidden;");
                if (color != null) out.append("color:").append(HtmlEscaper.attribute(color)).append(";");
                out.append("\">").append(HtmlEscaper.text(text(item))).append("</span>");
            }
        }
        return out.append("</span>").toString();
    }

    private static String text(Map<String, String> item) {
        return item == null || item.get("text") == null ? "" : item.get("text");
    }

    private static String color(Map<String, String> item, int index) {
        String color = item == null ? null : item.get("color");
        if (color == null || color.trim().isEmpty()) return null;
        if (!isSupportedColor(color))
            throw new IllegalArgumentException("Unsupported RotatingText color for item " + index + ": " + color);
        return color.trim();
    }
}