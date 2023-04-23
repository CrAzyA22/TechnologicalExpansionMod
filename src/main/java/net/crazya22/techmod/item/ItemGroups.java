package net.crazya22.techmod.item;

import net.crazya22.techmod.TechMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroups {

    public static ItemGroup TechIngredients;

    public static void registerItemGroup() {
        TechIngredients = FabricItemGroup.builder(new Identifier(TechMod.MOD_ID, "tech_ingredients"))
                .displayName(Text.translatable("itemgroup.tech_ingredients"))
                .icon(() -> new ItemStack(items.STEEL_INGOT))
                .build();
    }

}
