package net.tylrae.smokeybux.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tylrae.smokeybux.SmokeyBux;

public class ModItems {

        public static final Item SMOKEY_BUX = registerItem("smokey_bux",
                new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(SmokeyBux.MOD_ID, name), item);
    }
    public static void registerModItems() {
        SmokeyBux.LOGGER.debug("Registering Mod Items for " + SmokeyBux.MOD_ID);
    }

}
