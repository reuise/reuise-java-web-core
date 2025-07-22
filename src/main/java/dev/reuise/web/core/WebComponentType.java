package dev.reuise.web.core;
import dev.reuise.core.ComponentType;
public interface WebComponentType<C extends WebComponent, O extends WebComponentOptions> extends ComponentType<C, O> , WebComponent , WebComponentPart {}