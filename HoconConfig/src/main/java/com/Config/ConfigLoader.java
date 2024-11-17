package com.Config;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class ConfigLoader {

    static Config config;

    public static Config getAppConfig() {
        if(config == null){
            config = ConfigFactory.load("application.conf");
        }
        return config.getConfig("app");
    }
}
