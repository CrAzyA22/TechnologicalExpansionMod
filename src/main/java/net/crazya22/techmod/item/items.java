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
    public static final Item STEEL_NUGGET = registerItem("steel_nugget", new Item(new FabricItemSettings()));

    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new FabricItemSettings()));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget", new Item(new FabricItemSettings()));

    public static final Item BRASS_INGOT = registerItem("brass_ingot", new Item(new FabricItemSettings()));
    public static final Item BRASS_NUGGET = registerItem("brass_nugget", new Item(new FabricItemSettings()));

    public static final Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget", new Item(new FabricItemSettings()));

    public static final Item SIGNALIUM_INGOT = registerItem("signalium_ingot", new Item(new FabricItemSettings()));
    public static final Item SIGNALIUM_NUGGET = registerItem("signalium_nugget", new Item(new FabricItemSettings()));

    public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot", new Item(new FabricItemSettings()));
    public static final Item ELECTRUM_NUGGET = registerItem("electrum_nugget", new Item(new FabricItemSettings()));

    public static final Item TIN_INGOT = registerItem("tin_ingot", new Item(new FabricItemSettings()));
    public static final Item TIN_NUGGET = registerItem("tin_nugget", new Item(new FabricItemSettings()));

    public static final Item URANIUM_INGOT = registerItem("uranium_ingot", new Item(new FabricItemSettings()));
    public static final Item URANIUM_NUGGET = registerItem("uranium_nugget", new Item(new FabricItemSettings()));

    public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new FabricItemSettings()));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget", new Item(new FabricItemSettings()));

    public static final Item ENDERIUM_INGOT = registerItem("enderium_ingot", new Item(new FabricItemSettings()));
    public static final Item ENDERIUM_NUGGET = registerItem("enderium_nugget", new Item(new FabricItemSettings()));

    public static final Item OSMIUM_INGOT = registerItem("osmium_ingot", new Item(new FabricItemSettings()));
    public static final Item OSMIUM_NUGGET = registerItem("osmium_nugget", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TechMod.MOD_ID, name), item);
    }


    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.TechIngredients, BRASS_INGOT);
        addToItemGroup(ItemGroups.TechIngredients, BRASS_NUGGET);
        addToItemGroup(ItemGroups.TechIngredients, BRONZE_INGOT);
        addToItemGroup(ItemGroups.TechIngredients, BRONZE_NUGGET);
        addToItemGroup(ItemGroups.TechIngredients, ELECTRUM_INGOT);
        addToItemGroup(ItemGroups.TechIngredients, ELECTRUM_NUGGET);
        addToItemGroup(ItemGroups.TechIngredients, ENDERIUM_INGOT);
        addToItemGroup(ItemGroups.TechIngredients, ENDERIUM_NUGGET);
        addToItemGroup(ItemGroups.TechIngredients, LEAD_INGOT);
        addToItemGroup(ItemGroups.TechIngredients, LEAD_NUGGET);
        addToItemGroup(ItemGroups.TechIngredients, OSMIUM_INGOT);
        addToItemGroup(ItemGroups.TechIngredients, OSMIUM_NUGGET);
        addToItemGroup(ItemGroups.TechIngredients, SIGNALIUM_INGOT);
        addToItemGroup(ItemGroups.TechIngredients, SIGNALIUM_NUGGET);
        addToItemGroup(ItemGroups.TechIngredients, SILVER_INGOT);
        addToItemGroup(ItemGroups.TechIngredients, SILVER_NUGGET);
        addToItemGroup(ItemGroups.TechIngredients, STEEL_INGOT);
        addToItemGroup(ItemGroups.TechIngredients, STEEL_NUGGET);
        addToItemGroup(ItemGroups.TechIngredients, TIN_INGOT);
        addToItemGroup(ItemGroups.TechIngredients, TIN_NUGGET);
        addToItemGroup(ItemGroups.TechIngredients, URANIUM_INGOT);
        addToItemGroup(ItemGroups.TechIngredients, URANIUM_NUGGET);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        TechMod.LOGGER.debug("Registering items for" + TechMod.MOD_ID);

        addItemsToItemGroup();
    }
}
