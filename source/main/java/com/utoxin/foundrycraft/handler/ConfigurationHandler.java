package com.utoxin.foundrycraft.handler;

import com.utoxin.foundrycraft.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler {
	public static Configuration configuration;

	public static boolean testValue = false;

	public static void init(File configFile) {
		if (configuration == null) {
			configuration = new Configuration(configFile);
		}

		loadConfiguration();
	}

	public static void loadConfiguration() {
		testValue = configuration.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value.");

		if (configuration.hasChanged()) {
			configuration.save();
		}
	}

	@SubscribeEvent
	public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
			loadConfiguration();
		}
	}
}
