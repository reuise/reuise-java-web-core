package dev.reuise.web.core.hydration;

import java.util.Map;

/**
 * Versioned SSR configuration for portable writable scalar/enum settings.
 * Native attribute-backed values are restored from the DOM, not duplicated here.
 * Stateful styles, component references, application callbacks and collections are
 * not transported by this schema; specialised markup restoration remains available.
 */
public interface ClientConfigurationSource {
    Map<String, Object> getClientConfiguration();
}
