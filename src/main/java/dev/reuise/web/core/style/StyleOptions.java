package dev.reuise.web.core.style;
import dev.reuise.webstyles.Style;
import dev.reuise.webstyles.StyleProperty;
import dev.reuise.webstyles.StylePropertyValue;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
public class StyleOptions implements Style {
    private final Map<StyleProperty, StylePropertyValue> properties = new LinkedHashMap<StyleProperty, StylePropertyValue>();

    public StyleOptions() {
    }

    public Object getPropertyValue(StyleProperty property) {
        StylePropertyValue propertyValue = properties.get(property);
        if (propertyValue == null)
            return null;

        Object value = propertyValue.getValue();
        return value;
    }

    public StyleOptions setProperty(StyleProperty property, Object value, boolean priority) {
        StylePropertyValue propertyValue = properties.get(property);
        if (propertyValue == null) {
            propertyValue = new StylePropertyValue(property, value, priority);
            properties.put(property, propertyValue);
        } else {
            propertyValue.setValue(value);
            propertyValue.setPriority(priority);
        }
        return this;
    }

    @Override
    public boolean hasProperties() {
        return properties.size() != 0;
    }

    @Override
    public Map<StyleProperty, StylePropertyValue> getProperties() {
        return properties;
    }

    @Override
    public void append(Style other) {
        if (other == null)
            return;

        properties.putAll(other.getProperties());
    }

    @Override
    public String getCssText() {
        return String.join(";", properties.values().stream().map((StylePropertyValue p) -> p.getCssText()).collect(Collectors.toList()));
    }

    @Override
    public String getAlignContent() {
        Object alignContent = getPropertyValue(Style.ALIGN_CONTENT);
        if (alignContent == null)
            return null;

        return alignContent.toString();
    }

    @Override
    public StyleOptions setAlignContent(String alignContent) {
        return setAlignContent(alignContent, false);
    }

    @Override
    public StyleOptions setAlignContent(String alignContent, boolean important) {
        return setProperty(Style.ALIGN_CONTENT, alignContent, important);
    }

    @Override
    public String getAlignItems() {
        Object alignItems = getPropertyValue(Style.ALIGN_ITEMS);
        if (alignItems == null)
            return null;

        return alignItems.toString();
    }

    @Override
    public StyleOptions setAlignItems(String alignItems) {
        return setAlignItems(alignItems, false);
    }

    @Override
    public StyleOptions setAlignItems(String alignItems, boolean important) {
        return setProperty(Style.ALIGN_ITEMS, alignItems, important);
    }

    @Override
    public String getAlignSelf() {
        Object alignSelf = getPropertyValue(Style.ALIGN_SELF);
        if (alignSelf == null)
            return null;

        return alignSelf.toString();
    }

    @Override
    public StyleOptions setAlignSelf(String alignSelf) {
        return setAlignSelf(alignSelf, false);
    }

    @Override
    public StyleOptions setAlignSelf(String alignSelf, boolean important) {
        return setProperty(Style.ALIGN_SELF, alignSelf, important);
    }

    @Override
    public Object getAnimation() {
        Object animation = getPropertyValue(Style.ANIMATION);
        if (animation == null)
            return null;

        return animation.toString();
    }

    @Override
    public StyleOptions setAnimation(Object animation) {
        return setAnimation(animation, false);
    }

    @Override
    public StyleOptions setAnimation(Object animation, boolean important) {
        return setProperty(Style.ANIMATION, animation, important);
    }

    @Override
    public String getAnimationDelay() {
        Object animationDelay = getPropertyValue(Style.ANIMATION_DELAY);
        if (animationDelay == null)
            return null;

        return animationDelay.toString();
    }

    @Override
    public StyleOptions setAnimationDelay(String animationDelay) {
        return setAnimationDelay(animationDelay, false);
    }

    @Override
    public StyleOptions setAnimationDelay(String animationDelay, boolean important) {
        return setProperty(Style.ANIMATION_DELAY, animationDelay, important);
    }

    @Override
    public String getAnimationDirection() {
        Object animationDirection = getPropertyValue(Style.ANIMATION_DIRECTION);
        if (animationDirection == null)
            return null;

        return animationDirection.toString();
    }

    @Override
    public StyleOptions setAnimationDirection(String animationDirection) {
        return setAnimationDirection(animationDirection, false);
    }

    @Override
    public StyleOptions setAnimationDirection(String animationDirection, boolean important) {
        return setProperty(Style.ANIMATION_DIRECTION, animationDirection, important);
    }

    @Override
    public String getAnimationDuration() {
        Object animationDuration = getPropertyValue(Style.ANIMATION_DURATION);
        if (animationDuration == null)
            return null;

        return animationDuration.toString();
    }

    @Override
    public StyleOptions setAnimationDuration(String animationDuration) {
        return setAnimationDuration(animationDuration, false);
    }

    @Override
    public StyleOptions setAnimationDuration(String animationDuration, boolean important) {
        return setProperty(Style.ANIMATION_DURATION, animationDuration, important);
    }

    @Override
    public String getAnimationFillMode() {
        Object animationFillMode = getPropertyValue(Style.ANIMATION_FILL_MODE);
        if (animationFillMode == null)
            return null;

        return animationFillMode.toString();
    }

    @Override
    public StyleOptions setAnimationFillMode(String animationFillMode) {
        return setAnimationFillMode(animationFillMode, false);
    }

    @Override
    public StyleOptions setAnimationFillMode(String animationFillMode, boolean important) {
        return setProperty(Style.ANIMATION_FILL_MODE, animationFillMode, important);
    }

    @Override
    public Object getAnimationIterationCount() {
        Object animationIterationCount = getPropertyValue(Style.ANIMATION_ITERATION_COUNT);
        if (animationIterationCount == null)
            return null;

        return animationIterationCount.toString();
    }

    @Override
    public StyleOptions setAnimationIterationCount(Object animationIterationCount) {
        return setAnimationIterationCount(animationIterationCount, false);
    }

    @Override
    public StyleOptions setAnimationIterationCount(Object animationIterationCount, boolean important) {
        return setProperty(Style.ANIMATION_ITERATION_COUNT, animationIterationCount, important);
    }

    @Override
    public String getAnimationName() {
        Object animationName = getPropertyValue(Style.ANIMATION_NAME);
        if (animationName == null)
            return null;

        return animationName.toString();
    }

    @Override
    public StyleOptions setAnimationName(String animationName) {
        return setAnimationName(animationName, false);
    }

    @Override
    public StyleOptions setAnimationName(String animationName, boolean important) {
        return setProperty(Style.ANIMATION_NAME, animationName, important);
    }

    @Override
    public String getAnimationPlayState() {
        Object animationPlayState = getPropertyValue(Style.ANIMATION_PLAY_STATE);
        if (animationPlayState == null)
            return null;

        return animationPlayState.toString();
    }

    @Override
    public StyleOptions setAnimationPlayState(String animationPlayState) {
        return setAnimationPlayState(animationPlayState, false);
    }

    @Override
    public StyleOptions setAnimationPlayState(String animationPlayState, boolean important) {
        return setProperty(Style.ANIMATION_PLAY_STATE, animationPlayState, important);
    }

    @Override
    public String getAnimationTimingFunction() {
        Object animationTimingFunction = getPropertyValue(Style.ANIMATION_TIMING_FUNCTION);
        if (animationTimingFunction == null)
            return null;

        return animationTimingFunction.toString();
    }

    @Override
    public StyleOptions setAnimationTimingFunction(String animationTimingFunction) {
        return setAnimationTimingFunction(animationTimingFunction, false);
    }

    @Override
    public StyleOptions setAnimationTimingFunction(String animationTimingFunction, boolean important) {
        return setProperty(Style.ANIMATION_TIMING_FUNCTION, animationTimingFunction, important);
    }

    @Override
    public String getAzimuth() {
        Object azimuth = getPropertyValue(Style.AZIMUTH);
        if (azimuth == null)
            return null;

        return azimuth.toString();
    }

    @Override
    public StyleOptions setAzimuth(String azimuth) {
        return setAzimuth(azimuth, false);
    }

    @Override
    public StyleOptions setAzimuth(String azimuth, boolean important) {
        return setProperty(Style.AZIMUTH, azimuth, important);
    }

    @Override
    public String getBackdropFilter() {
        Object backdropFilter = getPropertyValue(Style.BACKDROP_FILTER);
        if (backdropFilter == null)
            return null;

        return backdropFilter.toString();
    }

    @Override
    public StyleOptions setBackdropFilter(String backdropFilter) {
        return setBackdropFilter(backdropFilter, false);
    }

    @Override
    public StyleOptions setBackdropFilter(String backdropFilter, boolean important) {
        return setProperty(Style.BACKDROP_FILTER, backdropFilter, important);
    }

    @Override
    public String getBackfaceVisibility() {
        Object backfaceVisibility = getPropertyValue(Style.BACKFACE_VISIBILITY);
        if (backfaceVisibility == null)
            return null;

        return backfaceVisibility.toString();
    }

    @Override
    public StyleOptions setBackfaceVisibility(String backfaceVisibility) {
        return setBackfaceVisibility(backfaceVisibility, false);
    }

    @Override
    public StyleOptions setBackfaceVisibility(String backfaceVisibility, boolean important) {
        return setProperty(Style.BACKFACE_VISIBILITY, backfaceVisibility, important);
    }

    @Override
    public String getBackground() {
        Object background = getPropertyValue(Style.BACKGROUND);
        if (background == null)
            return null;

        return background.toString();
    }

    @Override
    public StyleOptions setBackground(String background) {
        return setBackground(background, false);
    }

    @Override
    public StyleOptions setBackground(String background, boolean important) {
        return setProperty(Style.BACKGROUND, background, important);
    }

    @Override
    public String getBackgroundAttachment() {
        Object backgroundAttachment = getPropertyValue(Style.BACKGROUND_ATTACHMENT);
        if (backgroundAttachment == null)
            return null;

        return backgroundAttachment.toString();
    }

    @Override
    public StyleOptions setBackgroundAttachment(String backgroundAttachment) {
        return setBackgroundAttachment(backgroundAttachment, false);
    }

    @Override
    public StyleOptions setBackgroundAttachment(String backgroundAttachment, boolean important) {
        return setProperty(Style.BACKGROUND_ATTACHMENT, backgroundAttachment, important);
    }

    @Override
    public String getBackgroundColor() {
        Object backgroundColor = getPropertyValue(Style.BACKGROUND_COLOR);
        if (backgroundColor == null)
            return null;

        return backgroundColor.toString();
    }

    @Override
    public StyleOptions setBackgroundColor(String backgroundColor) {
        return setBackgroundColor(backgroundColor, false);
    }

    @Override
    public StyleOptions setBackgroundColor(String backgroundColor, boolean important) {
        return setProperty(Style.BACKGROUND_COLOR, backgroundColor, important);
    }

    @Override
    public String getBackgroundImage() {
        Object backgroundImage = getPropertyValue(Style.BACKGROUND_IMAGE);
        if (backgroundImage == null)
            return null;

        return backgroundImage.toString();
    }

    @Override
    public StyleOptions setBackgroundImage(String backgroundImage) {
        return setBackgroundImage(backgroundImage, false);
    }

    @Override
    public StyleOptions setBackgroundImage(String backgroundImage, boolean important) {
        return setProperty(Style.BACKGROUND_IMAGE, backgroundImage, important);
    }

