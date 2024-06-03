package net.btbob.bensaddons.worldgen;

import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import java.util.List;

public class ModGeodePlacement {
    private static List<PlacementModifier> geodePlacement(RarityFilter pChance, PlacementModifier heightmap) {
        return List.of(pChance, InSquarePlacement.spread(), heightmap, BiomeFilter.biome());

    }
//        register(context, RUBY_GEODE_PLACED, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_GEODE_KEY),
//         HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(6), VerticalAnchor.absolute(30))
    public static List<PlacementModifier> commonGeodePlacement(PlacementModifier pHeightRange) {
        return geodePlacement(RarityFilter.onAverageOnceEvery(24), pHeightRange);
    }
}
