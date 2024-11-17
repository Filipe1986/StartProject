package com.Config;

public class AppConfig {
    private String appName;
    private String version;
    private Settings settings;


    public static class Settings {
        private boolean featureEnabled;
        private int maxConnections;

        public boolean isFeatureEnabled() {
            return featureEnabled;
        }

        public int getMaxConnections() {
            return maxConnections;
        }

    }

    // Getters and Setters for AppConfig
    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }

    public Settings getSettings() {
        return settings;
    }

}