    @Override
    public String getBackgroundPosition() {
        Object backgroundPosition = getPropertyValue(Style.BACKGROUND_POSITION);
        if (backgroundPosition == null)
            return null;

        return backgroundPosition.toString();
    }

    @Override
    public StyleOptions setBackgroundPosition(String backgroundPosition) {
        return setBackgroundPosition(backgroundPosition, false);
    }

    @Override
    public StyleOptions setBackgroundPosition(String backgroundPosition, boolean important) {
        return setProperty(Style.BACKGROUND_POSITION, backgroundPosition, important);
    }

    @Override
    public String getBackgroundRepeat() {
        Object backgroundRepeat = getPropertyValue(Style.BACKGROUND_REPEAT);
        if (backgroundRepeat == null)
            return null;

        return backgroundRepeat.toString();
    }

    @Override
    public StyleOptions setBackgroundRepeat(String backgroundRepeat) {
        return setBackgroundRepeat(backgroundRepeat, false);
    }

    @Override
    public StyleOptions setBackgroundRepeat(String backgroundRepeat, boolean important) {
        return setProperty(Style.BACKGROUND_REPEAT, backgroundRepeat, important);
    }

    @Override
    public String getBackgroundSize() {
        Object backgroundSize = getPropertyValue(Style.BACKGROUND_SIZE);
        if (backgroundSize == null)
            return null;

        return backgroundSize.toString();
    }

    @Override
    public StyleOptions setBackgroundSize(String backgroundSize) {
        return setBackgroundSize(backgroundSize, false);
    }

    @Override
    public StyleOptions setBackgroundSize(String backgroundSize, boolean important) {
        return setProperty(Style.BACKGROUND_SIZE, backgroundSize, important);
    }

    @Override
    public String getInset() {
        Object inset = getPropertyValue(Style.INSET);
        if (inset == null)
            return null;

        return inset.toString();
    }

    @Override
    public StyleOptions setInset(String inset) {
        return setInset(inset, false);
    }

    @Override
    public StyleOptions setInset(String inset, boolean important) {
        return setProperty(Style.INSET, inset, important);
    }

    @Override
    public String getBorder() {
        Object border = getPropertyValue(Style.BORDER);
        if (border == null)
            return null;

        return border.toString();
    }

    @Override
    public StyleOptions setBorder(String border) {
        return setBorder(border, false);
    }

    @Override
    public StyleOptions setBorder(String border, boolean important) {
        return setProperty(Style.BORDER, border, important);
    }

    @Override
    public String getBorderBottom() {
        Object borderBottom = getPropertyValue(Style.BORDER_BOTTOM);
        if (borderBottom == null)
            return null;

        return borderBottom.toString();
    }

    @Override
    public StyleOptions setBorderBottom(String borderBottom) {
        return setBorderBottom(borderBottom, false);
    }

    @Override
    public StyleOptions setBorderBottom(String borderBottom, boolean important) {
        return setProperty(Style.BORDER_BOTTOM, borderBottom, important);
    }

    @Override
    public String getBorderBottomColor() {
        Object borderBottomColor = getPropertyValue(Style.BORDER_BOTTOM_COLOR);
        if (borderBottomColor == null)
            return null;

        return borderBottomColor.toString();
    }

    @Override
    public StyleOptions setBorderBottomColor(String borderBottomColor) {
        return setBorderBottomColor(borderBottomColor, false);
    }

    @Override
    public StyleOptions setBorderBottomColor(String borderBottomColor, boolean important) {
        return setProperty(Style.BORDER_BOTTOM_COLOR, borderBottomColor, important);
    }

    @Override
    public Object getBorderBottomLeftRadius() {
        Object borderBottomLeftRadius = getPropertyValue(Style.BORDER_BOTTOM_LEFT_RADIUS);
        if (borderBottomLeftRadius == null)
            return null;

        return borderBottomLeftRadius.toString();
    }

    @Override
    public StyleOptions setBorderBottomLeftRadius(Object borderBottomLeftRadius) {
        return setBorderBottomLeftRadius(borderBottomLeftRadius, false);
    }

    @Override
    public StyleOptions setBorderBottomLeftRadius(Object borderBottomLeftRadius, boolean important) {
        return setProperty(Style.BORDER_BOTTOM_LEFT_RADIUS, borderBottomLeftRadius, important);
    }

    @Override
    public Object getBorderBottomRightRadius() {
        Object borderBottomRightRadius = getPropertyValue(Style.BORDER_BOTTOM_RIGHT_RADIUS);
        if (borderBottomRightRadius == null)
            return null;

        return borderBottomRightRadius.toString();
    }

    @Override
    public StyleOptions setBorderBottomRightRadius(Object borderBottomRightRadius) {
        return setBorderBottomRightRadius(borderBottomRightRadius, false);
    }

    @Override
    public StyleOptions setBorderBottomRightRadius(Object borderBottomRightRadius, boolean important) {
        return setProperty(Style.BORDER_BOTTOM_RIGHT_RADIUS, borderBottomRightRadius, important);
    }

    @Override
    public String getBorderBottomStyle() {
        Object borderBottomStyle = getPropertyValue(Style.BORDER_BOTTOM_STYLE);
        if (borderBottomStyle == null)
            return null;

        return borderBottomStyle.toString();
    }

    @Override
    public StyleOptions setBorderBottomStyle(String borderBottomStyle) {
        return setBorderBottomStyle(borderBottomStyle, false);
    }

    @Override
    public StyleOptions setBorderBottomStyle(String borderBottomStyle, boolean important) {
        return setProperty(Style.BORDER_BOTTOM_STYLE, borderBottomStyle, important);
    }

    @Override
    public Object getBorderBottomWidth() {
        Object borderBottomWidth = getPropertyValue(Style.BORDER_BOTTOM_WIDTH);
        if (borderBottomWidth == null)
            return null;

        return borderBottomWidth.toString();
    }

    @Override
    public StyleOptions setBorderBottomWidth(Object borderBottomWidth) {
        return setBorderBottomWidth(borderBottomWidth, false);
    }

    @Override
    public StyleOptions setBorderBottomWidth(Object borderBottomWidth, boolean important) {
        return setProperty(Style.BORDER_BOTTOM_WIDTH, borderBottomWidth, important);
    }

    @Override
    public String getBorderCollapse() {
        Object borderCollapse = getPropertyValue(Style.BORDER_COLLAPSE);
        if (borderCollapse == null)
            return null;

        return borderCollapse.toString();
    }

    @Override
    public StyleOptions setBorderCollapse(String borderCollapse) {
        return setBorderCollapse(borderCollapse, false);
    }

    @Override
    public StyleOptions setBorderCollapse(String borderCollapse, boolean important) {
        return setProperty(Style.BORDER_COLLAPSE, borderCollapse, important);
    }

    @Override
    public String getBorderColor() {
        Object borderColor = getPropertyValue(Style.BORDER_COLOR);
        if (borderColor == null)
            return null;

        return borderColor.toString();
    }

    @Override
    public StyleOptions setBorderColor(String borderColor) {
        return setBorderColor(borderColor, false);
    }

    @Override
    public StyleOptions setBorderColor(String borderColor, boolean important) {
        return setProperty(Style.BORDER_COLOR, borderColor, important);
    }

    @Override
    public String getBorderImage() {
        Object borderImage = getPropertyValue(Style.BORDER_IMAGE);
        if (borderImage == null)
            return null;

        return borderImage.toString();
    }

    @Override
    public StyleOptions setBorderImage(String borderImage) {
        return setBorderImage(borderImage, false);
    }

    @Override
    public StyleOptions setBorderImage(String borderImage, boolean important) {
        return setProperty(Style.BORDER_IMAGE, borderImage, important);
    }

    @Override
    public Object getBorderImageOutset() {
        Object borderImageOutset = getPropertyValue(Style.BORDER_IMAGE_OUTSET);
        if (borderImageOutset == null)
            return null;

        return borderImageOutset.toString();
    }

    @Override
    public StyleOptions setBorderImageOutset(Object borderImageOutset) {
        return setBorderImageOutset(borderImageOutset, false);
    }

    @Override
    public StyleOptions setBorderImageOutset(Object borderImageOutset, boolean important) {
        return setProperty(Style.BORDER_IMAGE_OUTSET, borderImageOutset, important);
    }

    @Override
    public String getBorderImageRepeat() {
        Object borderImageRepeat = getPropertyValue(Style.BORDER_IMAGE_REPEAT);
        if (borderImageRepeat == null)
            return null;

        return borderImageRepeat.toString();
    }

    @Override
    public StyleOptions setBorderImageRepeat(String borderImageRepeat) {
        return setBorderImageRepeat(borderImageRepeat, false);
    }

    @Override
    public StyleOptions setBorderImageRepeat(String borderImageRepeat, boolean important) {
        return setProperty(Style.BORDER_IMAGE_REPEAT, borderImageRepeat, important);
    }

    @Override
    public Object getBorderImageSlice() {
        Object borderImageSlice = getPropertyValue(Style.BORDER_IMAGE_SLICE);
        if (borderImageSlice == null)
            return null;

        return borderImageSlice.toString();
    }

    @Override
    public StyleOptions setBorderImageSlice(Object borderImageSlice) {
        return setBorderImageSlice(borderImageSlice, false);
    }

    @Override
    public StyleOptions setBorderImageSlice(Object borderImageSlice, boolean important) {
        return setProperty(Style.BORDER_IMAGE_SLICE, borderImageSlice, important);
    }

    @Override
    public String getBorderImageSource() {
        Object borderImageSource = getPropertyValue(Style.BORDER_IMAGE_SOURCE);
        if (borderImageSource == null)
            return null;

        return borderImageSource.toString();
    }

    @Override
    public StyleOptions setBorderImageSource(String borderImageSource) {
        return setBorderImageSource(borderImageSource, false);
    }

    @Override
    public StyleOptions setBorderImageSource(String borderImageSource, boolean important) {
        return setProperty(Style.BORDER_IMAGE_SOURCE, borderImageSource, important);
    }

    @Override
    public Object getBorderImageWidth() {
        Object borderImageWidth = getPropertyValue(Style.BORDER_IMAGE_WIDTH);
        if (borderImageWidth == null)
            return null;

        return borderImageWidth.toString();
    }

    @Override
    public StyleOptions setBorderImageWidth(Object borderImageWidth) {
        return setBorderImageWidth(borderImageWidth, false);
    }

    @Override
    public StyleOptions setBorderImageWidth(Object borderImageWidth, boolean important) {
        return setProperty(Style.BORDER_IMAGE_WIDTH, borderImageWidth, important);
    }

    @Override
    public String getBorderLeft() {
        Object borderLeft = getPropertyValue(Style.BORDER_LEFT);
        if (borderLeft == null)
            return null;

        return borderLeft.toString();
    }

    @Override
    public StyleOptions setBorderLeft(String borderLeft) {
        return setBorderLeft(borderLeft, false);
    }

    @Override
    public StyleOptions setBorderLeft(String borderLeft, boolean important) {
        return setProperty(Style.BORDER_LEFT, borderLeft, important);
    }

    @Override
    public String getBorderLeftColor() {
        Object borderLeftColor = getPropertyValue(Style.BORDER_LEFT_COLOR);
        if (borderLeftColor == null)
            return null;

        return borderLeftColor.toString();
    }

    @Override
    public StyleOptions setBorderLeftColor(String borderLeftColor) {
        return setBorderLeftColor(borderLeftColor, false);
    }

    @Override
    public StyleOptions setBorderLeftColor(String borderLeftColor, boolean important) {
        return setProperty(Style.BORDER_LEFT_COLOR, borderLeftColor, important);
    }

