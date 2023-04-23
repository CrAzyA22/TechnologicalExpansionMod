package net.crazya22.techmod;

import net.crazya22.techmod.item.ItemGroups;
import net.crazya22.techmod.item.items;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TechMod implements ModInitializer {
	public static final String MOD_ID = "techmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ItemGroups.registerItemGroup();
		items.registerModItems();

	}
}
