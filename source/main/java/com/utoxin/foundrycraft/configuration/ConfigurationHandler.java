package com.utoxin.foundrycraft.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
    public static void init(File configFile) {
        Configuration configuration = new Configuration(configFile);

        try {
            configuration.load();
        } catch (Exception e) {
            // TODO: Log Exception
        } finally {
            configuration.save();
        }
    }
}