    @Override
    public String getBorderLeftStyle() {
        Object borderLeftStyle = getPropertyValue(Style.BORDER_LEFT_STYLE);
        if (borderLeftStyle == null)
            return null;

        return borderLeftStyle.toString();
    }

    @Override
    public StyleOptions setBorderLeftStyle(String borderLeftStyle) {
        return setBorderLeftStyle(borderLeftStyle, false);
    }

    @Override
    public StyleOptions setBorderLeftStyle(String borderLeftStyle, boolean important) {
        return setProperty(Style.BORDER_LEFT_STYLE, borderLeftStyle, important);
    }

    @Override
    public Object getBorderLeftWidth() {
        Object borderLeftWidth = getPropertyValue(Style.BORDER_LEFT_WIDTH);
        if (borderLeftWidth == null)
            return null;

        return borderLeftWidth.toString();
    }

    @Override
    public StyleOptions setBorderLeftWidth(Object borderLeftWidth) {
        return setBorderLeftWidth(borderLeftWidth, false);
    }

    @Override
    public StyleOptions setBorderLeftWidth(Object borderLeftWidth, boolean important) {
        return setProperty(Style.BORDER_LEFT_WIDTH, borderLeftWidth, important);
    }

    @Override
    public Object getBorderRadius() {
        Object borderRadius = getPropertyValue(Style.BORDER_RADIUS);
        if (borderRadius == null)
            return null;

        return borderRadius.toString();
    }

    @Override
    public StyleOptions setBorderRadius(Object borderRadius) {
        return setBorderRadius(borderRadius, false);
    }

    @Override
    public StyleOptions setBorderRadius(Object borderRadius, boolean important) {
        return setProperty(Style.BORDER_RADIUS, borderRadius, important);
    }

    @Override
    public String getBorderRight() {
        Object borderRight = getPropertyValue(Style.BORDER_RIGHT);
        if (borderRight == null)
            return null;

        return borderRight.toString();
    }

    @Override
    public StyleOptions setBorderRight(String borderRight) {
        return setBorderRight(borderRight, false);
    }

    @Override
    public StyleOptions setBorderRight(String borderRight, boolean important) {
        return setProperty(Style.BORDER_RIGHT, borderRight, important);
    }

    @Override
    public String getBorderRightColor() {
        Object borderRightColor = getPropertyValue(Style.BORDER_RIGHT_COLOR);
        if (borderRightColor == null)
            return null;

        return borderRightColor.toString();
    }

    @Override
    public StyleOptions setBorderRightColor(String borderRightColor) {
        return setBorderRightColor(borderRightColor, false);
    }

    @Override
    public StyleOptions setBorderRightColor(String borderRightColor, boolean important) {
        return setProperty(Style.BORDER_RIGHT_COLOR, borderRightColor, important);
    }

    @Override
    public String getBorderRightStyle() {
        Object borderRightStyle = getPropertyValue(Style.BORDER_RIGHT_STYLE);
        if (borderRightStyle == null)
            return null;

        return borderRightStyle.toString();
    }

    @Override
    public StyleOptions setBorderRightStyle(String borderRightStyle) {
        return setBorderRightStyle(borderRightStyle, false);
    }

    @Override
    public StyleOptions setBorderRightStyle(String borderRightStyle, boolean important) {
        return setProperty(Style.BORDER_RIGHT_STYLE, borderRightStyle, important);
    }

    @Override
    public Object getBorderRightWidth() {
        Object borderRightWidth = getPropertyValue(Style.BORDER_RIGHT_WIDTH);
        if (borderRightWidth == null)
            return null;

        return borderRightWidth.toString();
    }

    @Override
    public StyleOptions setBorderRightWidth(Object borderRightWidth) {
        return setBorderRightWidth(borderRightWidth, false);
    }

    @Override
    public StyleOptions setBorderRightWidth(Object borderRightWidth, boolean important) {
        return setProperty(Style.BORDER_RIGHT_WIDTH, borderRightWidth, important);
    }

    @Override
    public String getBorderSpacing() {
        Object borderSpacing = getPropertyValue(Style.BORDER_SPACING);
        if (borderSpacing == null)
            return null;

        return borderSpacing.toString();
    }

    @Override
    public StyleOptions setBorderSpacing(String borderSpacing) {
        return setBorderSpacing(borderSpacing, false);
    }

    @Override
    public StyleOptions setBorderSpacing(String borderSpacing, boolean important) {
        return setProperty(Style.BORDER_SPACING, borderSpacing, important);
    }

    @Override
    public String getBorderStyle() {
        Object borderStyle = getPropertyValue(Style.BORDER_STYLE);
        if (borderStyle == null)
            return null;

        return borderStyle.toString();
    }

    @Override
    public StyleOptions setBorderStyle(String borderStyle) {
        return setBorderStyle(borderStyle, false);
    }

    @Override
    public StyleOptions setBorderStyle(String borderStyle, boolean important) {
        return setProperty(Style.BORDER_STYLE, borderStyle, important);
    }

    @Override
    public String getBorderTop() {
        Object borderTop = getPropertyValue(Style.BORDER_TOP);
        if (borderTop == null)
            return null;

        return borderTop.toString();
    }

    @Override
    public StyleOptions setBorderTop(String borderTop) {
        return setBorderTop(borderTop, false);
    }

    @Override
    public StyleOptions setBorderTop(String borderTop, boolean important) {
        return setProperty(Style.BORDER_TOP, borderTop, important);
    }

    @Override
    public String getBorderTopColor() {
        Object borderTopColor = getPropertyValue(Style.BORDER_TOP_COLOR);
        if (borderTopColor == null)
            return null;

        return borderTopColor.toString();
    }

    @Override
    public StyleOptions setBorderTopColor(String borderTopColor) {
        return setBorderTopColor(borderTopColor, false);
    }

    @Override
    public StyleOptions setBorderTopColor(String borderTopColor, boolean important) {
        return setProperty(Style.BORDER_TOP_COLOR, borderTopColor, important);
    }

    @Override
    public Object getBorderTopLeftRadius() {
        Object borderTopLeftRadius = getPropertyValue(Style.BORDER_TOP_LEFT_RADIUS);
        if (borderTopLeftRadius == null)
            return null;

        return borderTopLeftRadius.toString();
    }

    @Override
    public StyleOptions setBorderTopLeftRadius(Object borderTopLeftRadius) {
        return setBorderTopLeftRadius(borderTopLeftRadius, false);
    }

    @Override
    public StyleOptions setBorderTopLeftRadius(Object borderTopLeftRadius, boolean important) {
        return setProperty(Style.BORDER_TOP_LEFT_RADIUS, borderTopLeftRadius, important);
    }

    @Override
    public Object getBorderTopRightRadius() {
        Object borderTopRightRadius = getPropertyValue(Style.BORDER_TOP_RIGHT_RADIUS);
        if (borderTopRightRadius == null)
            return null;

        return borderTopRightRadius.toString();
    }

    @Override
    public StyleOptions setBorderTopRightRadius(Object borderTopRightRadius) {
        return setBorderTopRightRadius(borderTopRightRadius, false);
    }

    @Override
    public StyleOptions setBorderTopRightRadius(Object borderTopRightRadius, boolean important) {
        return setProperty(Style.BORDER_TOP_RIGHT_RADIUS, borderTopRightRadius, important);
    }

    @Override
    public String getBorderTopStyle() {
        Object borderTopStyle = getPropertyValue(Style.BORDER_TOP_STYLE);
        if (borderTopStyle == null)
            return null;

        return borderTopStyle.toString();
    }

    @Override
    public StyleOptions setBorderTopStyle(String borderTopStyle) {
        return setBorderTopStyle(borderTopStyle, false);
    }

    @Override
    public StyleOptions setBorderTopStyle(String borderTopStyle, boolean important) {
        return setProperty(Style.BORDER_TOP_STYLE, borderTopStyle, important);
    }

    @Override
    public Object getBorderTopWidth() {
        Object borderTopWidth = getPropertyValue(Style.BORDER_TOP_WIDTH);
        if (borderTopWidth == null)
            return null;

        return borderTopWidth.toString();
    }

    @Override
    public StyleOptions setBorderTopWidth(Object borderTopWidth) {
        return setBorderTopWidth(borderTopWidth, false);
    }

    @Override
    public StyleOptions setBorderTopWidth(Object borderTopWidth, boolean important) {
        return setProperty(Style.BORDER_TOP_WIDTH, borderTopWidth, important);
    }

    @Override
    public Object getBorderWidth() {
        Object borderWidth = getPropertyValue(Style.BORDER_WIDTH);
        if (borderWidth == null)
            return null;

        return borderWidth.toString();
    }

    @Override
    public StyleOptions setBorderWidth(Object borderWidth) {
        return setBorderWidth(borderWidth, false);
    }

    @Override
    public StyleOptions setBorderWidth(Object borderWidth, boolean important) {
        return setProperty(Style.BORDER_WIDTH, borderWidth, important);
    }

    @Override
    public Object getBottom() {
        Object bottom = getPropertyValue(Style.BOTTOM);
        if (bottom == null)
            return null;

        return bottom.toString();
    }

    @Override
    public StyleOptions setBottom(Object bottom) {
        return setBottom(bottom, false);
    }

    @Override
    public StyleOptions setBottom(Object bottom, boolean important) {
        return setProperty(Style.BOTTOM, bottom, important);
    }

    @Override
    public String getBoxShadow() {
        Object boxShadow = getPropertyValue(Style.BOX_SHADOW);
        if (boxShadow == null)
            return null;

        return boxShadow.toString();
    }

    @Override
    public StyleOptions setBoxShadow(String boxShadow) {
        return setBoxShadow(boxShadow, false);
    }

    @Override
    public StyleOptions setBoxShadow(String boxShadow, boolean important) {
        return setProperty(Style.BOX_SHADOW, boxShadow, important);
    }

    @Override
    public String getBoxSizing() {
        Object boxSizing = getPropertyValue(Style.BOX_SIZING);
        if (boxSizing == null)
            return null;

        return boxSizing.toString();
    }

    @Override
    public StyleOptions setBoxSizing(String boxSizing) {
        return setBoxSizing(boxSizing, false);
    }

    @Override
    public StyleOptions setBoxSizing(String boxSizing, boolean important) {
        return setProperty(Style.BOX_SIZING, boxSizing, important);
    }

    @Override
    public String getCaptionSide() {
        Object captionSide = getPropertyValue(Style.CAPTION_SIDE);
        if (captionSide == null)
            return null;

        return captionSide.toString();
    }

    @Override
    public StyleOptions setCaptionSide(String captionSide) {
        return setCaptionSide(captionSide, false);
    }

    @Override
    public StyleOptions setCaptionSide(String captionSide, boolean important) {
        return setProperty(Style.CAPTION_SIDE, captionSide, important);
    }

    @Override
    public String getClear() {
        Object clear = getPropertyValue(Style.CLEAR);
        if (clear == null)
            return null;

        return clear.toString();
    }

    @Override
    public StyleOptions setClear(String clear) {
        return setClear(clear, false);
    }

    @Override
    public StyleOptions setClear(String clear, boolean important) {
        return setProperty(Style.CLEAR, clear, important);
    }

    @Override
    public String getClip() {
        Object clip = getPropertyValue(Style.CLIP);
        if (clip == null)
            return null;

        return clip.toString();
    }

