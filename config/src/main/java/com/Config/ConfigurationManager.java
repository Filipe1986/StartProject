package com.Config;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class ConfigurationManager {

    private final AppConfig appConfig;

    public ConfigurationManager() {
        try (InputStream inputStream = getClass().getResourceAsStream("/application.conf")) {
            if (inputStream == null) {
                throw new RuntimeException("Could not find configuration file: application.conf");
            }

            ObjectMapper objectMapper = new ObjectMapper();
            appConfig = objectMapper.readValue(inputStream, AppConfig.class);
        } catch (IOException e) {
            throw new RuntimeException("Error while loading configuration file", e);
        }
    }

    public AppConfig getAppConfig() {
        return appConfig;
    }
}
