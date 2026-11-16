package dev.reuise.web.core.hydration;

import java.util.Map;
import dev.reuise.core.State;

public interface ClientConfigurationOptions {
    String getClientConfigurationType();

    void restoreClientConfiguration(Map<String, Object> options);

    default void restoreClientConfiguration(Map<String, Object> options, State state) {
        if (state != null)
            throw new IllegalArgumentException("This configuration does not support stateful options");
        restoreClientConfiguration(options);
    }
}