    @Override
    public StyleOptions setClip(String clip) {
        return setClip(clip, false);
    }

    @Override
    public StyleOptions setClip(String clip, boolean important) {
        return setProperty(Style.CLIP, clip, important);
    }

    @Override
    public String getClipPath() {
        Object clipPath = getPropertyValue(Style.CLIP_PATH);
        if (clipPath == null)
            return null;

        return clipPath.toString();
    }

    @Override
    public StyleOptions setClipPath(String clipPath) {
        return setClipPath(clipPath, false);
    }

    @Override
    public StyleOptions setClipPath(String clipPath, boolean important) {
        return setProperty(Style.CLIP_PATH, clipPath, important);
    }

    @Override
    public String getColor() {
        Object color = getPropertyValue(Style.COLOR);
        if (color == null)
            return null;

        return color.toString();
    }

    @Override
    public StyleOptions setColor(String color) {
        return setColor(color, false);
    }

    @Override
    public StyleOptions setColor(String color, boolean important) {
        return setProperty(Style.COLOR, color, important);
    }

    @Override
    public String getContain() {
        Object contain = getPropertyValue(Style.CONTAIN);
        if (contain == null)
            return null;

        return contain.toString();
    }

    @Override
    public StyleOptions setContain(String contain) {
        return setContain(contain, false);
    }

    @Override
    public StyleOptions setContain(String contain, boolean important) {
        return setProperty(Style.CONTAIN, contain, important);
    }

    @Override
    public String getContent() {
        Object content = getPropertyValue(Style.CONTENT);
        if (content == null)
            return null;

        return content.toString();
    }

    @Override
    public StyleOptions setContent(String content) {
        return setContent(content, false);
    }

    @Override
    public StyleOptions setContent(String content, boolean important) {
        return setProperty(Style.CONTENT, content, important);
    }

    @Override
    public String getContentVisibility() {
        Object contentVisibility = getPropertyValue(Style.CONTENT_VISIBILITY);
        if (contentVisibility == null)
            return null;

        return contentVisibility.toString();
    }

    @Override
    public StyleOptions setContentVisibility(String contentVisibility) {
        return setContentVisibility(contentVisibility, false);
    }

    @Override
    public StyleOptions setContentVisibility(String contentVisibility, boolean important) {
        return setProperty(Style.CONTENT_VISIBILITY, contentVisibility, important);
    }

    @Override
    public String getCounterIncrement() {
        Object counterIncrement = getPropertyValue(Style.COUNTER_INCREMENT);
        if (counterIncrement == null)
            return null;

        return counterIncrement.toString();
    }

    @Override
    public StyleOptions setCounterIncrement(String counterIncrement) {
        return setCounterIncrement(counterIncrement, false);
    }

    @Override
    public StyleOptions setCounterIncrement(String counterIncrement, boolean important) {
        return setProperty(Style.COUNTER_INCREMENT, counterIncrement, important);
    }

    @Override
    public String getCounterReset() {
        Object counterReset = getPropertyValue(Style.COUNTER_RESET);
        if (counterReset == null)
            return null;

        return counterReset.toString();
    }

    @Override
    public StyleOptions setCounterReset(String counterReset) {
        return setCounterReset(counterReset, false);
    }

    @Override
    public StyleOptions setCounterReset(String counterReset, boolean important) {
        return setProperty(Style.COUNTER_RESET, counterReset, important);
    }

    @Override
    public String getCssFloat() {
        Object cssFloat = getPropertyValue(Style.CSS_FLOAT);
        if (cssFloat == null)
            return null;

        return cssFloat.toString();
    }

    @Override
    public StyleOptions setCssFloat(String cssFloat) {
        return setCssFloat(cssFloat, false);
    }

    @Override
    public StyleOptions setCssFloat(String cssFloat, boolean important) {
        return setProperty(Style.CSS_FLOAT, cssFloat, important);
    }

    @Override
    public String getCursor() {
        Object cursor = getPropertyValue(Style.CURSOR);
        if (cursor == null)
            return null;

        return cursor.toString();
    }

    @Override
    public StyleOptions setCursor(String cursor) {
        return setCursor(cursor, false);
    }

    @Override
    public StyleOptions setCursor(String cursor, boolean important) {
        return setProperty(Style.CURSOR, cursor, important);
    }

    @Override
    public String getDirection() {
        Object direction = getPropertyValue(Style.DIRECTION);
        if (direction == null)
            return null;

        return direction.toString();
    }

    @Override
    public StyleOptions setDirection(String direction) {
        return setDirection(direction, false);
    }

    @Override
    public StyleOptions setDirection(String direction, boolean important) {
        return setProperty(Style.DIRECTION, direction, important);
    }

    @Override
    public String getDisplay() {
        Object display = getPropertyValue(Style.DISPLAY);
        if (display == null)
            return null;

        return display.toString();
    }

    @Override
    public StyleOptions setDisplay(String display) {
        return setDisplay(display, false);
    }

    @Override
    public StyleOptions setDisplay(String display, boolean important) {
        return setProperty(Style.DISPLAY, display, important);
    }

    @Override
    public String getEmptyCells() {
        Object emptyCells = getPropertyValue(Style.EMPTY_CELLS);
        if (emptyCells == null)
            return null;

        return emptyCells.toString();
    }

    @Override
    public StyleOptions setEmptyCells(String emptyCells) {
        return setEmptyCells(emptyCells, false);
    }

    @Override
    public StyleOptions setEmptyCells(String emptyCells, boolean important) {
        return setProperty(Style.EMPTY_CELLS, emptyCells, important);
    }

    @Override
    public String getFlex() {
        Object flex = getPropertyValue(Style.FLEX);
        if (flex == null)
            return null;

        return flex.toString();
    }

    @Override
    public StyleOptions setFlex(String flex) {
        return setFlex(flex, false);
    }

    @Override
    public StyleOptions setFlex(String flex, boolean important) {
        return setProperty(Style.FLEX, flex, important);
    }

    @Override
    public String getFlexBasis() {
        Object flexBasis = getPropertyValue(Style.FLEX_BASIS);
        if (flexBasis == null)
            return null;

        return flexBasis.toString();
    }

    @Override
    public StyleOptions setFlexBasis(String flexBasis) {
        return setFlexBasis(flexBasis, false);
    }

    @Override
    public StyleOptions setFlexBasis(String flexBasis, boolean important) {
        return setProperty(Style.FLEX_BASIS, flexBasis, important);
    }

    @Override
    public String getFlexDirection() {
        Object flexDirection = getPropertyValue(Style.FLEX_DIRECTION);
        if (flexDirection == null)
            return null;

        return flexDirection.toString();
    }

    @Override
    public StyleOptions setFlexDirection(String flexDirection) {
        return setFlexDirection(flexDirection, false);
    }

    @Override
    public StyleOptions setFlexDirection(String flexDirection, boolean important) {
        return setProperty(Style.FLEX_DIRECTION, flexDirection, important);
    }

    @Override
    public String getFlexFlow() {
        Object flexFlow = getPropertyValue(Style.FLEX_FLOW);
        if (flexFlow == null)
            return null;

        return flexFlow.toString();
    }

    @Override
    public StyleOptions setFlexFlow(String flexFlow) {
        return setFlexFlow(flexFlow, false);
    }

    @Override
    public StyleOptions setFlexFlow(String flexFlow, boolean important) {
        return setProperty(Style.FLEX_FLOW, flexFlow, important);
    }

    @Override
    public double getFlexGrow() {
        Object flexGrow = getPropertyValue(Style.FLEX_GROW);
        if (flexGrow == null)
            return 0;

        return ((Number) (flexGrow)).doubleValue();
    }

    @Override
    public StyleOptions setFlexGrow(double flexGrow) {
        return setFlexGrow(flexGrow, false);
    }

    @Override
    public StyleOptions setFlexGrow(double flexGrow, boolean important) {
        return setProperty(Style.FLEX_GROW, flexGrow, important);
    }

    @Override
    public double getFlexShrink() {
        Object flexShrink = getPropertyValue(Style.FLEX_SHRINK);
        if (flexShrink == null)
            return 0;

        return ((Number) (flexShrink)).doubleValue();
    }

    @Override
    public StyleOptions setFlexShrink(double flexShrink) {
        return setFlexShrink(flexShrink, false);
    }

    @Override
    public StyleOptions setFlexShrink(double flexShrink, boolean important) {
        return setProperty(Style.FLEX_SHRINK, flexShrink, important);
    }

    @Override
    public String getFlexWrap() {
        Object flexWrap = getPropertyValue(Style.FLEX_WRAP);
        if (flexWrap == null)
            return null;

        return flexWrap.toString();
    }

    @Override
    public StyleOptions setFlexWrap(String flexWrap) {
        return setFlexWrap(flexWrap, false);
    }

    @Override
    public StyleOptions setFlexWrap(String flexWrap, boolean important) {
        return setProperty(Style.FLEX_WRAP, flexWrap, important);
    }

    @Override
    public String getFont() {
        Object font = getPropertyValue(Style.FONT);
        if (font == null)
            return null;

        return font.toString();
    }

    @Override
    public StyleOptions setFont(String font) {
        return setFont(font, false);
    }

    @Override
    public StyleOptions setFont(String font, boolean important) {
        return setProperty(Style.FONT, font, important);
    }

    @Override
    public String getFontFamily() {
        Object fontFamily = getPropertyValue(Style.FONT_FAMILY);
        if (fontFamily == null)
            return null;

        return fontFamily.toString();
    }

    @Override
    public StyleOptions setFontFamily(String fontFamily) {
        return setFontFamily(fontFamily, false);
    }

    @Override
    public StyleOptions setFontFamily(String fontFamily, boolean important) {
        return setProperty(Style.FONT_FAMILY, fontFamily, important);
    }

    @Override
    public Object getFontSize() {
        Object fontSize = getPropertyValue(Style.FONT_SIZE);
        if (fontSize == null)
            return null;

        return fontSize.toString();
    }

    @Override
    public StyleOptions setFontSize(Object fontSize) {
        return setFontSize(fontSize, false);
    }

    @Override
    public StyleOptions setFontSize(Object fontSize, boolean important) {
        return setProperty(Style.FONT_SIZE, fontSize, important);
    }

    @Override
    public String getFontSizeAdjust() {
        Object fontSizeAdjust = getPropertyValue(Style.FONT_SIZE_ADJUST);
        if (fontSizeAdjust == null)
            return null;

        return fontSizeAdjust.toString();
    }

    @Override
    public StyleOptions setFontSizeAdjust(String fontSizeAdjust) {
        return setFontSizeAdjust(fontSizeAdjust, false);
    }

    @Override
    public StyleOptions setFontSizeAdjust(String fontSizeAdjust, boolean important) {
        return setProperty(Style.FONT_SIZE_ADJUST, fontSizeAdjust, important);
    }

    @Override
    public String getFontStretch() {
        Object fontStretch = getPropertyValue(Style.FONT_STRETCH);
        if (fontStretch == null)
            return null;

        return fontStretch.toString();
    }

    @Override
    public StyleOptions setFontStretch(String fontStretch) {
        return setFontStretch(fontStretch, false);
    }

    @Override
    public StyleOptions setFontStretch(String fontStretch, boolean important) {
        return setProperty(Style.FONT_STRETCH, fontStretch, important);
    }

    @Override
    public String getFontStyle() {
        Object fontStyle = getPropertyValue(Style.FONT_STYLE);
        if (fontStyle == null)
            return null;

        return fontStyle.toString();
    }

