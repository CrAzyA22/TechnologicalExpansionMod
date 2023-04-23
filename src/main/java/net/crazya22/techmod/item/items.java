package net.crazya22.techmod.item;

import net.crazya22.techmod.TechMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class items {

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TechMod.MOD_ID, name), item);
    }


    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.TechIngredients, STEEL_INGOT);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        TechMod.LOGGER.debug("Registering items for" + TechMod.MOD_ID);

        addItemsToItemGroup();
    }
}
