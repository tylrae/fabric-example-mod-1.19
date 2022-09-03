package net.tylrae.smokeybux;

import net.fabricmc.api.ModInitializer;
import net.tylrae.smokeybux.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class SmokeyBux implements ModInitializer {
	public static final String MOD_ID = "smokeybux";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