    @Override
    public StyleOptions setFontStyle(String fontStyle) {
        return setFontStyle(fontStyle, false);
    }

    @Override
    public StyleOptions setFontStyle(String fontStyle, boolean important) {
        return setProperty(Style.FONT_STYLE, fontStyle, important);
    }

    @Override
    public String getFontVariant() {
        Object fontVariant = getPropertyValue(Style.FONT_VARIANT);
        if (fontVariant == null)
            return null;

        return fontVariant.toString();
    }

    @Override
    public StyleOptions setFontVariant(String fontVariant) {
        return setFontVariant(fontVariant, false);
    }

    @Override
    public StyleOptions setFontVariant(String fontVariant, boolean important) {
        return setProperty(Style.FONT_VARIANT, fontVariant, important);
    }

    @Override
    public String getFontWeight() {
        Object fontWeight = getPropertyValue(Style.FONT_WEIGHT);
        if (fontWeight == null)
            return null;

        return fontWeight.toString();
    }

    @Override
    public StyleOptions setFontWeight(String fontWeight) {
        return setFontWeight(fontWeight, false);
    }

    @Override
    public StyleOptions setFontWeight(String fontWeight, boolean important) {
        return setProperty(Style.FONT_WEIGHT, fontWeight, important);
    }

    @Override
    public String getGrid() {
        Object grid = getPropertyValue(Style.GRID);
        if (grid == null)
            return null;

        return grid.toString();
    }

    @Override
    public StyleOptions setGrid(String grid) {
        return setGrid(grid, false);
    }

    @Override
    public StyleOptions setGrid(String grid, boolean important) {
        return setProperty(Style.GRID, grid, important);
    }

    @Override
    public String getGridArea() {
        Object gridArea = getPropertyValue(Style.GRID_AREA);
        if (gridArea == null)
            return null;

        return gridArea.toString();
    }

    @Override
    public StyleOptions setGridArea(String gridArea) {
        return setGridArea(gridArea, false);
    }

    @Override
    public StyleOptions setGridArea(String gridArea, boolean important) {
        return setProperty(Style.GRID_AREA, gridArea, important);
    }

    @Override
    public String getGridAutoColumns() {
        Object gridAutoColumns = getPropertyValue(Style.GRID_AUTO_COLUMNS);
        if (gridAutoColumns == null)
            return null;

        return gridAutoColumns.toString();
    }

    @Override
    public StyleOptions setGridAutoColumns(String gridAutoColumns) {
        return setGridAutoColumns(gridAutoColumns, false);
    }

    @Override
    public StyleOptions setGridAutoColumns(String gridAutoColumns, boolean important) {
        return setProperty(Style.GRID_AUTO_COLUMNS, gridAutoColumns, important);
    }

    @Override
    public String getGridAutoRows() {
        Object gridAutoRows = getPropertyValue(Style.GRID_AUTO_ROWS);
        if (gridAutoRows == null)
            return null;

        return gridAutoRows.toString();
    }

    @Override
    public StyleOptions setGridAutoRows(String gridAutoRows) {
        return setGridAutoRows(gridAutoRows, false);
    }

    @Override
    public StyleOptions setGridAutoRows(String gridAutoRows, boolean important) {
        return setProperty(Style.GRID_AUTO_ROWS, gridAutoRows, important);
    }

    @Override
    public String getGridColumn() {
        Object gridColumn = getPropertyValue(Style.GRID_COLUMN);
        if (gridColumn == null)
            return null;

        return gridColumn.toString();
    }

    @Override
    public StyleOptions setGridColumn(String gridColumn) {
        return setGridColumn(gridColumn, false);
    }

    @Override
    public StyleOptions setGridColumn(String gridColumn, boolean important) {
        return setProperty(Style.GRID_COLUMN, gridColumn, important);
    }

    @Override
    public String getGridColumnEnd() {
        Object gridColumnEnd = getPropertyValue(Style.GRID_COLUMN_END);
        if (gridColumnEnd == null)
            return null;

        return gridColumnEnd.toString();
    }

    @Override
    public StyleOptions setGridColumnEnd(String gridColumnEnd) {
        return setGridColumnEnd(gridColumnEnd, false);
    }

    @Override
    public StyleOptions setGridColumnEnd(String gridColumnEnd, boolean important) {
        return setProperty(Style.GRID_COLUMN_END, gridColumnEnd, important);
    }

    @Override
    public String getGridColumnStart() {
        Object gridColumnStart = getPropertyValue(Style.GRID_COLUMN_START);
        if (gridColumnStart == null)
            return null;

        return gridColumnStart.toString();
    }

    @Override
    public StyleOptions setGridColumnStart(String gridColumnStart) {
        return setGridColumnStart(gridColumnStart, false);
    }

    @Override
    public StyleOptions setGridColumnStart(String gridColumnStart, boolean important) {
        return setProperty(Style.GRID_COLUMN_START, gridColumnStart, important);
    }

    @Override
    public String getGridRow() {
        Object gridRow = getPropertyValue(Style.GRID_ROW);
        if (gridRow == null)
            return null;

        return gridRow.toString();
    }

    @Override
    public StyleOptions setGridRow(String gridRow) {
        return setGridRow(gridRow, false);
    }

    @Override
    public StyleOptions setGridRow(String gridRow, boolean important) {
        return setProperty(Style.GRID_ROW, gridRow, important);
    }

    @Override
    public String getGridRowEnd() {
        Object gridRowEnd = getPropertyValue(Style.GRID_ROW_END);
        if (gridRowEnd == null)
            return null;

        return gridRowEnd.toString();
    }

    @Override
    public StyleOptions setGridRowEnd(String gridRowEnd) {
        return setGridRowEnd(gridRowEnd, false);
    }

    @Override
    public StyleOptions setGridRowEnd(String gridRowEnd, boolean important) {
        return setProperty(Style.GRID_ROW_END, gridRowEnd, important);
    }

    @Override
    public String getGridRowStart() {
        Object gridRowStart = getPropertyValue(Style.GRID_ROW_START);
        if (gridRowStart == null)
            return null;

        return gridRowStart.toString();
    }

    @Override
    public StyleOptions setGridRowStart(String gridRowStart) {
        return setGridRowStart(gridRowStart, false);
    }

    @Override
    public StyleOptions setGridRowStart(String gridRowStart, boolean important) {
        return setProperty(Style.GRID_ROW_START, gridRowStart, important);
    }

    @Override
    public String getGridTemplate() {
        Object gridTemplate = getPropertyValue(Style.GRID_TEMPLATE);
        if (gridTemplate == null)
            return null;

        return gridTemplate.toString();
    }

    @Override
    public StyleOptions setGridTemplate(String gridTemplate) {
        return setGridTemplate(gridTemplate, false);
    }

    @Override
    public StyleOptions setGridTemplate(String gridTemplate, boolean important) {
        return setProperty(Style.GRID_TEMPLATE, gridTemplate, important);
    }

    @Override
    public String getGridTemplateAreas() {
        Object gridTemplateAreas = getPropertyValue(Style.GRID_TEMPLATE_AREAS);
        if (gridTemplateAreas == null)
            return null;

        return gridTemplateAreas.toString();
    }

    @Override
    public StyleOptions setGridTemplateAreas(String gridTemplateAreas) {
        return setGridTemplateAreas(gridTemplateAreas, false);
    }

    @Override
    public StyleOptions setGridTemplateAreas(String gridTemplateAreas, boolean important) {
        return setProperty(Style.GRID_TEMPLATE_AREAS, gridTemplateAreas, important);
    }

    @Override
    public String getGridTemplateColumns() {
        Object gridTemplateColumns = getPropertyValue(Style.GRID_TEMPLATE_COLUMNS);
        if (gridTemplateColumns == null)
            return null;

        return gridTemplateColumns.toString();
    }

    @Override
    public StyleOptions setGridTemplateColumns(String gridTemplateColumns) {
        return setGridTemplateColumns(gridTemplateColumns, false);
    }

    @Override
    public StyleOptions setGridTemplateColumns(String gridTemplateColumns, boolean important) {
        return setProperty(Style.GRID_TEMPLATE_COLUMNS, gridTemplateColumns, important);
    }

    @Override
    public String getGridTemplateRows() {
        Object gridTemplateRows = getPropertyValue(Style.GRID_TEMPLATE_ROWS);
        if (gridTemplateRows == null)
            return null;

        return gridTemplateRows.toString();
    }

    @Override
    public StyleOptions setGridTemplateRows(String gridTemplateRows) {
        return setGridTemplateRows(gridTemplateRows, false);
    }

    @Override
    public StyleOptions setGridTemplateRows(String gridTemplateRows, boolean important) {
        return setProperty(Style.GRID_TEMPLATE_ROWS, gridTemplateRows, important);
    }

    @Override
    public Object getHeight() {
        Object height = getPropertyValue(Style.HEIGHT);
        if (height == null)
            return null;

        return height.toString();
    }

    @Override
    public StyleOptions setHeight(Object height) {
        return setHeight(height, false);
    }

    @Override
    public StyleOptions setHeight(Object height, boolean important) {
        return setProperty(Style.HEIGHT, height, important);
    }

    @Override
    public String getJustifyContent() {
        Object justifyContent = getPropertyValue(Style.JUSTIFY_CONTENT);
        if (justifyContent == null)
            return null;

        return justifyContent.toString();
    }

    @Override
    public StyleOptions setJustifyContent(String justifyContent) {
        return setJustifyContent(justifyContent, false);
    }

    @Override
    public StyleOptions setJustifyContent(String justifyContent, boolean important) {
        return setProperty(Style.JUSTIFY_CONTENT, justifyContent, important);
    }

    @Override
    public Object getLeft() {
        Object left = getPropertyValue(Style.LEFT);
        if (left == null)
            return null;

        return left.toString();
    }

    @Override
    public StyleOptions setLeft(Object left) {
        return setLeft(left, false);
    }

    @Override
    public StyleOptions setLeft(Object left, boolean important) {
        return setProperty(Style.LEFT, left, important);
    }

    @Override
    public String getLetterSpacing() {
        Object letterSpacing = getPropertyValue(Style.LETTER_SPACING);
        if (letterSpacing == null)
            return null;

        return letterSpacing.toString();
    }

    @Override
    public StyleOptions setLetterSpacing(String letterSpacing) {
        return setLetterSpacing(letterSpacing, false);
    }

    @Override
    public StyleOptions setLetterSpacing(String letterSpacing, boolean important) {
        return setProperty(Style.LETTER_SPACING, letterSpacing, important);
    }

    @Override
    public Object getLineHeight() {
        Object lineHeight = getPropertyValue(Style.LINE_HEIGHT);
        if (lineHeight == null)
            return null;

        return lineHeight.toString();
    }

    @Override
    public StyleOptions setLineHeight(Object lineHeight) {
        return setLineHeight(lineHeight, false);
    }

    @Override
    public StyleOptions setLineHeight(Object lineHeight, boolean important) {
        return setProperty(Style.LINE_HEIGHT, lineHeight, important);
    }

    @Override
    public String getListStyle() {
        Object listStyle = getPropertyValue(Style.LIST_STYLE);
        if (listStyle == null)
            return null;

        return listStyle.toString();
    }

    @Override
    public StyleOptions setListStyle(String listStyle) {
        return setListStyle(listStyle, false);
    }

    @Override
    public StyleOptions setListStyle(String listStyle, boolean important) {
        return setProperty(Style.LIST_STYLE, listStyle, important);
    }

