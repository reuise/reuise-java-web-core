package dev.reuise.web.core.hydration;

import java.util.Map;

public interface ClientConfigurationOptions {
    String getClientConfigurationType();

    void restoreClientConfiguration(Map<String, Object> options);
}
