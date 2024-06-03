package net.btbob.bensaddons.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModFlowerPlacement {

    private static List<PlacementModifier> flowerPlacement(RarityFilter pChance, PlacementModifier heightmap) {
        return List.of(pChance, InSquarePlacement.spread(), heightmap, BiomeFilter.biome());

        }

    public static List<PlacementModifier> commonFlowerPlacement(PlacementModifier pHeightRange) {
        return flowerPlacement(RarityFilter.onAverageOnceEvery(32), pHeightRange);
    }


}