    @Override
    public String getListStyleImage() {
        Object listStyleImage = getPropertyValue(Style.LIST_STYLE_IMAGE);
        if (listStyleImage == null)
            return null;

        return listStyleImage.toString();
    }

    @Override
    public StyleOptions setListStyleImage(String listStyleImage) {
        return setListStyleImage(listStyleImage, false);
    }

    @Override
    public StyleOptions setListStyleImage(String listStyleImage, boolean important) {
        return setProperty(Style.LIST_STYLE_IMAGE, listStyleImage, important);
    }

    @Override
    public String getListStylePosition() {
        Object listStylePosition = getPropertyValue(Style.LIST_STYLE_POSITION);
        if (listStylePosition == null)
            return null;

        return listStylePosition.toString();
    }

    @Override
    public StyleOptions setListStylePosition(String listStylePosition) {
        return setListStylePosition(listStylePosition, false);
    }

    @Override
    public StyleOptions setListStylePosition(String listStylePosition, boolean important) {
        return setProperty(Style.LIST_STYLE_POSITION, listStylePosition, important);
    }

    @Override
    public String getListStyleType() {
        Object listStyleType = getPropertyValue(Style.LIST_STYLE_TYPE);
        if (listStyleType == null)
            return null;

        return listStyleType.toString();
    }

    @Override
    public StyleOptions setListStyleType(String listStyleType) {
        return setListStyleType(listStyleType, false);
    }

    @Override
    public StyleOptions setListStyleType(String listStyleType, boolean important) {
        return setProperty(Style.LIST_STYLE_TYPE, listStyleType, important);
    }

    @Override
    public Object getMargin() {
        Object margin = getPropertyValue(Style.MARGIN);
        if (margin == null)
            return null;

        return margin.toString();
    }

    @Override
    public StyleOptions setMargin(Object margin) {
        return setMargin(margin, false);
    }

    @Override
    public StyleOptions setMargin(Object margin, boolean important) {
        return setProperty(Style.MARGIN, margin, important);
    }

    @Override
    public Object getMarginBottom() {
        Object marginBottom = getPropertyValue(Style.MARGIN_BOTTOM);
        if (marginBottom == null)
            return null;

        return marginBottom.toString();
    }

    @Override
    public StyleOptions setMarginBottom(Object marginBottom) {
        return setMarginBottom(marginBottom, false);
    }

    @Override
    public StyleOptions setMarginBottom(Object marginBottom, boolean important) {
        return setProperty(Style.MARGIN_BOTTOM, marginBottom, important);
    }

    @Override
    public Object getMarginLeft() {
        Object marginLeft = getPropertyValue(Style.MARGIN_LEFT);
        if (marginLeft == null)
            return null;

        return marginLeft.toString();
    }

    @Override
    public StyleOptions setMarginLeft(Object marginLeft) {
        return setMarginLeft(marginLeft, false);
    }

    @Override
    public StyleOptions setMarginLeft(Object marginLeft, boolean important) {
        return setProperty(Style.MARGIN_LEFT, marginLeft, important);
    }

    @Override
    public Object getMarginRight() {
        Object marginRight = getPropertyValue(Style.MARGIN_RIGHT);
        if (marginRight == null)
            return null;

        return marginRight.toString();
    }

    @Override
    public StyleOptions setMarginRight(Object marginRight) {
        return setMarginRight(marginRight, false);
    }

    @Override
    public StyleOptions setMarginRight(Object marginRight, boolean important) {
        return setProperty(Style.MARGIN_RIGHT, marginRight, important);
    }

    @Override
    public Object getMarginTop() {
        Object marginTop = getPropertyValue(Style.MARGIN_TOP);
        if (marginTop == null)
            return null;

        return marginTop.toString();
    }

    @Override
    public StyleOptions setMarginTop(Object marginTop) {
        return setMarginTop(marginTop, false);
    }

    @Override
    public StyleOptions setMarginTop(Object marginTop, boolean important) {
        return setProperty(Style.MARGIN_TOP, marginTop, important);
    }

    @Override
    public Object getMaxHeight() {
        Object maxHeight = getPropertyValue(Style.MAX_HEIGHT);
        if (maxHeight == null)
            return null;

        return maxHeight.toString();
    }

    @Override
    public StyleOptions setMaxHeight(Object maxHeight) {
        return setMaxHeight(maxHeight, false);
    }

    @Override
    public StyleOptions setMaxHeight(Object maxHeight, boolean important) {
        return setProperty(Style.MAX_HEIGHT, maxHeight, important);
    }

    @Override
    public Object getMaxWidth() {
        Object maxWidth = getPropertyValue(Style.MAX_WIDTH);
        if (maxWidth == null)
            return null;

        return maxWidth.toString();
    }

    @Override
    public StyleOptions setMaxWidth(Object maxWidth) {
        return setMaxWidth(maxWidth, false);
    }

    @Override
    public StyleOptions setMaxWidth(Object maxWidth, boolean important) {
        return setProperty(Style.MAX_WIDTH, maxWidth, important);
    }

    @Override
    public Object getMinHeight() {
        Object minHeight = getPropertyValue(Style.MIN_HEIGHT);
        if (minHeight == null)
            return null;

        return minHeight.toString();
    }

    @Override
    public StyleOptions setMinHeight(Object minHeight) {
        return setMinHeight(minHeight, false);
    }

    @Override
    public StyleOptions setMinHeight(Object minHeight, boolean important) {
        return setProperty(Style.MIN_HEIGHT, minHeight, important);
    }

    @Override
    public Object getMinWidth() {
        Object minWidth = getPropertyValue(Style.MIN_WIDTH);
        if (minWidth == null)
            return null;

        return minWidth.toString();
    }

    @Override
    public StyleOptions setMinWidth(Object minWidth) {
        return setMinWidth(minWidth, false);
    }

    @Override
    public StyleOptions setMinWidth(Object minWidth, boolean important) {
        return setProperty(Style.MIN_WIDTH, minWidth, important);
    }

    @Override
    public String getObjectFit() {
        Object objectFit = getPropertyValue(Style.OBJECT_FIT);
        if (objectFit == null)
            return null;

        return objectFit.toString();
    }

    @Override
    public StyleOptions setObjectFit(String objectFit) {
        return setObjectFit(objectFit, false);
    }

    @Override
    public StyleOptions setObjectFit(String objectFit, boolean important) {
        return setProperty(Style.OBJECT_FIT, objectFit, important);
    }

    @Override
    public String getObjectPosition() {
        Object objectPosition = getPropertyValue(Style.OBJECT_POSITION);
        if (objectPosition == null)
            return null;

        return objectPosition.toString();
    }

    @Override
    public StyleOptions setObjectPosition(String objectPosition) {
        return setObjectPosition(objectPosition, false);
    }

    @Override
    public StyleOptions setObjectPosition(String objectPosition, boolean important) {
        return setProperty(Style.OBJECT_POSITION, objectPosition, important);
    }

    @Override
    public Object getOpacity() {
        Object opacity = getPropertyValue(Style.OPACITY);
        if (opacity == null)
            return null;

        return opacity.toString();
    }

    @Override
    public StyleOptions setOpacity(Object opacity) {
        return setOpacity(opacity, false);
    }

    @Override
    public StyleOptions setOpacity(Object opacity, boolean important) {
        return setProperty(Style.OPACITY, opacity, important);
    }

    @Override
    public int getOrder() {
        Object order = getPropertyValue(Style.ORDER);
        if (order == null)
            return 0;

        return ((Number) (order)).intValue();
    }

    @Override
    public StyleOptions setOrder(int order) {
        return setOrder(order, false);
    }

    @Override
    public StyleOptions setOrder(int order, boolean important) {
        return setProperty(Style.ORDER, order, important);
    }

    @Override
    public String getOrphans() {
        Object orphans = getPropertyValue(Style.ORPHANS);
        if (orphans == null)
            return null;

        return orphans.toString();
    }

    @Override
    public StyleOptions setOrphans(String orphans) {
        return setOrphans(orphans, false);
    }

    @Override
    public StyleOptions setOrphans(String orphans, boolean important) {
        return setProperty(Style.ORPHANS, orphans, important);
    }

    @Override
    public String getOutline() {
        Object outline = getPropertyValue(Style.OUTLINE);
        if (outline == null)
            return null;

        return outline.toString();
    }

    @Override
    public StyleOptions setOutline(String outline) {
        return setOutline(outline, false);
    }

    @Override
    public StyleOptions setOutline(String outline, boolean important) {
        return setProperty(Style.OUTLINE, outline, important);
    }

    @Override
    public String getOutlineColor() {
        Object outlineColor = getPropertyValue(Style.OUTLINE_COLOR);
        if (outlineColor == null)
            return null;

        return outlineColor.toString();
    }

    @Override
    public StyleOptions setOutlineColor(String outlineColor) {
        return setOutlineColor(outlineColor, false);
    }

    @Override
    public StyleOptions setOutlineColor(String outlineColor, boolean important) {
        return setProperty(Style.OUTLINE_COLOR, outlineColor, important);
    }

    @Override
    public String getOutlineOffset() {
        Object outlineOffset = getPropertyValue(Style.OUTLINE_OFFSET);
        if (outlineOffset == null)
            return null;

        return outlineOffset.toString();
    }

    @Override
    public StyleOptions setOutlineOffset(String outlineOffset) {
        return setOutlineOffset(outlineOffset, false);
    }

    @Override
    public StyleOptions setOutlineOffset(String outlineOffset, boolean important) {
        return setProperty(Style.OUTLINE_OFFSET, outlineOffset, important);
    }

    @Override
    public String getOutlineStyle() {
        Object outlineStyle = getPropertyValue(Style.OUTLINE_STYLE);
        if (outlineStyle == null)
            return null;

        return outlineStyle.toString();
    }

    @Override
    public StyleOptions setOutlineStyle(String outlineStyle) {
        return setOutlineStyle(outlineStyle, false);
    }

    @Override
    public StyleOptions setOutlineStyle(String outlineStyle, boolean important) {
        return setProperty(Style.OUTLINE_STYLE, outlineStyle, important);
    }

    @Override
    public Object getOutlineWidth() {
        Object outlineWidth = getPropertyValue(Style.OUTLINE_WIDTH);
        if (outlineWidth == null)
            return null;

        return outlineWidth.toString();
    }

    @Override
    public StyleOptions setOutlineWidth(Object outlineWidth) {
        return setOutlineWidth(outlineWidth, false);
    }

    @Override
    public StyleOptions setOutlineWidth(Object outlineWidth, boolean important) {
        return setProperty(Style.OUTLINE_WIDTH, outlineWidth, important);
    }

    @Override
    public String getOverflow() {
        Object overflow = getPropertyValue(Style.OVERFLOW);
        if (overflow == null)
            return null;

        return overflow.toString();
    }

    @Override
    public StyleOptions setOverflow(String overflow) {
        return setOverflow(overflow, false);
    }

    @Override
    public StyleOptions setOverflow(String overflow, boolean important) {
        return setProperty(Style.OVERFLOW, overflow, important);
    }

    @Override
    public Object getPadding() {
        Object padding = getPropertyValue(Style.PADDING);
        if (padding == null)
            return null;

        return padding.toString();
    }

    @Override
    public StyleOptions setPadding(Object padding) {
        return setPadding(padding, false);
    }

    @Override
    public StyleOptions setPadding(Object padding, boolean important) {
        return setProperty(Style.PADDING, padding, important);
    }

