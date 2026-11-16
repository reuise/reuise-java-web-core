package dev.reuise.web.core.hydration;

import java.util.Map;

/**
 * Versioned SSR configuration for portable writable scalar/enum settings and states.
 * Native attribute-backed values are restored from the DOM, not duplicated here.
 * Responsive, interaction and media-query states retain their option values.
 * Object-valued options transport scalar CSS sizes/values, not arbitrary Java objects.
 * Rendered styles stay in the SSR cascade; adoption does not replay those declarations.
 * Component references, application callbacks and collections remain client-side or
 * use their specialised markup restoration.
 */
public interface ClientConfigurationSource {
    Map<String, Object> getClientConfiguration();
}
