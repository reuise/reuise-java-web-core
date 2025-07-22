package dev.reuise.web.core.event;
import dev.reuise.core.event.EventType;
public interface Event extends dev.reuise.core.event.Event {
    public static final EventType MOUSE_OVER = new EventType("mouseover");

    public static final EventType BLUR = new EventType("blur");

    public static final EventType DROP = new EventType("drop");

    public static final EventType DRAG_ENTER = new EventType("dragenter");

    public static final EventType CHANGE = new EventType("change");

    public static final EventType INPUT = new EventType("input");

    public static final EventType MOUSE_UP = new EventType("mouseup");

    public static final EventType SUBMITTED = new EventType("submitted");

    public static final EventType DRAG_LEAVE = new EventType("dragleave");

    public static final EventType DRAG_OVER = new EventType("dragover");

    public static final EventType DRAG_END = new EventType("dragend");

    public static final EventType MOUSE_ENTER = new EventType("mouseenter");

    public static final EventType DRAG = new EventType("drag");

    public static final EventType MOUSE_DOWN = new EventType("mousedown");

    public static final EventType DRAG_START = new EventType("dragstart");

    public static final EventType MOUSE_LEAVE = new EventType("mouseleave");

    public static final EventType MOUSE_MOVE = new EventType("mousemove");

    public static final EventType MOUSE_OUT = new EventType("mouseout");
}