package net.btbob.bensaddons.item;

import net.btbob.bensaddons.BensAddons;
import net.btbob.bensaddons.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {

    public static final Tier PLATINUM = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8, 3,10,
                    ModTags.Blocks.NEEDS_PLATINUM_TOOL, ()-> Ingredient.of(ModItems.PLATINUM_INGOT.get())),
            new ResourceLocation(BensAddons.MOD_ID, "platinum"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));



    public static final Tier JADE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1894, 13, 5,10,
                    ModTags.Blocks.NEEDS_JADE_TOOL, ()-> Ingredient.of(ModItems.JADE.get())),
            new ResourceLocation(BensAddons.MOD_ID, "jade"), List.of(ModToolTiers.PLATINUM), List.of(Tiers.DIAMOND));

    public static final Tier PYRITE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8, 3,10,
                    ModTags.Blocks.NEEDS_JADE_TOOL, ()-> Ingredient.of(ModItems.PYRITE_INGOT.get())),
            new ResourceLocation(BensAddons.MOD_ID, "pyrite"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE));

    public static final Tier SHELL = TierSortingRegistry.registerTier(
            new ForgeTier(1, 131, 7, 1.0F, 5, null,()-> Ingredient.of(ModItems.SHELL.get())),
            new ResourceLocation(BensAddons.MOD_ID, "shell"), List.of(Tiers.STONE), List.of(Tiers.IRON));
}
