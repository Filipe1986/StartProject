package com.Config;

public class App {
    public static void main(String[] args) {
        ConfigurationManager configManager = new ConfigurationManager();
        AppConfig config = configManager.getAppConfig();

        // Print out some configuration values to verify
        System.out.println("App Name: " + config.getAppName());
        System.out.println("Version: " + config.getVersion());
        System.out.println("Feature Enabled: " + config.getSettings().isFeatureEnabled());
        System.out.println("Max Connections: " + config.getSettings().getMaxConnections());
        

    }
}