    @Override
    public Object getPaddingBottom() {
        Object paddingBottom = getPropertyValue(Style.PADDING_BOTTOM);
        if (paddingBottom == null)
            return null;

        return paddingBottom.toString();
    }

    @Override
    public StyleOptions setPaddingBottom(Object paddingBottom) {
        return setPaddingBottom(paddingBottom, false);
    }

    @Override
    public StyleOptions setPaddingBottom(Object paddingBottom, boolean important) {
        return setProperty(Style.PADDING_BOTTOM, paddingBottom, important);
    }

    @Override
    public Object getPaddingLeft() {
        Object paddingLeft = getPropertyValue(Style.PADDING_LEFT);
        if (paddingLeft == null)
            return null;

        return paddingLeft.toString();
    }

    @Override
    public StyleOptions setPaddingLeft(Object paddingLeft) {
        return setPaddingLeft(paddingLeft, false);
    }

    @Override
    public StyleOptions setPaddingLeft(Object paddingLeft, boolean important) {
        return setProperty(Style.PADDING_LEFT, paddingLeft, important);
    }

    @Override
    public Object getPaddingRight() {
        Object paddingRight = getPropertyValue(Style.PADDING_RIGHT);
        if (paddingRight == null)
            return null;

        return paddingRight.toString();
    }

    @Override
    public StyleOptions setPaddingRight(Object paddingRight) {
        return setPaddingRight(paddingRight, false);
    }

    @Override
    public StyleOptions setPaddingRight(Object paddingRight, boolean important) {
        return setProperty(Style.PADDING_RIGHT, paddingRight, important);
    }

    @Override
    public Object getPaddingTop() {
        Object paddingTop = getPropertyValue(Style.PADDING_TOP);
        if (paddingTop == null)
            return null;

        return paddingTop.toString();
    }

    @Override
    public StyleOptions setPaddingTop(Object paddingTop) {
        return setPaddingTop(paddingTop, false);
    }

    @Override
    public StyleOptions setPaddingTop(Object paddingTop, boolean important) {
        return setProperty(Style.PADDING_TOP, paddingTop, important);
    }

    @Override
    public String getPage() {
        Object page = getPropertyValue(Style.PAGE);
        if (page == null)
            return null;

        return page.toString();
    }

    @Override
    public StyleOptions setPage(String page) {
        return setPage(page, false);
    }

    @Override
    public StyleOptions setPage(String page, boolean important) {
        return setProperty(Style.PAGE, page, important);
    }

    @Override
    public String getPageBreakAfter() {
        Object pageBreakAfter = getPropertyValue(Style.PAGE_BREAK_AFTER);
        if (pageBreakAfter == null)
            return null;

        return pageBreakAfter.toString();
    }

    @Override
    public StyleOptions setPageBreakAfter(String pageBreakAfter) {
        return setPageBreakAfter(pageBreakAfter, false);
    }

    @Override
    public StyleOptions setPageBreakAfter(String pageBreakAfter, boolean important) {
        return setProperty(Style.PAGE_BREAK_AFTER, pageBreakAfter, important);
    }

    @Override
    public String getPageBreakBefore() {
        Object pageBreakBefore = getPropertyValue(Style.PAGE_BREAK_BEFORE);
        if (pageBreakBefore == null)
            return null;

        return pageBreakBefore.toString();
    }

    @Override
    public StyleOptions setPageBreakBefore(String pageBreakBefore) {
        return setPageBreakBefore(pageBreakBefore, false);
    }

    @Override
    public StyleOptions setPageBreakBefore(String pageBreakBefore, boolean important) {
        return setProperty(Style.PAGE_BREAK_BEFORE, pageBreakBefore, important);
    }

    @Override
    public String getPageBreakInside() {
        Object pageBreakInside = getPropertyValue(Style.PAGE_BREAK_INSIDE);
        if (pageBreakInside == null)
            return null;

        return pageBreakInside.toString();
    }

    @Override
    public StyleOptions setPageBreakInside(String pageBreakInside) {
        return setPageBreakInside(pageBreakInside, false);
    }

    @Override
    public StyleOptions setPageBreakInside(String pageBreakInside, boolean important) {
        return setProperty(Style.PAGE_BREAK_INSIDE, pageBreakInside, important);
    }

    @Override
    public String getPerspective() {
        Object perspective = getPropertyValue(Style.PERSPECTIVE);
        if (perspective == null)
            return null;

        return perspective.toString();
    }

    @Override
    public StyleOptions setPerspective(String perspective) {
        return setPerspective(perspective, false);
    }

    @Override
    public StyleOptions setPerspective(String perspective, boolean important) {
        return setProperty(Style.PERSPECTIVE, perspective, important);
    }

    @Override
    public Object getPerspectiveOrigin() {
        Object perspectiveOrigin = getPropertyValue(Style.PERSPECTIVE_ORIGIN);
        if (perspectiveOrigin == null)
            return null;

        return perspectiveOrigin.toString();
    }

    @Override
    public StyleOptions setPerspectiveOrigin(Object perspectiveOrigin) {
        return setPerspectiveOrigin(perspectiveOrigin, false);
    }

    @Override
    public StyleOptions setPerspectiveOrigin(Object perspectiveOrigin, boolean important) {
        return setProperty(Style.PERSPECTIVE_ORIGIN, perspectiveOrigin, important);
    }

    @Override
    public String getPointerEvents() {
        Object pointerEvents = getPropertyValue(Style.POINTER_EVENTS);
        if (pointerEvents == null)
            return null;

        return pointerEvents.toString();
    }

    @Override
    public StyleOptions setPointerEvents(String pointerEvents) {
        return setPointerEvents(pointerEvents, false);
    }

    @Override
    public StyleOptions setPointerEvents(String pointerEvents, boolean important) {
        return setProperty(Style.POINTER_EVENTS, pointerEvents, important);
    }

    @Override
    public String getPosition() {
        Object position = getPropertyValue(Style.POSITION);
        if (position == null)
            return null;

        return position.toString();
    }

    @Override
    public StyleOptions setPosition(String position) {
        return setPosition(position, false);
    }

    @Override
    public StyleOptions setPosition(String position, boolean important) {
        return setProperty(Style.POSITION, position, important);
    }

    @Override
    public String getQuotes() {
        Object quotes = getPropertyValue(Style.QUOTES);
        if (quotes == null)
            return null;

        return quotes.toString();
    }

    @Override
    public StyleOptions setQuotes(String quotes) {
        return setQuotes(quotes, false);
    }

    @Override
    public StyleOptions setQuotes(String quotes, boolean important) {
        return setProperty(Style.QUOTES, quotes, important);
    }

    @Override
    public String getResize() {
        Object resize = getPropertyValue(Style.RESIZE);
        if (resize == null)
            return null;

        return resize.toString();
    }

    @Override
    public StyleOptions setResize(String resize) {
        return setResize(resize, false);
    }

    @Override
    public StyleOptions setResize(String resize, boolean important) {
        return setProperty(Style.RESIZE, resize, important);
    }

    @Override
    public Object getRight() {
        Object right = getPropertyValue(Style.RIGHT);
        if (right == null)
            return null;

        return right.toString();
    }

    @Override
    public StyleOptions setRight(Object right) {
        return setRight(right, false);
    }

    @Override
    public StyleOptions setRight(Object right, boolean important) {
        return setProperty(Style.RIGHT, right, important);
    }

    @Override
    public String getTableLayout() {
        Object tableLayout = getPropertyValue(Style.TABLE_LAYOUT);
        if (tableLayout == null)
            return null;

        return tableLayout.toString();
    }

    @Override
    public StyleOptions setTableLayout(String tableLayout) {
        return setTableLayout(tableLayout, false);
    }

    @Override
    public StyleOptions setTableLayout(String tableLayout, boolean important) {
        return setProperty(Style.TABLE_LAYOUT, tableLayout, important);
    }

    @Override
    public String getTextAlign() {
        Object textAlign = getPropertyValue(Style.TEXT_ALIGN);
        if (textAlign == null)
            return null;

        return textAlign.toString();
    }

    @Override
    public StyleOptions setTextAlign(String textAlign) {
        return setTextAlign(textAlign, false);
    }

    @Override
    public StyleOptions setTextAlign(String textAlign, boolean important) {
        return setProperty(Style.TEXT_ALIGN, textAlign, important);
    }

    @Override
    public String getTextDecoration() {
        Object textDecoration = getPropertyValue(Style.TEXT_DECORATION);
        if (textDecoration == null)
            return null;

        return textDecoration.toString();
    }

    @Override
    public StyleOptions setTextDecoration(String textDecoration) {
        return setTextDecoration(textDecoration, false);
    }

    @Override
    public StyleOptions setTextDecoration(String textDecoration, boolean important) {
        return setProperty(Style.TEXT_DECORATION, textDecoration, important);
    }

    @Override
    public String getTextDecorationColor() {
        Object textDecorationColor = getPropertyValue(Style.TEXT_DECORATION_COLOR);
        if (textDecorationColor == null)
            return null;

        return textDecorationColor.toString();
    }

    @Override
    public StyleOptions setTextDecorationColor(String textDecorationColor) {
        return setTextDecorationColor(textDecorationColor, false);
    }

    @Override
    public StyleOptions setTextDecorationColor(String textDecorationColor, boolean important) {
        return setProperty(Style.TEXT_DECORATION_COLOR, textDecorationColor, important);
    }

    @Override
    public String getTextDecorationLine() {
        Object textDecorationLine = getPropertyValue(Style.TEXT_DECORATION_LINE);
        if (textDecorationLine == null)
            return null;

        return textDecorationLine.toString();
    }

    @Override
    public StyleOptions setTextDecorationLine(String textDecorationLine) {
        return setTextDecorationLine(textDecorationLine, false);
    }

    @Override
    public StyleOptions setTextDecorationLine(String textDecorationLine, boolean important) {
        return setProperty(Style.TEXT_DECORATION_LINE, textDecorationLine, important);
    }

    @Override
    public String getTextDecorationStyle() {
        Object textDecorationStyle = getPropertyValue(Style.TEXT_DECORATION_STYLE);
        if (textDecorationStyle == null)
            return null;

        return textDecorationStyle.toString();
    }

    @Override
    public StyleOptions setTextDecorationStyle(String textDecorationStyle) {
        return setTextDecorationStyle(textDecorationStyle, false);
    }

    @Override
    public StyleOptions setTextDecorationStyle(String textDecorationStyle, boolean important) {
        return setProperty(Style.TEXT_DECORATION_STYLE, textDecorationStyle, important);
    }

    @Override
    public String getTextIndent() {
        Object textIndent = getPropertyValue(Style.TEXT_INDENT);
        if (textIndent == null)
            return null;

        return textIndent.toString();
    }

    @Override
    public StyleOptions setTextIndent(String textIndent) {
        return setTextIndent(textIndent, false);
    }

    @Override
    public StyleOptions setTextIndent(String textIndent, boolean important) {
        return setProperty(Style.TEXT_INDENT, textIndent, important);
    }

    @Override
    public String getTextOverflow() {
        Object textOverflow = getPropertyValue(Style.TEXT_OVERFLOW);
        if (textOverflow == null)
            return null;

        return textOverflow.toString();
    }

    @Override
    public StyleOptions setTextOverflow(String textOverflow) {
        return setTextOverflow(textOverflow, false);
    }

    @Override
    public StyleOptions setTextOverflow(String textOverflow, boolean important) {
        return setProperty(Style.TEXT_OVERFLOW, textOverflow, important);
    }

