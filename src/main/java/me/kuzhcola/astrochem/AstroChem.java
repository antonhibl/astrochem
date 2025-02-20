package me.kuzhcola.astrochem;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AstroChem implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("astrochem");

	@Override
	public void onInitialize() {
		// Log Initialization
		LOGGER.info("AstroChem Initialized.");
	}

	// Petroleum
	public static final Item PETROLEUM =
			Registry.register(Registry.ITEM, new Identifier("astrochem", "petroleum"),
					new Item(new FabricItemSettings()));

	// Benzene
	public static final Item BENZENE =
			Registry.register(Registry.ITEM, new Identifier("astrochem", "benzene"),
					new Item(new FabricItemSettings()));

	// Methanol
	public static final Item METHANOL =
			Registry.register(Registry.ITEM, new Identifier("astrochem", "methanol"),
					new Item(new FabricItemSettings()));

	// Nitro-Methane
	public static final Item NITRO_METHANE =
			Registry.register(Registry.ITEM, new Identifier("astrochem", "nitro_methane"),
					new Item(new FabricItemSettings()));

	// Cryo Fuel Phial
	public static final Item CRYO_FLUID_PHIAL =
			Registry.register(Registry.ITEM, new Identifier("astrochem", "cryo_fluid_phial"),
					new Item(new FabricItemSettings()));

	// Cryogenic Nitrogen
	public static final Item CRYOGENIC_NITROGEN =
			Registry.register(Registry.ITEM, new Identifier("astrochem", "cryogenic_nitrogen"),
					new Item(new FabricItemSettings()));

	// Cryogenic Oxygen
	public static final Item CRYOGENIC_OXYGEN =
			Registry.register(Registry.ITEM, new Identifier("astrochem", "cryogenic_oxygen"),
					new Item(new FabricItemSettings()));

	// Desh Dust
	public static final Item DESH_DUST =
			Registry.register(Registry.ITEM, new Identifier("astrochem", "desh_dust"),
					new Item(new FabricItemSettings()));

	// Ostrum Dust
	public static final Item OSTRUM_DUST =
			Registry.register(Registry.ITEM, new Identifier("astrochem", "ostrum_dust"),
					new Item(new FabricItemSettings()));

	// Calorite Dust
	public static final Item CALORITE_DUST =
			Registry.register(Registry.ITEM, new Identifier("astrochem", "calorite_dust"),
					new Item(new FabricItemSettings()));
}
