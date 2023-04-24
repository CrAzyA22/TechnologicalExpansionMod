package net.crazya22.techmod.block;

import net.crazya22.techmod.TechMod;
import net.crazya22.techmod.item.ItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class blocks {

    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20.0f, 6.0f).requiresTool()), ItemGroups.TechIngredients);

    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20.0f, 6.0f).requiresTool()), ItemGroups.TechIngredients);

    public static final Block BRASS_BLOCK = registerBlock("brass_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20.0f, 6.0f).requiresTool()), ItemGroups.TechIngredients);

    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20.0f, 6.0f).requiresTool()), ItemGroups.TechIngredients);

    public static final Block SIGNALIUM_BLOCK = registerBlock("signalium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20.0f, 6.0f).requiresTool()), ItemGroups.TechIngredients);

    public static final Block ELECTRUM_BLOCK = registerBlock("electrum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20.0f, 6.0f).requiresTool()), ItemGroups.TechIngredients);

    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20.0f, 6.0f).requiresTool()), ItemGroups.TechIngredients);

    public static final Block URANIUM_BLOCK = registerBlock("uranium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20.0f, 6.0f).requiresTool()), ItemGroups.TechIngredients);

    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20.0f, 6.0f).requiresTool()), ItemGroups.TechIngredients);

    public static final Block ENDERIUM_BLOCK = registerBlock("enderium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20.0f, 6.0f).requiresTool()), ItemGroups.TechIngredients);

    public static final Block OSMIUM_BLOCK = registerBlock("osmium_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(20.0f, 6.0f).requiresTool()), ItemGroups.TechIngredients);
    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(TechMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {

        Item item = Registry.register(Registries.ITEM, new Identifier(TechMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        TechMod.LOGGER.debug("Registering blocks for" + TechMod.MOD_ID);
    }

}