    @Override
    public String getTextShadow() {
        Object textShadow = getPropertyValue(Style.TEXT_SHADOW);
        if (textShadow == null)
            return null;

        return textShadow.toString();
    }

    @Override
    public StyleOptions setTextShadow(String textShadow) {
        return setTextShadow(textShadow, false);
    }

    @Override
    public StyleOptions setTextShadow(String textShadow, boolean important) {
        return setProperty(Style.TEXT_SHADOW, textShadow, important);
    }

    @Override
    public String getTextTransform() {
        Object textTransform = getPropertyValue(Style.TEXT_TRANSFORM);
        if (textTransform == null)
            return null;

        return textTransform.toString();
    }

    @Override
    public StyleOptions setTextTransform(String textTransform) {
        return setTextTransform(textTransform, false);
    }

    @Override
    public StyleOptions setTextTransform(String textTransform, boolean important) {
        return setProperty(Style.TEXT_TRANSFORM, textTransform, important);
    }

    @Override
    public Object getTop() {
        Object top = getPropertyValue(Style.TOP);
        if (top == null)
            return null;

        return top.toString();
    }

    @Override
    public StyleOptions setTop(Object top) {
        return setTop(top, false);
    }

    @Override
    public StyleOptions setTop(Object top, boolean important) {
        return setProperty(Style.TOP, top, important);
    }

    @Override
    public String getTransform() {
        Object transform = getPropertyValue(Style.TRANSFORM);
        if (transform == null)
            return null;

        return transform.toString();
    }

    @Override
    public StyleOptions setTransform(String transform) {
        return setTransform(transform, false);
    }

    @Override
    public StyleOptions setTransform(String transform, boolean important) {
        return setProperty(Style.TRANSFORM, transform, important);
    }

    @Override
    public Object getTransformOrigin() {
        Object transformOrigin = getPropertyValue(Style.TRANSFORM_ORIGIN);
        if (transformOrigin == null)
            return null;

        return transformOrigin.toString();
    }

    @Override
    public StyleOptions setTransformOrigin(Object transformOrigin) {
        return setTransformOrigin(transformOrigin, false);
    }

    @Override
    public StyleOptions setTransformOrigin(Object transformOrigin, boolean important) {
        return setProperty(Style.TRANSFORM_ORIGIN, transformOrigin, important);
    }

    @Override
    public String getTransformStyle() {
        Object transformStyle = getPropertyValue(Style.TRANSFORM_STYLE);
        if (transformStyle == null)
            return null;

        return transformStyle.toString();
    }

    @Override
    public StyleOptions setTransformStyle(String transformStyle) {
        return setTransformStyle(transformStyle, false);
    }

    @Override
    public StyleOptions setTransformStyle(String transformStyle, boolean important) {
        return setProperty(Style.TRANSFORM_STYLE, transformStyle, important);
    }

    @Override
    public String getTransition() {
        Object transition = getPropertyValue(Style.TRANSITION);
        if (transition == null)
            return null;

        return transition.toString();
    }

    @Override
    public StyleOptions setTransition(String transition) {
        return setTransition(transition, false);
    }

    @Override
    public StyleOptions setTransition(String transition, boolean important) {
        return setProperty(Style.TRANSITION, transition, important);
    }

    @Override
    public String getTransitionDelay() {
        Object transitionDelay = getPropertyValue(Style.TRANSITION_DELAY);
        if (transitionDelay == null)
            return null;

        return transitionDelay.toString();
    }

    @Override
    public StyleOptions setTransitionDelay(String transitionDelay) {
        return setTransitionDelay(transitionDelay, false);
    }

    @Override
    public StyleOptions setTransitionDelay(String transitionDelay, boolean important) {
        return setProperty(Style.TRANSITION_DELAY, transitionDelay, important);
    }

    @Override
    public String getTransitionDuration() {
        Object transitionDuration = getPropertyValue(Style.TRANSITION_DURATION);
        if (transitionDuration == null)
            return null;

        return transitionDuration.toString();
    }

    @Override
    public StyleOptions setTransitionDuration(String transitionDuration) {
        return setTransitionDuration(transitionDuration, false);
    }

    @Override
    public StyleOptions setTransitionDuration(String transitionDuration, boolean important) {
        return setProperty(Style.TRANSITION_DURATION, transitionDuration, important);
    }

    @Override
    public String getTransitionProperty() {
        Object transitionProperty = getPropertyValue(Style.TRANSITION_PROPERTY);
        if (transitionProperty == null)
            return null;

        return transitionProperty.toString();
    }

    @Override
    public StyleOptions setTransitionProperty(String transitionProperty) {
        return setTransitionProperty(transitionProperty, false);
    }

    @Override
    public StyleOptions setTransitionProperty(String transitionProperty, boolean important) {
        return setProperty(Style.TRANSITION_PROPERTY, transitionProperty, important);
    }

    @Override
    public String getTransitionTimingFunction() {
        Object transitionTimingFunction = getPropertyValue(Style.TRANSITION_TIMING_FUNCTION);
        if (transitionTimingFunction == null)
            return null;

        return transitionTimingFunction.toString();
    }

    @Override
    public StyleOptions setTransitionTimingFunction(String transitionTimingFunction) {
        return setTransitionTimingFunction(transitionTimingFunction, false);
    }

    @Override
    public StyleOptions setTransitionTimingFunction(String transitionTimingFunction, boolean important) {
        return setProperty(Style.TRANSITION_TIMING_FUNCTION, transitionTimingFunction, important);
    }

    @Override
    public String getUnicodeBidi() {
        Object unicodeBidi = getPropertyValue(Style.UNICODE_BIDI);
        if (unicodeBidi == null)
            return null;

        return unicodeBidi.toString();
    }

    @Override
    public StyleOptions setUnicodeBidi(String unicodeBidi) {
        return setUnicodeBidi(unicodeBidi, false);
    }

    @Override
    public StyleOptions setUnicodeBidi(String unicodeBidi, boolean important) {
        return setProperty(Style.UNICODE_BIDI, unicodeBidi, important);
    }

    @Override
    public String getUserSelect() {
        Object userSelect = getPropertyValue(Style.USER_SELECT);
        if (userSelect == null)
            return null;

        return userSelect.toString();
    }

    @Override
    public StyleOptions setUserSelect(String userSelect) {
        return setUserSelect(userSelect, false);
    }

    @Override
    public StyleOptions setUserSelect(String userSelect, boolean important) {
        return setProperty(Style.USER_SELECT, userSelect, important);
    }

    @Override
    public String getVerticalAlign() {
        Object verticalAlign = getPropertyValue(Style.VERTICAL_ALIGN);
        if (verticalAlign == null)
            return null;

        return verticalAlign.toString();
    }

    @Override
    public StyleOptions setVerticalAlign(String verticalAlign) {
        return setVerticalAlign(verticalAlign, false);
    }

    @Override
    public StyleOptions setVerticalAlign(String verticalAlign, boolean important) {
        return setProperty(Style.VERTICAL_ALIGN, verticalAlign, important);
    }

    @Override
    public String getVisibility() {
        Object visibility = getPropertyValue(Style.VISIBILITY);
        if (visibility == null)
            return null;

        return visibility.toString();
    }

    @Override
    public StyleOptions setVisibility(String visibility) {
        return setVisibility(visibility, false);
    }

    @Override
    public StyleOptions setVisibility(String visibility, boolean important) {
        return setProperty(Style.VISIBILITY, visibility, important);
    }

    @Override
    public String getWhiteSpace() {
        Object whiteSpace = getPropertyValue(Style.WHITE_SPACE);
        if (whiteSpace == null)
            return null;

        return whiteSpace.toString();
    }

    @Override
    public StyleOptions setWhiteSpace(String whiteSpace) {
        return setWhiteSpace(whiteSpace, false);
    }

    @Override
    public StyleOptions setWhiteSpace(String whiteSpace, boolean important) {
        return setProperty(Style.WHITE_SPACE, whiteSpace, important);
    }

    @Override
    public String getWidows() {
        Object widows = getPropertyValue(Style.WIDOWS);
        if (widows == null)
            return null;

        return widows.toString();
    }

    @Override
    public StyleOptions setWidows(String widows) {
        return setWidows(widows, false);
    }

    @Override
    public StyleOptions setWidows(String widows, boolean important) {
        return setProperty(Style.WIDOWS, widows, important);
    }

    @Override
    public Object getWidth() {
        Object width = getPropertyValue(Style.WIDTH);
        if (width == null)
            return null;

        return width.toString();
    }

    @Override
    public StyleOptions setWidth(Object width) {
        return setWidth(width, false);
    }

    @Override
    public StyleOptions setWidth(Object width, boolean important) {
        return setProperty(Style.WIDTH, width, important);
    }

    @Override
    public String getWillChange() {
        Object willChange = getPropertyValue(Style.WILL_CHANGE);
        if (willChange == null)
            return null;

        return willChange.toString();
    }

    @Override
    public StyleOptions setWillChange(String willChange) {
        return setWillChange(willChange, false);
    }

    @Override
    public StyleOptions setWillChange(String willChange, boolean important) {
        return setProperty(Style.WILL_CHANGE, willChange, important);
    }

    @Override
    public String getWordSpacing() {
        Object wordSpacing = getPropertyValue(Style.WORD_SPACING);
        if (wordSpacing == null)
            return null;

        return wordSpacing.toString();
    }

    @Override
    public StyleOptions setWordSpacing(String wordSpacing) {
        return setWordSpacing(wordSpacing, false);
    }

    @Override
    public StyleOptions setWordSpacing(String wordSpacing, boolean important) {
        return setProperty(Style.WORD_SPACING, wordSpacing, important);
    }

    @Override
    public String getWordWrap() {
        Object wordWrap = getPropertyValue(Style.WORD_WRAP);
        if (wordWrap == null)
            return null;

        return wordWrap.toString();
    }

    @Override
    public StyleOptions setWordWrap(String wordWrap) {
        return setWordWrap(wordWrap, false);
    }

    @Override
    public StyleOptions setWordWrap(String wordWrap, boolean important) {
        return setProperty(Style.WORD_WRAP, wordWrap, important);
    }

    @Override
    public Object getZIndex() {
        Object zIndex = getPropertyValue(Style.Z_INDEX);
        if (zIndex == null)
            return null;

        return zIndex.toString();
    }

    @Override
    public StyleOptions setZIndex(Object zIndex) {
        return setZIndex(zIndex, false);
    }

    @Override
    public StyleOptions setZIndex(Object zIndex, boolean important) {
        return setProperty(Style.Z_INDEX, zIndex, important);
    }

    @Override
    public Object getRowGap() {
        Object rowGap = getPropertyValue(Style.ROW_GAP);
        if (rowGap == null)
            return null;

        return rowGap.toString();
    }

    @Override
    public StyleOptions setRowGap(Object rowGap) {
        return setRowGap(rowGap, false);
    }

    @Override
    public StyleOptions setRowGap(Object rowGap, boolean important) {
        return setProperty(Style.ROW_GAP, rowGap, important);
    }

    @Override
    public Object getColumnGap() {
        Object columnGap = getPropertyValue(Style.COLUMN_GAP);
        if (columnGap == null)
            return null;

        return columnGap.toString();
    }

    @Override
    public StyleOptions setColumnGap(Object columnGap) {
        return setColumnGap(columnGap, false);
    }

    @Override
    public StyleOptions setColumnGap(Object columnGap, boolean important) {
        return setProperty(Style.COLUMN_GAP, columnGap, important);
    }
}