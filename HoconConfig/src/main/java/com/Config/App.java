package com.Config;

import com.typesafe.config.Config;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Config appConfig = ConfigLoader.getAppConfig();

        System.out.println("App Name: " + appConfig.getString("appName"));
        System.out.println("Version: " + appConfig.getString("version"));
        System.out.println("Feature Enabled: " + appConfig.getConfig("settings").getBoolean("featureEnabled"));
        System.out.println("Max Connections: " + appConfig.getConfig("settings").getInt("maxConnections"));

    }
}
