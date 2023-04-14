package me.kuzhcola.astrochem;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AstroChem implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("astrochem");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("AstroChem Initialized.");
	}

	// Oil Phial
	public static final Item OIL_PHIAL =
			Registry.register(Registry.ITEM, new Identifier("astrochem", "oil_phial"),
					new Item(new FabricItemSettings()));

	// Cryo Fuel Phial
	public static final Item CRYO_FUEL_PHIAL =
			Registry.register(Registry.ITEM, new Identifier("astrochem", "cryo_fuel_phial"),
					new Item(new FabricItemSettings()));
}
